package Request;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Enumeration;

/**
 * @author asus1
 * @create 2021/3/3 16:56
 */
@WebServlet("/RequestDemo1")
public class RequestDemo1 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        获取请求行数据
        String method = request.getMethod();
        String contextPath = request.getContextPath();
        String servletPath = request.getServletPath();
        String requestURI = request.getRequestURI();
        String protocol = request.getProtocol();
        String remoteAddr = request.getRemoteAddr();
        System.out.println(method);
        System.out.println(contextPath);
        System.out.println(servletPath);
        System.out.println(requestURI);
        System.out.println(protocol);
        System.out.println(remoteAddr);
//        获取请求头数据
//        获取请求头名称
        Enumeration<String> headerNames = request.getHeaderNames();
        while(headerNames.hasMoreElements()){
            String headername = headerNames.nextElement();
//            根据请求头获取值
            String headerValue = request.getHeader(headername);
            System.out.println("headername...:"+headername+",value...:"+headerValue);
        }

        System.out.println("refffffff:"+request.getHeader("referer"));

        }
    }

