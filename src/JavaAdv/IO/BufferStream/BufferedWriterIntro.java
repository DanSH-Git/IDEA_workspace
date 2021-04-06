package JavaAdv.IO.BufferStream;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @author asus1
 * @create 2020/11/23 10:00
 * <p>
 * java.io.BufferedWriter extends Writer
 * 构造方法：
 * BufferedWriter(Writer out) 参数传递FileWriter，缓冲流给FileWriter增加缓冲区，提高写入效率
 * BufferedWriter(Writer out ,int size)
 * 特有成员方法：
 * void newLine（）根据不同操作系统获取行分隔符
 * 使用步骤：
 * 1，创建字符缓冲输出流对象，构造方法中传递字符输出流；
 * 2，调用方法write，写入缓冲区
 * 3，使用flush将缓存刷新到文件中
 * 4，释放资源
 */
public class BufferedWriterIntro {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter("src\\JavaAdv.IO\\BufferStream\\test2.txt"));
        for (int i = 0; i < 5; i++) {
            bw.write("hello" + i);
            bw.newLine();
        }
        bw.close();
    }
}
