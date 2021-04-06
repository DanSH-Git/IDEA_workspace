package JavaAdv.Recursion;

import java.io.File;

/**
 * @author asus1
 * @create 2020/11/13 9:48
 * 匿名内部类优化Prac4
 */
public class RecursionPrac5 {
    public static void main(String[] args) {
        File file = new File("D:\\IntelliJIDEA\\workspace\\src\\JavaAdv.Recursion");
        searchJava(file);
    }

    private static void searchJava(File file) {
//        File[] files = file.listFiles(new FileFilter() {
//            @Override
//            public boolean accept(File pathname) {
//                if(pathname.toString().endsWith(".txt")||pathname.isDirectory())
//                    return true;
//                else
//                return false;
//            }
//        });//传递过滤器对象，其中包含过滤规则。
        //lambda优化
        File[] files = file.listFiles((pathname) -> pathname.toString().endsWith(".txt") || pathname.isDirectory());
        for (File f : files
        ) {
            if (f.isDirectory()) {
                searchJava(f);
            } else {
                if (f.isFile())
                    System.out.println(f);
            }

        }
    }
}
