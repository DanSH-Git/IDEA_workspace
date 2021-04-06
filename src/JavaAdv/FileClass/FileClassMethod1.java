package JavaAdv.FileClass;

import java.io.File;

/**
 * @author asus1
 * @create 2020/11/11 9:37
 * 构造方法1
 * File(String pathname)通过给定路径字符串转换为抽象路径名来创建一个新的File实例。
 * 参数：
 *      路径可以以文件或者文件夹结尾
 *      路径可以是相对路径，也可以是绝对路径
 *      路径可以存在，也可以不存在
 *      创建File对象，只是吧字符串路径封装为File对象，不考虑路径真假情况
 *
 * 构造方法2：
 * File(String parent,String Child)根据父路径和子路径名字字符串创建一个文件实例。单独书写，灵活变化。
 *
 * 构造方法3：
 * File (File parent,File parent)
 */
public class FileClassMethod1 {
    public static void main(String[] args) {
        System.out.println(new File("C:\\Users\\asus1\\Desktop\\a.txt"));

        File f2=new File("C:\\Users\\asus1\\Desktop\\","b.txt");
        System.out.println(f2);

        File parent=new File("C:\\Users\\asus1\\Desktop");
        File f3=new File(parent, "c.txt");
        System.out.println(f3);
    }
}
