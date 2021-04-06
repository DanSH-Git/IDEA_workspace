package JavaAdv.Stream.MethodRefer1;

/**
 * @author asus1
 * @create 2020/12/16 9:27
 * 通过对象名引用成员方法
 *      对象名与成员方法都存在，通过对象名引用成员方法
 */
public class Demo01 {
    //定义一个方法，参数传递Printable接口
    public static  void pri(Printable p){
        p.print("Hello");
    }
    public static void main(String[] args) {
        //调用pri方法，参数是一个函数式接口，可传递lambda表达式
        pri((s)->{
            MethodRefer mr=new MethodRefer();
            //调用对象中的成员方法
            mr.printUpperCaseString(s);
        });
        //方法引用进行优化(对象存在，方法存在，对象：：方法直接调用)
        MethodRefer mr=new MethodRefer();
        pri(mr::printUpperCaseString);
    }
}
