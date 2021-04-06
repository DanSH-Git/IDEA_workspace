package JavaAdv.FunctionInterFace.Function;

import java.util.function.Function;

/**
 * @author asus1
 * @create 2020/12/9 9:34
 * andThen:组合操作；
 * 需求：
 * 将String类型“123”转换为Integer，吧转换的结果加10
 * 把转换后的Integer类型数据，转换为String
 */
public class methodAndThen {
    public static void main(String[] args) {
        String ss = "123";
        method(ss, s1 ->
                        Integer.parseInt(s1) + 10
                , s2 ->
                        String.valueOf(s2)
        );
    }
    public static void method(String s, Function<String, Integer> func1, Function<Integer, String> func2) {
        System.out.println((func1.andThen(func2).apply(s)));
    }
}
