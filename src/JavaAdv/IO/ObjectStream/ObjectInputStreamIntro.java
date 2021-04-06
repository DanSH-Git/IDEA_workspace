package JavaAdv.IO.ObjectStream;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

/**
 * @author asus1
 * @create 2020/11/25 9:44
 * java.io.ObjectInputStream extends InputStream 反序列化流
 * 把文件中保存的对象，以流的方式读取出来使用
 * 构造方法：
 *      ObjectInputStream（InputStream in）创建从指定InputStream读取的ObjectInputStream
 * 特有成员方法： Object readObject()
 * 使用步骤：
 *      1，创建对象
 *      2，使用readObject读取保存对象文件
 *      3，释放资源
 */
public class ObjectInputStreamIntro {
    // ClassNotFoundExceptionbucun 不存在对象class文件时抛出异常
    // 反序列化前提：类必须实现Serializable；必须存在类对应的class文件

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream ois=new ObjectInputStream(new FileInputStream("src\\JavaAdv.IO\\ObjectStream\\tes1.txt"));
        Object obj=ois.readObject();
        ois.close();
        System.out.println(obj);
    }


}
