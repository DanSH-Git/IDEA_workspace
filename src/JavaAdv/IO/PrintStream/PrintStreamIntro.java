package JavaAdv.IO.PrintStream;

import java.io.FileNotFoundException;
import java.io.PrintStream;

/**
 * @author asus1
 * @create 2020/11/26 10:34
 * java.io.PrintStream extends OutputStream:为其他输出流添加了功能，便于打印各种数据值
 *
 * 特点：
 *      1，只负责数据的输出，不负责数据的读取
 *      2，与其他输出流不同，PrintStream永远不会抛出IOException
 *      3，特有方法：
 *             void print()
 *             void println()
 * 构造方法：
 *      PrintStream(File file)
 *      PrintStream(OutputStream out)
 *      PrintStream(String fileName)
 *
 * 继承自父类的成员方法：
 *      close();   flush();
 *      public void write(byte[] b)
 *      public void write(byte[] b,int off,int len)
 *      public abstract void write (int b)
 * 注意事项：
 *      使用write相关方法，会查询编码表
 *      使用print相关方法，数据原样输出
 */
public class PrintStreamIntro {
    public static void main(String[] args) throws FileNotFoundException {
        PrintStream ps=new PrintStream("src\\JavaAdv.IO\\PrintStream\\test1.txt");
        ps.print(1234);
        ps.close();
    }
}
