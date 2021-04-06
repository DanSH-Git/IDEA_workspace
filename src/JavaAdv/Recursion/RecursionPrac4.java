package JavaAdv.Recursion;

import java.io.File;

/**
 * @author asus1
 * @create 2020/11/12 10:29
 * 文件过滤器优化
 * File中有两个ListFiles重载的方法
 * 1
 * File[] listFiles(FileFilter filter) 抽象路径名（File对象）的过滤器
 * 抽象方法boolean accept（File pathname)使用ListFiles得到的每一个文件对象。
 * 2
 * File[] listFiles(FilenameFilter filter)
 * 用于过滤文件名称
 * 抽象方法 boolean accept（File dir，String name）测试指定文件中是否应该包含在同一文件中。
 * File dir：被遍历的目录
 * String name：listFiles遍历目录 ，每一个文件或者文件名的名称
 * <p>
 * 上述两个过滤器接口没有实现类，需要自己编写实现类，重写过滤方法accept。在方法中自定义accept过滤规则。
 */
public class RecursionPrac4 {
    public static void main(String[] args) {
        File file = new File("D:\\IntelliJIDEA\\workspace\\src\\JavaAdv.Recursion");
        searchJava(file);
    }

    private static void searchJava(File file) {
        File[] files = file.listFiles(new Prac4FileFilterImpl());//传递过滤器对象，其中包含过滤规则。
        for (File f : files
        ) {
            if (f.isDirectory()) {
                searchJava(f);
            } else {
                    if(f.isFile())
                    System.out.println(f);
            }

        }
    }
}
