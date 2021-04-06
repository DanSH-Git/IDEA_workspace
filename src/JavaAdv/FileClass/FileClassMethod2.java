package JavaAdv.FileClass;

import java.io.File;

/**
 * @author asus1
 * @create 2020/11/11 9:52
 * public String getAbsolutePath()绝对路径名字符串
 * public String getPath()将File转换为路径名称字符串
 * public String getName()返回此File表示的文件或者目录的名称
 * public long length()返回由此File表示的文件的长度。
 *      不能获取文件夹大小
 *      以字节为单位
 *      不存在返回0
 */
public class FileClassMethod2 {
    public static void main(String[] args) {
        File f1=new File("C:\\Users\\asus1\\Desktop\\a.txt");
        System.out.println("绝对路径："+f1.getAbsolutePath());
        System.out.println("名称："+f1.getName());
        System.out.println("路径："+f1.getPath());
        System.out.println("长度："+f1.length());
    }
}
