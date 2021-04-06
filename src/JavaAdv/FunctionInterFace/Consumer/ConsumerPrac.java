package JavaAdv.FunctionInterFace.Consumer;

import java.util.function.Consumer;

/**
 * @author asus1
 * @create 2020/12/7 11:09
 * 按照姓名xx，年龄xx打印
 * 姓名作为第一个lambda实例
 * 年龄作为第二个lambda实例
 * 将其拼接
 */
public class ConsumerPrac {
    public static void main(String[] args) {
        String[] str={"aaa,15","bbb,16","ccc,17"};
        method(str,(s)->{
            System.out.print("name:"+s.split(",")[0]);
        },(s)->{System.out.println(",age:"+s.split(",")[1]); });

    }
    public static void method(String[] strs, Consumer<String> s1,Consumer<String> s2){
        for (String str : strs) {
            s1.andThen(s2).accept(str);
        }

    }
}
