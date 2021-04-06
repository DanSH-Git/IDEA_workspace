package JavaAdv.IO.BufferStream.testPac2;

import java.io.*;
import java.util.HashMap;

/**
 * @author asus1
 * @create 2020/11/23 11:30
 * 对 src\\JavaAdv.IO\\BufferStream\\testPrac1\\test1.txt 出师表文本文件进行排序
 */
public class TextSortPrac {
    public static void main(String[] args) throws IOException {
        HashMap<String,String> hashMap=new HashMap<>();
        BufferedReader br=new BufferedReader(new FileReader("src\\JavaAdv.IO\\BufferStream\\testPac1\\test1.txt"));
        BufferedWriter bw=new BufferedWriter(new FileWriter("src\\JavaAdv.IO\\BufferStream\\testPac1\\test2.txt"));

        String str;
        while((str=br.readLine())!=null){
            String[] str1=str.split("\\.");
            hashMap.put(str1[0],str1[1]);
        }
        br.close();

        for (int i = 1; i < hashMap.size(); i++) {
            String key=String.valueOf(i);
            String value=hashMap.get(key);
            //hashMap.put(key,value);
            bw.write(key+"."+value);
            bw.newLine();
        }
        bw.close();

    }
}
