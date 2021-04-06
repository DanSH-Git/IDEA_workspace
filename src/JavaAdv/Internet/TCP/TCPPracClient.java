package JavaAdv.Internet.TCP;

import java.io.*;
import java.net.Socket;

/**
 * @author asus1
 * @create 2020/12/2 16:32
 * 读取本地文件，上传到服务器，读取服务器回写的数据。
 * 步骤：
 *      1，创建一个本地字节输入流，绑定读取的数据源
 *      2，创建客户端Socket对象，绑定ip地址与端口号
 *      3，使用getOutputStream获取网络字节输出流
 *      4，使用本地输入流read读取本地文件
 *      5，使用网络字节输出流write将读取文件上传到服务器
 *      6，使用Scoket中方法获取网络字节输入流
 *      7，使用网络字节输入流read读取服务器回写的数据
 *      8，释放资源
 */
public class TCPPracClient {
    public static void main(String[] args) throws IOException {
        FileInputStream fis=new FileInputStream("src\\JavaAdv.Internet\\upload.txt");
        Socket socket=new Socket("127.0.0.1",8890);
        OutputStream os=socket.getOutputStream();
        int len=0;
        byte[] bytes=new byte[1024];
        while((len=fis.read(bytes))!=-1){
            os.write(bytes,0,len);
        }
        socket.shutdownOutput();
        InputStream is=socket.getInputStream();
        while((len=is.read(bytes))!=-1){
            System.out.println(new String(bytes,0,len));
        }
        fis.close();
        socket.close();
    }
}
