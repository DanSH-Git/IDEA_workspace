package servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author asus1
 * @create 2021/3/1 20:25
 * service方法操作
 * 1。获取数据：get post 封装格式与位置不同
 *    首先获取请求方式 String method=req.getMethod();
 *    根据不同请求方式以不同方式解析数据。
 *    继承HttpServlet对Http协议的封装，先继承，再复写doGet（）{} doPost（）{}即可
 *
 */
@WebServlet("/demo5")
//@WebServlet("/demo5/demo55")多层目录
//@WebServlet("/demo5","/demo55","/demo555") 多个虚拟目录均可访问
//@WebServlet("/demo5/*")  使用*作为通配符，任意字段均可
//@WebServlet("demo5.do")
public class ServletService extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doGet(req, resp);
        System.out.println("doGet");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
        System.out.println("doPost");
    }
}
