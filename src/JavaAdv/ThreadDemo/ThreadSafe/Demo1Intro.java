package JavaAdv.ThreadDemo.ThreadSafe;

/**
 * @author asus1
 * @create 2020/11/5 9:06
 * 多线程访问共享数据，会产生线程安全问题
 */
public class Demo1Intro {
    public static void main(String[] args) {
        Demo1TicketRunnable DTR=new Demo1TicketRunnable();
        Thread th1=new Thread(DTR);
        Thread th2=new Thread(DTR);
        Thread th3=new Thread(DTR);
        th1.start();
        th2.start();
        th3.start();

    }
}
