package Servlet;

/**
 * @author asus1
 * @create 2021/3/2 16:34
 *
 * HTTP超文本传输协议 Hyper text transfer protocol
 *基于TCP/IP协议；默认端口号80；基于请求、响应模型，一次请求一次响应，请求之间相互独立，不交换数据。
 *
 * 请求消息数据格式
 * 1.请求行：  请求方式(get/post) 请求url（/xxx.html) 请求协议/版本 （HTTP/1.1)
 *           get参数在请求行中，长度限制，不安全；post请求参数在请求体中，长度无限制，安全
 * 2.请求头：  键值对
 *           1. User-Agent：浏览器告诉服务器，我访问你使用的浏览器版本信息
 * 				可以在服务器端获取该头的信息，解决浏览器的兼容性问题
 * 			 2. Referer：http://localhost/login.html  告诉服务器，我(当前请求)从哪里来？
 * 				作用：
 * 					1. 防盗链：
 * 					2. 统计工作：
 *
 * 3.请求空行 ： 空行 用于分割post请求的请求头和请求体
 * 4.请求体： 放置参数数据
 *
 *
 *
 *
 */
public class HTTP {
}
