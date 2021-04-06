package Servlet;

import dao.UserDao;
import domain.User;
import org.apache.commons.beanutils.BeanUtils;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Map;

/**
 * @author asus1
 * @create 2021/3/9 14:43
 */

/**
 * BeanUtils工具类用于简化数据封装
 * 要求：
 *   类必须被public修饰
 *   必须是空参构造器
 *   成员变量必须被private修饰
 *   提供公共的getter setter方法
 * 作用：
 *      封装数据，
 *      setter和getter方法截取后产物。
 * popolate（Object obj，Map map）将map的键值对信息，封装到其对应的JavaBean对象中
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        设置编码
        request.setCharacterEncoding("utf-8");
////        获取请求参数
//        String username=request.getParameter("username");
//        String password=request.getParameter("password");
////        封装user对象
//        User loginUser=new User();
//        loginUser.setUsername(username);
//        loginUser.setPassword(password);
        Map<String,String[]> map=request.getParameterMap();
        User loginUser=new User();
        try {
            BeanUtils.populate(loginUser,map);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
//        调用UserDao的login方法
        UserDao dao=new UserDao();
        User user=dao.login(loginUser);
//        判断User
        if(user==null){
            request.getRequestDispatcher("/failServlet").forward(request,response);
        }
        else{
            request.setAttribute("user",user);
            request.getRequestDispatcher("/successServlet").forward(request,response);
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request,response);
    }
}
