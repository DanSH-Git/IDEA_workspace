package JavaAdv.FunctionInterFace;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @author asus1
 * @create 2020/12/4 16:27
 * 用一个方法来获取一个java.util.Comparator 接口类型的对象作为排序器，调用方法获取
 */
public class FIPrac2_FIasReturn {
    public static Comparator<String> getComparator(){
        return (String o1,String o2)->{
            return o2.length()-o1.length();
        };
        /*优化表达式 ：相同数据类型；return；{}
        *  return (o1, o2)-> o2.length()-o1.length();
        * */
    }

    public static void main(String[] args) {
        String[] srt={"aa","cccc","bbb","12222","9999999","11111"};
        System.out.println(Arrays.toString(srt));
        Arrays.sort(srt,getComparator());
        System.out.println("sorted："+ Arrays.toString(srt));
    }
}
