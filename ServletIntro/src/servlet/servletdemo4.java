package servlet;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;

/**
 * @author asus1
 * @create 2021/3/1 20:18
 * 对于其他几个生命周期的，不使用则可以继承GenericServlet接口，只将service做抽象，其余方法做了默认空实现，
 *                      仅复写service接口即可。
 */
@WebServlet("/demo4")
public class servletdemo4 extends GenericServlet {
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {

    }
}
