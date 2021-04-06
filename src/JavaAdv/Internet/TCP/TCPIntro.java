package JavaAdv.Internet.TCP;

import java.io.IOException;

/**
 * @author asus1
 * @create 2020/12/1 10:34
 * 通信两端严格区分客户端和服务器端
 * 通讯步骤：
 * 1，服务端程序事先启动，等待客户端连接；
 * 2，客户端主动连接服务器端，建立逻辑连接，连接成功可以通信，服务器不主动连接客户端。
 * Java中用于TCP通信程序的类：
 * 1，客户端：java.net.Socket类，创建Socket对象，发出连接请求
 * 2，服务器端：java.net.ServerSocket类，创建ServerSocket对象，等待连接
 * <p>
 * 多个客户端同时与服务器进行交互，服务器端利用accept方法收到请求的客户端对象。
 * 客户端与服务器进行一个数据交互需要4个IO流对象，OIOI；
 * <p>
 * 客户端：
 * 套接字：包含IP地址和端口号的网络单位；
 * *         Socket（String host，int part）
 * *            参数：host：IP地址；part：端口号；
 * *         成员方法：
 * *              OutputStream getOutputStream（）返回套接字的输出流
 * *              InputStream getInputStream（）返回套接字的输入流
 * *              void close（）关闭套接字
 * *         实现步骤：
 * *              1，创建一个客户端对象Socket，构造方法绑定IP地址和端口号；
 * *              2，使用Socket对象中的getOutputStream（）获取网络字节输出流对象；
 * *              3，使用OutputStream对象中的方法write，给服务器发送数据；
 * *              4，使用Socket对象中的方法getInputStream（）获取网络字节输入流对象；
 * *              5，使用InputStream对象中方法read，读取服务器中回写的数据
 * *              6，释放资源，关闭Socket；
 * 注意事项：
 * 1，客户端与服务器进行交互，必须使用Socket中的提供的网络流，不能使用自己创建的流对象；
 * 2，创建Socket对象，回去请求服务器并经过三次握手建立连接，若服务器未启动则抛出异常。
 * <p>
 * 服务器端：接收请求，读取数据，回写数据；
 * 构造方法：
 * ServerSocket(int port)绑定指定端口的服务器套接字
 * 成员方法：
 * Socket accept()侦听并接收指定端口号
 * <p>
 * 服务器的实现步骤：
 * 1，创建服务器对象，和系统请求指定的端口号；
 * 2，使用accept方法，获取请求的客户端对象
 * 3，使用getInputStream获取网络字节输入流InputStream对象
 * 4，使用read方法读取发送的数据；
 * 5，使用getOutputStream获取网络字节输出流对象
 * 6，使用write方法回写数据
 * 7，释放资源，关闭Socket， ServerSocket
 */
public class TCPIntro {
    public static void main(String[] args) throws IOException {



    }

}
