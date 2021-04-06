package JavaAdv.IO.BufferStream;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * @author asus1
 * @create 2020/11/22 16:16
 * BufferedInputStream extends InputStream
 * 构造方法：
 *      BufferedInputStream(InputStream in)创建一个BufferedInputStream并保存参数，
 *      BufferedInputStream(InputStream in,int size)创建具有缓冲区大小的BufferedInputStream保存参数
 *          参数 :
 *              InputStream in:增加缓冲区，提高效率
 *              int size：指定大小；
 * 使用步骤：
 *      1，创建FileInputStream对象;
 *      2，创建BufferedInputStream对象，传递FileInputStream对象，提高读取效率。
 *      3，使用BufferedInputStream中方法read，读取文件
 *      4，释放资源
 *
 */
public class BufferedInputStreamIntro {
    public static void main(String[] args) throws IOException {
        FileInputStream fis=new FileInputStream("src\\JavaAdv.IO\\BufferStream\\test2.txt");//创建FileInputStream对象;
        BufferedInputStream bis=new BufferedInputStream(fis);//创建BufferedInputStream对象，传递FileInputStream对象
        int len=0;
        while((len=bis.read())!=-1){//使用BufferedInputStream中方法read，读取文件
            System.out.println(len);
        }
        bis.close();//释放资源
    }
}
