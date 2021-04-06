package JavaAdv.FunctionInterFace.Function;

import java.util.function.Function;

/**
 * @author asus1
 * @create 2020/12/9 9:19
 * java.util.function.Function<T,R>接口用来根据一个类型的数据的到另一个类型的数据，前者称为前置条件，后置条件(转换类型接口)
 * 抽象方法：R apply (T t) 根据类型T的参数获取类型R的结果
 */
public class Intro {
    public static void main(String[] args) {
        String s1="20";
        method(s1,(String s2) ->  Integer.parseInt(s2));
    }
    public static void method(String s,Function<String,Integer> fuc){
        System.out.println(fuc.apply(s)+20);
    }
}
