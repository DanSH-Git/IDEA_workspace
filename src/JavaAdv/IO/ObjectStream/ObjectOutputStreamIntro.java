package JavaAdv.IO.ObjectStream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 * @author asus1
 * @create 2020/11/25 9:24
 * java.io.ObjectOutputStream extends OutputStream 对象的序列化流
 * 作用：把对象以流的方式写入到文件中保存
 * 构造方法：
 *          ObjectOutputStream(OutputStream out) 创建写入指定OutputStream的ObjectOutputStream
 * 特有成员方法：
 *          void writeObject(Object obj) 指定对象写入ObjectOutputStream
 * 步骤：
 *      1，创建对象
 *      2，使用wr iteObject方法，把对象写入文件
 *      3，释放资源
 *
 * 类通过实现java.io.Serializable接口启用序列化功能，未实现此接口的类无法使用，抛出NotSerializableException异常
 * Serialable接口也叫标记型接口：类实现接口会给类添加一个标记
 *
 * transient：瞬态关键字；修饰的成员变量不能被序列化
 * 序列化冲突异常：
 *      每次修改类的定义，都会给class文件生成一个新的序列号
 * 解决方法：
 *      无论是否对类的定义修改，都不重新生成序列号
 *      手动给类添加一个序列号
 * 格式在Serializable接口规定：
 *      可序列化类可以通过声明名为“serialVersionUID”的字段,该字段必须是静态static，final，long型字段，显式声明
 */
public class ObjectOutputStreamIntro {
    public static void main(String[] args) throws IOException {
        ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("src\\JavaAdv.IO\\ObjectStream\\tes1.txt"));
        oos.writeObject("111");
        oos.close();
    }
}
