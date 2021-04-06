package JavaAdv.IO;

import java.io.FileInputStream;
import java.io.IOException;

/**
 * @author asus1
 * @create 2020/11/16 10:26
 * 字节输入流java.io.InputStream，定义了所有子类共性方法。
 * 方法
 * int read()读取字节
 * int read(byte[] b)读取一定数量的字节，存储在缓冲数组b中
 *      数组起缓冲作用，实际仍然是逐一读取，只是保存在数组中；长度通常定义为1024的整数倍
 *      int返回读取有效字节数
 *
 *
 * void close()关闭并释放
 *
 * 构造方法
 * FileInputStream(String name)
 * FileInputStream(File file)
 * 1,创建FileInputStream对象
 * 2，将对象指向构造方法中要读读取文件的地址或文件
 *
 * 使用步骤：
 * 1创建对象，方法中绑定数据源
 * 2read方法读取文件
 * 3释放资源
 *
 * 请求路径：JVM--OS
 *
 * 使用字节流读取中文文件：GBK中占用2个字节，UTF-8中占用3个字节
 */
public class InputStreamIntro {
    public static void main(String[] args) throws IOException {
        //读取单个数据
        FileInputStream fis = new FileInputStream("src\\JavaAdv.IO\\test.txt");
//        while (fis.read() != -1)
//            System.out.println((char) fis.read());
        //fis.close();
        System.out.println("++++++++++++++++++++++++++++=");
        //读取多个数据
        byte[] bytes=new byte[1024];
        int len=0;
        while((len=fis.read(bytes))!=-1){
            System.out.println(new String(bytes,0,len));
        }

        fis.close();


    }
}
