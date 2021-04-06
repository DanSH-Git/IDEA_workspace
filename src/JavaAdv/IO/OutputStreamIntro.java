package JavaAdv.IO;

import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author asus1
 * @create 2020/11/15 14:59
 *
 * java.io.OutputStream 此抽象类表示输出字节流的所有类的超累
 * 定义了一些子类共性的成员方法：
 *      void close() 关闭输出流，释放与此流相关联的任何系统资源
 *      void flush() 刷新输出流，强制任何缓冲的输出字节被写出
 *      void write(byte[] b)将 b.length字节从指定字节数组写入输出流
 *      void write(byte[] b,int off,int len)从指定的字节数组写入len字节，从偏移量off楷书输出到此输出流
 *      abstract void write(int b)将指定的字节输出流
 *
 * FileOutStream extends OutputStream文件字节输出流，把内存中的数据写入文件中。
 * 构造方法：
 *          FileOutputStream（String name）创建一个向具有指定名称的文字中写入数据的文件名
 *          FileOutputStream（File file）创建一个向指定File对象表示的文件中写入数据的文件输出流。
 *          参数 name file 写入数据的目的地：路径/文件
 *          构造方法作用：
 *          1创建一个FileOutputStream对象；
 *          2根据构造方法中传递的文件或者文件路径，创建一个空文件
 *          3吧FileOutputStream对象指向创建好的文件
 *
 * 字节输出流的使用步骤：
 *    1.创建FileOutputStream对象，方法传入目的地
 *    2.调用write方法写入文件
 *    3.释放资源
 *
 * 追加写、续写：
 * FileOutputStream（String name，boolean append）
 * FileOutputStream（File file，boolean appened） boolean 追加写开关
 *
 * 换行符号 \r\n
 */
public class OutputStreamIntro {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos=new FileOutputStream("src\\JavaAdv.IO\\test.txt",true);
        fos.write(49);
        fos.write(12);
        fos.write(48);
        byte[] a={49,48,48};
        byte[] b="大家好".getBytes();
        fos.write("\r\n".getBytes());
        fos.write(a);
        fos.write("\r\n".getBytes());
        fos.write(a,1,2);
        fos.write("\r\n".getBytes());
        fos.write(b);
        fos.write("\r\n".getBytes());
        fos.close();

    }
}
