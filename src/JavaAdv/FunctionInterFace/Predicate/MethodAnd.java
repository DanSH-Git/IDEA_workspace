package JavaAdv.FunctionInterFace.Predicate;

import java.util.function.Predicate;

/**
 * @author asus1
 * @create 2020/12/8 9:39
 * Predict属于条件判断，存在与或非三种常见的逻辑关系，将两个Predict条件使用“与”逻辑连接，使用and方法
 * 与：add；
 * 或：Or；
 * 非：negate;
 */
public class MethodAnd {
    public static void main(String[] args) {
        String s = "ssssadadqweaf";
        boolean b = methodAdd(s, (String st1) -> s.contains("s"), (String st2) -> s.contains("a"));
        boolean b2 = methodOr(s, (String st1) -> s.contains("s"), (String st2) -> s.contains("a"));
        boolean b3 = methodnegate(s, (String st1) -> s.contains("s"));
        System.out.println(b);
        System.out.println(b2);
        System.out.println(b3);

    }
    public static boolean methodAdd(String s, Predicate<String> pre1, Predicate<String> pre2) {
//        return pre1.test(s)&&pre2.test(s);
        return pre1.and(pre2).test(s);
    }
    public static boolean methodOr(String s, Predicate<String> pre1, Predicate<String> pre2) {
//
        return pre1.or(pre2).test(s);
    }
    public static boolean methodnegate(String s, Predicate<String> pre1) {
//        return pre1.test(s)&&pre2.test(s);
        return pre1.negate().test(s);//!pre.test(s)
    }
}
