package servlet;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;

/**
 * @author asus1
 * @create 2021/2/27 20:25
 * 使用webservlet注解从javaee6起，配置WebServlet:@WebServlet(urlPatterns = "/demo2")
 * 或者@WebServlet( "/demo3") 即直接添加虚拟目录
 */
@WebServlet(urlPatterns = "/demo2")
public class servletdemo2 implements Servlet {
    @Override
    public void init(ServletConfig servletConfig) throws ServletException {

    }

    @Override
    public ServletConfig getServletConfig() {
        return null;
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("webServlet-demo2");
    }

    @Override
    public String getServletInfo() {
        return null;
    }

    @Override
    public void destroy() {

    }
}
