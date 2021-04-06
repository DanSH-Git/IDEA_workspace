package JavaAdv.IO;

import java.io.FileReader;
import java.io.IOException;

/**
 * @author asus1
 * @create 2020/11/17 11:07
 * java.io.Reader字符输入流，顶层父类，抽象类。
 * int read（）读取单个字符并返回
 * int read (char[] c) 读取多个字符，将字符读入数组
 * void close（）关闭字符流
 *
 * FileReader extends InputStreamReader extends Reader
 * FileReader：文件字符输入流
 * 吧硬盘文件中的数据以字符的方式读取到内存中。
 * 构造方法：
 * FileReader（String filename）
 * fileReader（File file）
 * 创建对象，指向文件。
 *
 * 步骤：创建对象，绑定数据源；使用read读取；释放资源。
 *
 */
public class ReaderIntro {
    public static void main(String[] args) throws IOException {
        FileReader fr=new FileReader("src\\JavaAdv.IO\\test.txt");
        int len=0;
        while((len=fr.read())!=-1)
            System.out.println((char)len);
        fr.close();
    }
}
