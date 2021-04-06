package JavaAdv.IO;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

/**
 * @author asus1
 * @create 2020/11/21 14:40
 * java.util.Properties extends Hashtable<k,v> implement Map<k,v>
 * Properties:表示一个持久的属性集，可保存在流中或者从流中加载，
 * Properties是唯一和IO流向结合的集合。使用集合中的方法store，把临时数据持久化写入硬盘中存储。
 * 使用Properties中的方法load将硬盘中保存的键值对读取到集合中使用。
 *
 *
 * 属性列表的每个键对象一个字符串，是一个双列集合， 默认均为字符串String（String key,String value)
 * 操作字符串的特有方法：
 * Object setProperties(String key,String value)调用HashMap中的方法put
 * String getProperties(String key)通过key找到value值，此方法相当于Map集合中和get(key)方法
 * Set<String> stringProperties()返回此属性列表中的键集，其中该键对应值是字符串，相当于Map集合中的keySet方法。
 *
 *
 * 使用Properties集合中的方法store，把集合中的临时数据，持久化写入到硬盘中存储。
 * void store(OutputStream out，String comments)
 * void store(Writer writer,String comments)
 * 参数:
 * OutputStream out:字节输出流，不能写入中文。
 * Writer writer:字符输出流，可以写中文。
 * String comments：注释，用来解释说明保存的文件用处，
 * 不能使用中文，默认采用Unicode编码
 * 一般使用  "  "  空字符串
 * 使用基本步骤：
 * 1，创建Porperties集合对象，添加数据。
 * 2，创建字节输出流/字符输出流对象，构造方法中绑定输出的目标文件或地址。
 * 3，使用Properties集合中的方法store，把集合中的临时数据持久的写入到硬盘中存储。
 * 4，释放资源。
 *
 *
 * 使用Properties集合中的方法load，吧硬盘中的保存的文件（键值对），读取到集合中使用
 * void load（InputStream，inStream）
 * void load(Reader reader）
 *参数：InputStream inStream；字节输入流，不能读取含有中文的键值对
 *      Reader reader ：字符输入流，能读取含有中文的键值对；
 * 使用步骤：
 *     1，创建Properties对象
 *     2，使用集合对象中的方法load读取保存键值对的文件
 *     3，遍历Properties集合
 *  注意事项：
 *     1，键值对文件中键值连接符可以使用=或者空格
 *     2，可以使用#进行注释，被注释的键值对不会再被读取
 *     3，键值默认属性是字符串，不用再加引号。
 */
public class PropertiesIntro {
    public static void main(String[] args) throws IOException {
        show01();
        show02();//使用Properties集合中的方法store，把集合中的临时数据，持久化写入到硬盘中存储。
        show03();//Properties集合中的方法load，把硬盘中的保存的文件（键值对），读取到集合中使用
    }

    public static void show01() {
        //创建Properties对象；
        Properties prop = new Properties();
        //使用setProperties  往集合中添加对象；
        prop.setProperty("A", "1");
        prop.setProperty("B", "2");
        prop.setProperty("C", "3");
        //遍历Set集合，取出Properties集合的每一个键；
        Set<String> set = prop.stringPropertyNames();
        //使用getProperties方法通过key获取value；
        for (String key : set
        ) {
            String value = prop.getProperty(key);
            System.out.println("key" + "=" + value);

        }
    }

    public static void show02() throws IOException {
//        1，创建Porperties集合对象，添加数据。
        Properties prop = new Properties();
        prop.setProperty("A", "1");
        prop.setProperty("B", "2");
        prop.setProperty("C", "3");
//        2，创建字节输出流/字符输出流对象，构造方法中绑定输出的目标文件或地址。
        FileWriter fw=new FileWriter("src\\JavaAdv.IO\\test1.txt");

//        3，使用Properties集合中的方法store，把集合中的临时数据持久的写入到硬盘中存储。
        prop.store(fw,"save three <key,value>");
//        4，释放资源。
        fw.close();
    }
    private static void show03() throws IOException {
        /*1，创建Properties对象
        2，使用集合对象中的方法load读取保存键值对的文件
        3，遍历Properties集合*/
        Properties prop = new Properties();
        prop.load(new FileReader("src\\JavaAdv.IO\\test1.txt"));
        Set<String> set = prop.stringPropertyNames();
        //使用getProperties方法通过key获取value；
        for (String key : set
        ) {
            String value = prop.getProperty(key);
            System.out.println("key" + "=" + value);

        }
    }
}
