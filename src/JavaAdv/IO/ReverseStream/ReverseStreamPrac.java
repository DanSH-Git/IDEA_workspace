package JavaAdv.IO.ReverseStream;

import java.io.*;

/**
 * @author asus1
 * @create 2020/11/24 9:56
 * 转换流：InputStreamReader:使用指定的charset编码表，读取字节并将其解码为字符。（解码）
 *        OutputStreamWriter：使用指定的字符集将字符编码为字节。它的字符集可以由名称指定，也可以接受平台的默认字符集。（编码）
 * 将Gbk编码，转换为Utf-8编码的文本文件，
 * 步骤：
 *      1，指定GBK编码的转换流，读取文件
 *      2，使用UTF-8编码的转换流，写入文件
 */
public class ReverseStreamPrac {
    public static void main(String[] args) throws IOException {
        InputStreamReader isr=new InputStreamReader(new FileInputStream("src\\JavaAdv.IO\\ReverseStream\\gbk.txt"),"gbk");
        OutputStreamWriter osw=new OutputStreamWriter(new FileOutputStream("src\\JavaAdv.IO\\ReverseStream\\utf-8.txt",true),"utf-8");
        int len=0;
        while((len=isr.read())!=-1){
            System.out.print((char)len);
            osw.write((char)len);
        }
        isr.close();
        osw.close();
    }
}
