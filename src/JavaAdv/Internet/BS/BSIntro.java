package JavaAdv.Internet.BS;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author asus1
 * @create 2020/12/3 11:06
 * BS:浏览器服务器；
 *
 * GET /web/index.html HTTP/1.1
 * Host: 127.0.0.1:8880
 * User-Agent: Mozilla/5.0 (Windows NT 6.3; Win64; x64; rv:83.0) Gecko/20100101 Firefox/83.0
 * Accept: text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,q=0.8
        Accept-Language:zh-CN,zh;q=0.8,zh-TW;q=0.7,zh-HK;q=0.5,en-US;q=0.3,en;q=0.2
        Accept-Encoding:gzip,deflate
        Connection:keep-alive
        Upgrade-Insecure-Requests:1

 *读取文件必须知道地址:
 * 地址信息在第一行，使用BufferedReader中的方法ReadLine读取一行 将网络字节输入流转换为字符缓冲输入流
 * 使用String类方法split切割字符串，获取中间部分
 * 使用String类方法substring（1）获取html文件路径
 * 创建一个本地的字节输入流，获取文件路径，读取html文件
 * 服务器端使用网络字节输出流将读取文件写入读取到的html文件中
 */
public class BSIntro {
    public static void main(String[] args) throws IOException {
        ServerSocket server=new ServerSocket(8888);
        Socket socket=server.accept();
        InputStream is=socket.getInputStream();
       /* int len=0;
        byte[] bytes=new byte[1024];
        while((len=is.read(bytes))!=-1){
            System.out.println(new String(bytes,0,len));}
            */
       //创建一个字符缓冲输入流，
        BufferedReader br=new BufferedReader(new InputStreamReader(is));
        //读取第一行
        String line=br.readLine();
        //根据空格分割，截取保留地址
        String[] arr=line.split(" ");
        String path=arr[1].substring(1);

        FileInputStream fis=new FileInputStream(path);
        OutputStream os=socket.getOutputStream();

        os.write("HTTP/1.1 200 OK\r\n".getBytes());
        os.write("Content-type/html\r\n".getBytes());
        os.write("\r\n".getBytes());

        int len=0;
        byte[] bytes=new byte[1024];
        while((len=is.read(bytes))!=-1){
            System.out.println(new String(bytes,0,len));}
        fis.close();
        socket.close();
        server.close();
    }
}
