package JavaAdv.IO;

import java.io.FileWriter;
import java.io.IOException;

/**
 * @author asus1
 * @create 2020/11/17 16:45
 * 字符输出流
 * java.io.writer
 *
 * 成员方法：
 *      void write(int c)写入单个字符
 *      void write(char[] c)写入字符数组
 *     (abstract) void write (char[] c,int off.int len)写入部分字符，off代表开始索引，len代表索引开始起的写入长度
 *      void flush()刷新 流的缓冲
 *      void close（）关闭流，需要先刷新
 *
 * java.io.FileWriter extends OutputStreamWriter extends Writer
 * 吧内存中字符数据写入文件中。
 *
 * 构造方法：
 *      FileWriter(File file)
 *      FileWriter(String fileName)
 *      创建对象，根据路径创建文件，指向文件
 *
 * 使用步骤：
 *     1.创建对象，方法中绑定目的地
 *     2.write方法写入内存缓冲区中（字符转换为字节）
 *     3.使用Filewriter中方法flush()吧内存缓冲区中的数据刷新到文件中。刷新缓冲区，流对象可以继续使用
 *     4.close()释放资源（将内存缓冲区中数据刷新到文件中）,刷新缓冲区，通知系统释放资源，流对象无法继续使用
 *
 *      续写与换行
 *      使用连个参数的构造方法
 *      FileWriter(String name ,boolean append) append 续写开关
 *      换行符号  \r\n
 */
public class WriterIntro {
    public static void main(String[] args) throws IOException {
        FileWriter fw=new FileWriter("src\\JavaAdv.IO\\test1.txt",false);
        char[] bytes={97,98,99};
        fw.write(bytes);
        fw.write("\r\n");
        fw.write(bytes);
        fw.flush();//刷新缓冲区，流对象可以继续使用
        fw.close();//刷新缓冲区，通知系统释放资源，流对象无法继续使用
    }
}
