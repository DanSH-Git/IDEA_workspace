package JavaAdv.Recursion;

import java.io.File;

/**
 * @author asus1
 * @create 2020/11/12 10:14
 * 搜索目录中.java文件
 * <p>
 * 递归遍历目录，子文件文件名称判断时候符合条件
 */
public class RecursionPrac3 {
    public static void main(String[] args) {
        File file = new File("D:\\IntelliJIDEA\\workspace\\src\\JavaAdv.Recursion");
        searchJava(file);
    }

    private static void searchJava(File file) {
        File[] files = file.listFiles();
        for (File f : files
        ) {
            if(f.isDirectory()){
                searchJava(f);
            }
            else{

                if(f.toString().endsWith(".txt"))
                    System.out.println(f);
            }

        }
    }
}
