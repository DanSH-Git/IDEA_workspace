package JavaAdv.Internet.TCP;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

/**
 * @author asus1
 * @create 2020/12/1 15:09
 *  * 客户端：
 *  * 套接字：包含IP地址和端口号的网络单位；
 *  * *         Socket（String host，int part）
 *  * *            参数：host：IP地址；part：端口号；
 *  * *         成员方法：
 *  * *              OutputStream getOutputStream（）返回套接字的输出流
 *  * *              InputStream getInputStream（）返回套接字的输入流
 *  * *              void close（）关闭套接字
 *  * *         实现步骤：
 *  * *              1，创建一个客户端对象Socket，构造方法绑定IP地址和端口号；
 *  * *              2，使用Socket对象中的getOutputStream（）获取网络字节输出流对象；
 *  * *              3，使用OutputStream对象中的方法write，给服务器发送数据；
 *  * *              4，使用Socket对象中的方法getInputStream（）获取网络字节输入流对象；
 *  * *              5，使用InputStream对象中方法read，读取服务器中回写的数据
 *  * *              6，释放资源，关闭Socket；
 *  * 注意事项：
 *  * 1，客户端与服务器进行交互，必须使用Socket中的提供的网络流，不能使用自己创建的流对象；
 *  * 2，创建Socket对象，回去请求服务器并经过三次握手建立连接，若服务器未启动则抛出异常。
 */
public class SClient {
    public static void main(String[] args) throws IOException {
        Socket socket=new Socket("127.0.0.1",8888);
        OutputStream os=socket.getOutputStream();
        os.write("客户端向服务器端发送请求".getBytes());
        InputStream is=socket.getInputStream();
        byte[] bytes=new byte[1024];
        int len=is.read(bytes);
        System.out.println(new String(bytes));
        socket.close();

    }
}
