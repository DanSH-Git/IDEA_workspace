package Servlet;

/**
 * @author asus1
 * @create 2021/3/3 16:18
 * 1.Tomcat服务器会根据请求url中的资源路径，创建对应的对象
 * 2.Tomcat服务器会创建request和response对象，request对象中封装请求消息数据
 * 3.Tomcat将request和response两个对象传递给service方法，并对service方法进行调用。
 * 4.我们在代码中，通过request对象获取请求消息数据，通过response对象设置响应消息数据
 * 5.服务器根据代码，在浏览器响应前，从response对象中拿代码设置的响应消息数据
 *
 * request和response
 * 1.对象由服务器创建，程序员调用使用
 * 2.request获取请求消息，response设置响应消息。
 *
 * request包含内容：ServletRequest（接口），HttpServletRequest（子接口），RequestFacade类（实现类，由tomcat创建）
 *
 * request获取请求消息：包括
 *          1.请求行 :获取请求行数据
 * 				* GET /day14/demo1?name=zhangsan HTTP/1.1
 * 				* 方法：
 * 					1. 获取请求方式 ：GET
 * 						* String getMethod()
 * 					2. (*)获取虚拟目录：/day14
 * 						* String getContextPath()
 * 					3. 获取Servlet路径: /demo1
 * 						* String getServletPath()
 * 					4. 获取get方式请求参数：name=zhangsan
 * 						* String getQueryString()
 * 					5. （2+3）(*)获取请求URI：/day14/demo1
 * 						* String getRequestURI():		/day14/demo1
 * 						* StringBuffer getRequestURL()  :http://localhost/day14/demo1
 *
 * 						* URL:统一资源定位符 ： http://localhost/day14/demo1	中华人民共和国
 * 						* URI：统一资源标识符 : /day14/demo1					共和国
 * 					6. 获取协议及版本：HTTP/1.1
 * 						* String getProtocol()
 * 					7. 获取客户机的IP地址：
 * 						* String getRemoteAddr()
 *          2.请求头
 *                  Enumerate<String> getHeaderName（）获取所有请求头名称，以迭代器方式存储
 *                  getHeader（String name）根据请求头名称获取对应请求头的值
 *          3.请求体
 *                  获取流对象 BufferedReader getReader（）：获取字符输入流 ，只能操作字符数据。
 *                  ServletInputStream getInputStream（）：获取字节输入流，可操作所有类型数据。
 *其他相关功能：
 *          获取请求参数
 *                      getParameter（String name）获取名称对应参数值
 *                      String[] getParameterValues(String name)根据参数名称获取参数值的数组
 *                      Enumerate<String> getParameterNames 获取所有参数名
 *                      Map<String,String[]> getParameterMap():获取所有参数的Map集合
 *                 乱码：post方式：request.setCharacterEncoding("编码格式")
 *          请求转发 ：资源跳转方式
 *                      request请求转发：RequestDispatcher.getRequestDispatcher(String path)
 *                      requestDisPatcher对象进行转发：forward(ServletRequest request,ServletResponse response)
 *                       特点：
 * 					        1. 浏览器地址栏路径不发生变化
 * 					        2. 只能转发到当前服务器内部资源中。
 * 					        3. 转发是一次请求
 *          共享数据
 *              域对象：有作用范围的对象，在范围内共享数据。
 *              request域：一次请求的范围，用于请求转发的多个资源中共享数据。
 *              方法：
 *                      1.setAttribute(String name,Object obj):存储数据
 *                      2.Object getAttribute(String name):通过键获取值
 *                      3.void removeAttribute(String name):通过键名移除值
 *          获取ServletContext
 *                  ServletContext getServletContext()
 *
 *
 */
public class RequestIntro {
}
