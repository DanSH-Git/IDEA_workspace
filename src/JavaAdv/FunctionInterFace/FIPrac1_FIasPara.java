package JavaAdv.FunctionInterFace;

/**
 * @author asus1
 * @create 2020/12/4 16:13
 * 例如java.lang.runnable接口是一个函数式接口；
 * 假设存在一个startThread方法使用接口作为参数，则使用Lambda进行传参，
 * 与Thread类的构造方法参数为Runnable没有本质区别。
 */
public class FIPrac1_FIasPara {
    /*方法参数必须是函数式接口*/
    public static void startThread(Runnable run){
        new Thread(run).start();
    }

    public static void main(String[] args) {
//        匿名内部类方式
         startThread(new Runnable() {
             @Override
             public void run() {
                 System.out.println(Thread.currentThread().getName()+"启动了");
             }
         });
//         lambda表示
         startThread(()->System.out.println(Thread.currentThread().getName()+"启动了呢"));

    }
}
