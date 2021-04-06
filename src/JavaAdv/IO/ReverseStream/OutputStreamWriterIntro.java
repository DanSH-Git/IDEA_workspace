package JavaAdv.IO.ReverseStream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

/**
 * @author asus1
 * @create 2020/11/24 10:23
 * java.io.OutputStreamWriter extends Writer
 * 构造方法：
 *      1,OutputStreamWriter(OutputStream out)创建使用默认字符编码的OutputStreamWriter
 *      2,OutputStreamWriter(OutputStream out,String charsetName)创建使用指定字符集的OutputStreamWriter
 *      参数：
 *          1，OutputStream out：转换后字节文件
 *          2，String charsetName：指定编码表名称，不区分大小写
 * 使用步骤：
 *      1，创建OutputStreamWriter对象，指定传递字节输出流及编码表名称
 *      2，使用write方法，字符转换到字节存储到缓冲区
 *      3，flush方法将缓冲区字节刷新到文件中
 *      4，释放资源
 */
public class OutputStreamWriterIntro {
    public static void main(String[] args) throws IOException {
        OutputStreamWriter osw=new OutputStreamWriter(new FileOutputStream("src\\JavaAdv.IO\\ReverseStream\\gbk.txt",true),"gbk");
        osw.write("你好");
        osw.close();
    }
}
