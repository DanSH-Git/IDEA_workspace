package JavaAdv.ThreadDemo.ThreadBasic;

/**
 * @author asus1
 * @create 2020/11/3 14:43
 * 主线程:执行主方法的程序
 * 单线程程序：从main开始，从上到下按顺序执行
 * JVM执行main方法，进入栈内存，开辟main方法通向cpu的执行路径，名称为main线程，cpu通过该路径执行main方法
 *
 * 创建多线程程序的第一种方式，创建Thread类的子类。
 * 1创建Thread子类，继承Thread
 * 2子类中重写run方法，设置线程任务.
 * 3创建Thread子类对象，调用start方法，开启新线程
 *      void start（）使该线程开始执行，虚拟机调用该线程的run方法
 *      结果是两个线程并发的运行，
 *      多次启动一个线程是非法的。
 *
 */
public class Demo1Thread {
    public static void main(String[] args) {
        //压栈执行
        Demo1MyThread MT=new Demo1MyThread();//创建子类对象
        MT.run();
        MT.start();//调用子类对象，开辟新的栈空间
        new Demo1MyThread().start();//新的栈空间

        for (int i = 0; i < 20; i++) {
            System.out.println("main"+i);//随机打印 main线程与新建线程run方法
        }
    }
}
