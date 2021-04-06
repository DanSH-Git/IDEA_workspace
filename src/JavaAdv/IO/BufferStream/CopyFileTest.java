package JavaAdv.IO.BufferStream;

import java.io.*;

/**
 * @author asus1
 * @create 2020/11/23 9:34
 * 使用三种不同的方法复制一张图像文件对比不同方法所消耗的时间。
 * 文件大小：28672字节
 * 文件复制步骤：
 *   1，创建输入流对象
 *   2，创建输出流对象
 *   3，（创建（输入\输出）缓冲流对象）
 *   4，输入流对象使用read读取，输出流对象使用write写入
 *   5，释放资源
 */
public class CopyFileTest {
    public static void main(String[] args) throws IOException {
        /*基本字符流方式 复制完成，耗时：153毫秒
        基本字符流传递byte[]方式 复制完成，耗时：15毫秒
        缓冲流 复制完成，耗时：8毫秒*/
        test1();
        test2();
        test3();
    }

    private static void test1() throws IOException {
        long s=System.currentTimeMillis();
        FileInputStream fis =new FileInputStream("src\\JavaAdv.IO\\BufferStream\\testPac1\\testpng.png");
        FileOutputStream fos=new FileOutputStream("src\\JavaAdv.IO\\BufferStream\\testPac2\\testpng.png");
        int len=0;
        while((len=fis.read())!=-1){
            fos.write(len);
        }
        long e=System.currentTimeMillis();
        System.out.println("基本字符流方式 复制完成，耗时："+(e-s)+"毫秒");
        fis.close();
        fos.close();
    }
    private static void test2() throws IOException {
        long s=System.currentTimeMillis();
        FileInputStream fis =new FileInputStream("src\\JavaAdv.IO\\BufferStream\\testPac1\\testpng.png");
        FileOutputStream fos=new FileOutputStream("src\\JavaAdv.IO\\BufferStream\\testPac2\\testpng.png");
        byte[] bytes=new byte[8];
        int len=0;
        while((len=fis.read(bytes))!=-1){
            fos.write(len);
        }
        long e=System.currentTimeMillis();
        System.out.println("基本字符流传递byte[]方式 复制完成，耗时："+(e-s)+"毫秒");
        fis.close();
        fos.close();
    }
    private static void test3() throws IOException {
        long s=System.currentTimeMillis();
        FileInputStream fis =new FileInputStream("src\\JavaAdv.IO\\BufferStream\\testPac1\\testpng.png");
        BufferedInputStream bis=new BufferedInputStream(fis);
        FileOutputStream fos=new FileOutputStream("src\\JavaAdv.IO\\BufferStream\\testPac2\\testpng.png");
        BufferedOutputStream bos=new BufferedOutputStream(fos);
        int len=0;
        while((len=bis.read())!=-1){
            bos.write(len);
        }
        long e=System.currentTimeMillis();
        System.out.println("缓冲流 复制完成，耗时："+(e-s)+"毫秒");
        bis.close();
        bos.close();
    }
}
