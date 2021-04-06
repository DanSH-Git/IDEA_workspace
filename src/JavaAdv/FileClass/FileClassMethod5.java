package JavaAdv.FileClass;

import java.io.File;

/**
 * @author asus1
 * @create 2020/11/11 10:51
 * public String[] lsit():返回String数组表示该File目录中所有子文件和目录
 * public File[] listFiles()返回一个File数组，表示该File目录中所有子文件和目录
 *
 * 注意：
 * list方法和listFile方法便利的是构造方法中给出的目录
 * 如果构造方法中给出目录的路径不存在，会抛出空指针异常
 * 如果构造犯法中给出的路径不是一个目录，也会抛出空指针异常。
 * 可以遍历到隐藏文件夹、文件
 */
public class FileClassMethod5 {
    public static void main(String[] args) {
        File f1=new File("D:\\IntelliJIDEA\\workspace\\src\\JavaAdv.FileClass");
        String[] arr=f1.list();
        for (String filename:arr
             ) {
            System.out.println(filename);

        }
        System.out.println("-------------------------------------------");
        File f2=new File("D:\\IntelliJIDEA\\workspace\\src");
        File[] arr2=f2.listFiles();
        for (File filename1:arr2
        ) {
            System.out.println(filename1);

        }
    }

}
