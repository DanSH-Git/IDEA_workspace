package JavaAdv.Internet.TCP;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author asus1
 * @create 2020/12/1 15:09
 * 服务器端：接收请求，读取数据，回写数据；
 *  * 构造方法：
 *  * ServerSocket(int port)绑定指定端口的服务器套接字
 *  * 成员方法：
 *  * Socket accept()侦听并接收指定端口号
 *  *
 *  * 服务器的实现步骤：
 *  *       1，创建服务器对象，和系统请求指定的端口号；
 *  *       2，使用accept方法，获取请求的客户端对象
 *  *       3，使用getInputStream获取网络字节输入流InputStream对象
 *  *       4，使用read方法读取发送的数据；
 *  *       5，使用getOutputStream获取网络字节输出流对象
 *  *       6，使用write方法回写数据
 *  *       7，释放资源，关闭Socket， ServerSocket
 */
public class SServer {
    public static void main(String[] args) throws IOException {
        ServerSocket server=new ServerSocket(8888);
        Socket socket=server.accept();
        InputStream is=socket.getInputStream();
        byte[] bytes=new byte[1024];
        int len=is.read(bytes);
        System.out.println(new String(bytes));
        OutputStream os=socket.getOutputStream();
        os.write("服务器端已收到客户端请求".getBytes());
        socket.close();
        server.close();
    }
}
