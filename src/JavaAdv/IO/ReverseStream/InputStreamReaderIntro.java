package JavaAdv.IO.ReverseStream;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author asus1
 * @create 2020/11/24 10:43
 * InputStreamReader:使用指定的charset编码表，读取字节并将其解码为字符。（解码）
 * 构造方法：
 *        InputStreamReader(InputStream in) 创建一个默认字符集
 *        InputStreamReader（InputStream in，String charsetName)
 *  使用步骤：
 *         1，创建对象
 *         2，read方法读取
 *         3，释放资源
 *  注意事项：构造方法中指定的编码名称要与文件的编码相同，防止发生乱码
 *
 */
public class InputStreamReaderIntro {
    public static void main(String[] args) throws IOException {
        InputStreamReader isr=new InputStreamReader(new FileInputStream("src\\JavaAdv.IO\\ReverseStream\\utf-8.txt"),"utf-8");
        int len=0;
        while((len=isr.read())!=-1){
            System.out.print((char)len);
        }
        isr.close();
    }
}
