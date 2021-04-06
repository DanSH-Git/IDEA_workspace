package Servlet;

/**
 * @author asus1
 * @create 2021/2/27 16:41
 * Servlet是一个接口，定义了java类被浏览器访问到的方式，加载动态资源时，某些java类仅被识别到后执行
 *自定义类实现Servlet接口，复写方法
 *在 web-inf下web.xml中配置servlet
 *    <servlet>
 *         <servlet-name>demo1</servlet-name> 名称
 *         <servlet-class>cn.dsh.web.servlet.servletdemo</servlet-class> 文件路径
 *               tomcat将全类名以字节码文件加载进内存 Class.forName()
 *               创建对象cls.newInstance()
 *               调用方法service(implement servlet)
 *     </servlet>
 *     <servlet-mapping> 映射
 *         <servlet-name>demo1</servlet-name>
 *         <url-pattern>/demo1</url-pattern>
 *     </servlet-mapping>
 *  配置原理：
 *      1.服务器接收到客户端请求后，解析url路径，获取访问的Servlet的资源路径
 *      2.查找web.xml文件，是否有对应的url-pattern标签体
 *      3.若有，则找对全类名servlet-class 将字节码文件加载进内存，创建对象
 *      4.调用service方法
 *
 *  生命周期：
 *      init:
 *      <load-on-startup>-1</load-on-startup> 负数 则第一次被访问执行，非负数 则服务器启动时执行
 *      service
 *      destroy
 *
 *    servlet中的init方法，只执行一次，说明一个servlet在内存中值存在一个对象。为了防止线程安全问题，尽量不要定义
 * 成员变量，或异步修改值
 */
public class ServletIntro {
}
