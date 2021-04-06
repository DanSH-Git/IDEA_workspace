package JavaAdv.FunctionInterFace.Supplier;

import java.util.function.Supplier;

/**
 * @author asus1
 * @create 2020/12/7 10:03
 * java.util.function.Supplier<T>接口仅包含一个无参的方法：T_get(),获取泛型类型指定类型的对象数据
 * Supplier<T>被称为生产型接口，指定泛型的类型与get生产的类型相同。
 */
public class Intro {
    public static void main(String[] args) {
        //定义一个方法，方法的参数传递Supplier<T>接口，泛型执行String.get方法，返回一个String
        String s=re(()->{return  "ccc"; });
        String s2=re(()->"ccc");//进一步优化函数式接口，去掉return {} ；
       //原始匿名内部类
        String s3=re(new Supplier<String>() {
            @Override
            public String get() {
                return null;
            }
        });
        System.out.println(s);
    }
    public static String re(Supplier<String> sup){
        return sup.get();
    }
}
