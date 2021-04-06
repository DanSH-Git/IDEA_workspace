package JavaAdv.IO;

import java.io.FileInputStream;
import java.io.IOException;

/**
 * @author asus1
 * @create 2020/11/17 10:54
 * 在UTF-8模式下，每个汉字占据3个字符
 * 使用file数组，读取中文。
 */
public class InputStreamPrac2 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("src\\JavaAdv.IO\\test1.txt");
//        int len = 0;
//        byte[] bytes = new byte[12];
        while ( fis.read()!= -1)
        {
            System.out.println(fis.read());
        }
        fis.close();

//        FileInputStream fis = new FileInputStream("src\\JavaAdv.IO\\test.txt");
//        while (fis.read() != -1)
//            System.out.println(fis.read());
//        fis.close();
    }
}
