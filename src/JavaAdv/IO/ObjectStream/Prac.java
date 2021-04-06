package JavaAdv.IO.ObjectStream;

import java.io.*;
import java.util.ArrayList;

/**
 * @author asus1
 * @create 2020/11/25 11:04
 * 序列化集合：
 * 多个对象存储到一个集合中，集合序列化和反序列化。
 * 步骤：
 * 1，定义一个存储Person对象的ArrayList集合
 * 2，使用集合存储Person对象
 * 3，创建ObjectOutputStream对象
 * 4，使用WriteObject方法对集合序列化
 * 5，创建反序列化ObjecInputStream对象
 * 6，将Object对象转换为ArrayList类型
 * 7，遍历ArrryList集合
 * 8，释放资源
 */
public class Prac {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        ArrayList<Person> arr = new ArrayList<>();
        Person p1 = new Person("aa", 12);
        Person p2 = new Person("bb", 13);
        Person p3 = new Person("cc", 14);
        arr.add(p1);
        arr.add(p2);
        arr.add(p3);
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("src\\JavaAdv.IO\\ObjectStream\\test1.txt"));
        oos.writeObject(arr);
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("src\\JavaAdv.IO\\ObjectStream\\test1.txt"));
        Object o = ois.readObject();
        ArrayList<Object> arr1 =new ArrayList<>();
        arr1.add(o);
        for (Object p : arr1) {
            System.out.println(p);
        }
        oos.close();
        ois.close();
    }
}
