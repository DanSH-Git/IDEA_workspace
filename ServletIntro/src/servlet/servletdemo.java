package servlet;

import javax.servlet.*;
import java.io.IOException;

/**
 * @author asus1
 * @create 2021/2/27 16:58
 *
 */
public class servletdemo implements Servlet {
    //创建时执行一次
    @Override
    public void init(ServletConfig servletConfig) throws ServletException {
        System.out.println("init...");
    }
//获取配置对象
    @Override
    public ServletConfig getServletConfig() {
        return null;
    }
//提供服务
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("hellooo servlet");
    }
//获取信息（版本，作者，一般不实现）
    @Override
    public String getServletInfo() {
        return null;
    }
//销毁时执行 执行一次
    @Override
    public void destroy() {
        System.out.println("destroy...");
    }
}
