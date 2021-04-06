package JavaAdv.Recursion;

import java.io.File;

/**
 * @author asus1
 * @create 2020/11/12 9:57
 * 递归打印多级目录
 */
public class RecursionPrac2 {
    public static void main(String[] args) {
        File file=new File("D:\\IntelliJIDEA\\workspace\\src\\JavaBasic") ;
        getAllFiles(file);
    }

    private static void getAllFiles(File file) {
        File[] files=file.listFiles();
        for (File f:files
             ) {
            if(f.isFile()){
            System.out.println(f);}//判断如果是文件，则打印，
            if(f.isDirectory()){//如果是目录，则继续递归打印知道打印到文件为止
                getAllFiles(f);
            }
        }
    }

}
