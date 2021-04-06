package JavaAdv.FunctionInterFace.Function;

import java.util.function.Function;

/**
 * @author asus1
 * @create 2020/12/9 9:51
 * 使用Funciton进行函数模型的拼接
 * String str="aaa,18"
 * 截取数字部分，转换为int，加上100
 *
 */
public class Prac {
    public static void main(String[] args) {
        String str="aaa,18";
        method(str,(s1)->Integer.parseInt(s1.split(",")[1])+100);

    }
    public static void method(String s, Function<String,Integer> func1){
        System.out.println(func1.apply(s));
    }
}
