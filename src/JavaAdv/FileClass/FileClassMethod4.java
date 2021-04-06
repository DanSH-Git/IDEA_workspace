package JavaAdv.FileClass;

import java.io.File;
import java.io.IOException;

/**
 * @author asus1
 * @create 2020/11/11 10:47
 * 创建删除功能的方法
 * public boolean createNewFile() 当且仅当具有该名称的文件不存在是，创建一个新的空文件。
 *      只能创建文件，不能创建文件夹；路径必须存在，否则报异常。
 * public boolean delete（）删除由此File表示的文件或目录。
 *      硬盘删除，需谨慎
 * public boolean mkdir（）创建由此File表示的目录。单级文件夹
 * public boolean mkdirs（）创建由此File表示的目录，包括任何必须但不存在的父目录。
 */
public class FileClassMethod4 {
    public static void main(String[] args) throws IOException {
        File f1=new File("D:\\IntelliJIDEA\\workspace\\src\\JavaAdv.FileClass\\a.txt");
        //boolean b1=f1.createNewFile();
        boolean b1=f1.delete();
        System.out.println(b1);

        File f3=new File("D:\\IntelliJIDEA\\workspace\\src\\JavaAdv.FileClass\\test");
        //System.out.println(f3.mkdir());
        System.out.println(f3.delete());

        File f4=new File("src\\JavaAdv.FileClass\\test1");
        //System.out.println(f4.mkdir());
        System.out.println(f4.delete());
    }
}
