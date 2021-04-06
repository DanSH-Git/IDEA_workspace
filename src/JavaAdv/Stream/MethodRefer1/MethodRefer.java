package JavaAdv.Stream.MethodRefer1;

/**
 * @author asus1
 * @create 2020/12/11 10:13
 * 双冒号：：为引用运算符，所在表达式被称为方法引用，
 * JavaAdv.Lambda: s->System.out.println(s)  参数经过Lambda传递给System.out.println
 * 方法引用：System.out::println      让println方法取代Lambda
 * 其中，Lambda传递的参数一定是方法引用中方法可接收的数据类型
 */
public class MethodRefer {
    public void printUpperCaseString(String str){
        System.out.println(str.toUpperCase());
    }
}
