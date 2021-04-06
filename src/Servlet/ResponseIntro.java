package Servlet;

/**
 * @author DanSH
 * @create 2021/3/16 19:28
 * 响应消息：服务器端发送给客户端的数据
 *  * 1.响应行
 *  *      组成：协议/版本 响应状态码 状态码描述
 *  *      状态码(3位数字) 1xx接收中，询问
 *  *                     2xx成功
 *  *                     3xx重定向（302） 304访问缓存
 *  *                     4xx 客户端错误（路径错误404）（请求方式无对应do方法405）
 *  *                     5xx 服务器端错误（500服务器内部异常）
 *  * 2.响应头
 *  *      组成：名称：值
 *  *      常见响应头
 *  *             Content——type 响应体数据格式及编码格式
 *  *             Content——disposition 以什么格式打开响应体数据
 *  * 3.响应空行
 *  * 4.响应体 ：传输的数据

 *  Response对象
 *  功能：设置响应消息
 *      1.响应行： 设置状态码：setStatus(int sc)
 *      2.响应头： 设置响应头：setHeader（String name,String value)
 *      3.响应体： 获取输出流：
 *                      字符输出流 PrintWriter getWriter（）
 *                      字节输出流 ServletOutPutStream getOUtputStream（）
 *                 使用输出流，将数据输出到浏览器
 *  1. 完成重定向
 * 			* 重定向：资源跳转的方式
 * 			* 代码实现：
 * 				//1. 设置状态码为302
 * 		        response.setStatus(302);
 * 		        //2.设置响应头location
 * 		        response.setHeader("location","/day15/responseDemo2");
 *
 *
 * 		        //简单的重定向方法
 * 		        response.sendRedirect("/day15/responseDemo2");
 *
 * 			* 重定向的特点:redirect
 * 				1. 地址栏发生变化
 * 				2. 重定向可以访问其他站点(服务器)的资源
 * 				3. 重定向是两次请求。不能使用request对象来共享数据
 * 			* 转发的特点：forward
 * 				1. 转发地址栏路径不变
 * 				2. 转发只能访问当前服务器下的资源
 * 				3. 转发是一次请求，可以使用request对象来共享数据
 *
 */
public class ResponseIntro {
}
