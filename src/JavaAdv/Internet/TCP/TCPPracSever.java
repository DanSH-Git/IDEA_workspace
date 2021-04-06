package JavaAdv.Internet.TCP;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author asus1
 * @create 2020/12/2 16:32
 * 读取客户端读取的数据，保存到服务器的硬盘上，回写上传成功
 * 实现步骤：
 *      1，创建服务器对象，指定端口
 *      2，使用ServerSocket中accept方法接受客户端请求的Socket对象
 *      3，使用getInputStream获取字节输入流对象
 *      4，创建本地字节输出流对象，方法中绑定目的地
 *      5，使用网络字节输入流读取文件
 *      6，使用write将读取对象保存
 *      7，使用getOutputStream中方法获取对象，并对该对象回写信息
 *      8，释放资源
 */
public class TCPPracSever {
    public static void main(String[] args) throws IOException {
        ServerSocket server=new ServerSocket(8890);
        Socket socket=server.accept();
        InputStream is=socket.getInputStream();
        FileOutputStream fos=new FileOutputStream("src\\JavaAdv.Internet\\save.txt");
        int len=0;
        byte[] bytes=new byte[1024];
        while((len=is.read(bytes))!=-1){
            fos.write(bytes,0,len);
        }
        socket.getOutputStream().write("文件上传成功".getBytes());
        fos.close();
        socket.close();
        server.close();
    }
}
