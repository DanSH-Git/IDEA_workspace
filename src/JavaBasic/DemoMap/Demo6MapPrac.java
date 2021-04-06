package JavaBasic.DemoMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @author asus1
 * @create 2020/10/29 14:55
 * 计算一个字符串出现的次数：
 * 1获取字符串对象
 * 2创建Map结合，键代表字符，值代表次数。
 * 3遍历字符串，得到每个字符
 * 4判断Map中是否具有该键
 * 5如果没有，第一次出现， 存储次数为 1.如果有，则获取对应值++，在此存储
 * 6打印最终结果。
 */
public class Demo6MapPrac {
    public static void main(String[] args) {
        System.out.println("请输入一个字符串：");
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        findChar(str);

    }
    private static void findChar(String line){
        Map<String,Integer> map=new HashMap<>();

        for (int i = 0; i < line.length(); i++) {
            int p=1;
            map.put(String.valueOf(line.charAt(i)),p);
            for (int i1 = 0; i1 <= i; i1++) {
                if(line.charAt(i)==line.charAt(i1)){
                    map.put(String.valueOf(line.charAt(i)),p++);
                }
            }
        }
        System.out.println(map);
    }
}
