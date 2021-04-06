package JavaAdv.FileClass;

import java.io.File;

/**
 * @author asus1
 * @create 2020/11/11 10:17
 * File判断功能方法：
 *      public boolean exists(),此File表示文件或者目录是否存在
 *      public boolean isDirectory():此File表示的是否为目录
 *      public boolean isFile()此File表示的是否为文件。
 */
public class FileClassMethod3 {
    public static void main(String[] args) {
        File f1=new File("C:\\Users\\asus1\\Desktop");
        System.out.println("是否存在:"+f1.exists());
        System.out.println("是否为目录:"+f1.isDirectory());
        System.out.println("是否为文件:"+f1.isFile());
        File f2=new File("C:\\Users\\asus1\\Desktop\\a.txt");
        System.out.println("是否存在:"+f2.exists());
        System.out.println("是否为目录:"+f2.isDirectory());
        System.out.println("是否为文件:"+f2.isFile());
    }
}
