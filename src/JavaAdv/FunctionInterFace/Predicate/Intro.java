package JavaAdv.FunctionInterFace.Predicate;

import java.util.function.Predicate;

/**
 * @author asus1
 * @create 2020/12/8 9:26
 * java.util.function.Predicate<T>:对某种类型的数据进行判断，从而得到一个boolean值结果。
 * 抽象方法：boolean test(T t)
 *
 */
public class Intro {
    public static void main(String[] args) {
        String ss="SSSSSASDD";
        boolean b=check(ss,(s)-> s.length()>5);
        System.out.println(b);
    }
    public static boolean check(String s, Predicate<String> pre)
    {
        //返回值返回包含处理变量的函数式接口对象的抽象方法
        return pre.test(s);

    }
}
