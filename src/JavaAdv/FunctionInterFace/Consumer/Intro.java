package JavaAdv.FunctionInterFace.Consumer;

import java.util.function.Consumer;

/**
 * @author asus1
 * @create 2020/12/7 10:36
 * java.util.function.Consumer<T>:消费一个数据。
 * 抽象方法accept:   void accept(T t),意为消费一个指定泛型类型的数据。
 * 默认方法andThen： 方法与返回值都是Consumer类型，消费数据时，对两个操作组合，在对数据进行消费。
 *                  例子：
 *                      Consumer<String> s1
 *                      Consumer<String> s2
 *                      s1.accept(String)
 *                      s2.accept(String)
 *
 *                      s1.andThen(s2).accept(String);
 */
public class Intro {
    public static void main(String[] args) {
        System.out.println("=====================Accept==================");
        consumeString(s -> System.out.println(s));
        consumeString(s -> System.out.println(new StringBuffer(s).reverse().toString()));
        System.out.println("=====================andThen==================");
        /*匿名内部类基本格式   (对象)->{对象操作}*/
        method("hElLo",(t)->{
            System.out.println(t.toLowerCase());
        },(t)->{
            System.out.println(t.toUpperCase());
        });
        method2("HaPe",(t)->{
            System.out.println(t.toLowerCase());
        },(t)->{
            System.out.println(t.toUpperCase());
        });
    }
    public static void consumeString(Consumer<String> func){
        func.accept("abcde");
    }

    public static void method(String s,Consumer<String> s1,Consumer<String> s2){
        s1.accept(s);
        s2.accept(s);
    }
    public static void method2(String s,Consumer<String> s1,Consumer<String> s2){
        s1.andThen(s2).accept(s);
    }
}
