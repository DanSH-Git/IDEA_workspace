package JavaAdv.Stream.MethodRefer2;

/**
 * @author asus1
 * @create 2020/12/16 9:38
 * 通过类名引用静态成员方法
 *      类与静态成员方法均存在
 *      直接通过类名引用静态成员方法
 *
 */
public class Demo2 {
    public static int method(int num,Calcable cc){
        return cc.CalAbs(num);
    }
    public static void main(String[] args) {
        int b=method(-5,(s)->{
            return Math.abs(s);
        });
        System.out.println(b);
        //使用方法引用优化表达式
        //Math类与abs计算绝对值方法存在
        int num=-5;
        int b1=method(num,Math::abs);
        System.out.println(b1);
    }
}
