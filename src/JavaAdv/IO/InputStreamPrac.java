package JavaAdv.IO;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author asus1
 * @create 2020/11/16 20:59
 * 从已有文件中读取字节，并将该字节写出到另一个文件中
 */
public class InputStreamPrac {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("src\\JavaAdv.IO\\test.txt");
        FileOutputStream fos = new FileOutputStream("src\\JavaAdv.IO\\test1.txt");
        byte[] bytes = new byte[1024];
        int len = 0;
        try {
            if ((len = fis.read(bytes)) != -1)
                fos.write(bytes, 0, len);
        } catch (IOException e) {
            e.printStackTrace();
        }
        fis.close();
        fos.close();
    }
}
