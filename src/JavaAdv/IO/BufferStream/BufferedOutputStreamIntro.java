package JavaAdv.IO.BufferStream;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author asus1
 * @create 2020/11/22 15:30
 * java.io.BufferedOutputStream extends OutputStream 字节缓冲输出流
 * <p>
 * 构造方法：
 * BufferedOutputStream (OutputStream out) 创建一个新的缓冲输出流，将数据写入底层输出流
 * BufferedOutputStream(OutputStream out ,int size)创建新的缓冲输出流，将具有指定缓冲区大小的数据写入指定的底层输出流。
 * 参数：
 * OutputStream out:字节输出流
 * 传递FileOutputStream,给FileOutFileStream增加一个缓冲区，提高写入效率
 * int size:指定内部缓冲区的大小，默认
 * <p>
 * 步骤：
 * 1.创建FileOutputStream,绑定输目的地址；
 * 2.创建BufferedOutputStream对象,构造方法中传递FileOutputStream对象，提高效率；
 * 3.使用BufferOutputStream对象中方法write,将数据写入内部缓冲区。
 * 4.使用flush,缓冲区中数据刷新到文件中。
 * 5.释放资源，
 */
public class BufferedOutputStreamIntro {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos=new FileOutputStream("src\\JavaAdv.IO\\BufferStream\\test2.txt");
        BufferedOutputStream bos =new BufferedOutputStream(fos);
        bos.write(98);
        bos.close();
    }


}

