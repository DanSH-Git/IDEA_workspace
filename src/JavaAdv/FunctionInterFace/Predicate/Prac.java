package JavaAdv.FunctionInterFace.Predicate;

import java.util.ArrayList;
import java.util.function.Predicate;

/**
 * @author asus1
 * @create 2020/12/8 10:01
 * 对字符串进行筛选：
 * 1，名字为4字
 * 2，年纪为18以上
 */
public class Prac {
    public static void main(String[] args) {
        String[] array={"aaaa,29","bbbbb,28","ccc,12","dddd,19"};
        ArrayList<String> list=judge(array,(String s)->{
            return s.split(",")[0].length()==4;
        },(String s)->{
            return Integer.parseInt(s.split(",")[1])>18;
        });
        for (String s : list) {
            System.out.println(s);
        }

    }
    public static ArrayList<String> judge(String[] str, Predicate<String> str1, Predicate<String> str2){
        ArrayList<String> list=new ArrayList<>();
        for (String s : str) {
            boolean b=str1.and(str2).test(s);
            if(b){
                list.add(s);
            }           
        }
        return list;
    }

}
