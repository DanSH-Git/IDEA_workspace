package JavaAdv.IO.BufferStream;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author asus1
 * @create 2020/11/23 10:12
 * java.io.BufferedReader extends Reader
 * 构造方法：
 * BufferedReader（Reader in）
 * BufferedReader(Reader in,int size)
 * 特有成员方法：
 * String readLine()读取一个文本行 ，返回值包含字符串，不包含终止符
 * 步骤：
 * 1，创建对象
 * 2，使用read或者readLine读取文本
 * 3，释放资源
 */
public class BufferedReaderIntro {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("src\\JavaAdv.IO\\BufferStream\\test2.txt"));
        String len;
        while ((len = br.readLine()) != null) {
            System.out.println(br.readLine());
        }
        br.close();
    }
}
