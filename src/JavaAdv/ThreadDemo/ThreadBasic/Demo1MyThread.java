package JavaAdv.ThreadDemo.ThreadBasic;

/**
 * @author asus1
 * @create 2020/11/3 15:10
 */
public class Demo1MyThread extends Thread {
    @Override
    public void run() {

        String name=getName();//获取线程名称
        System.out.println("Thread-name:"+name);
        System.out.println("当前线程"+Thread.currentThread().getName());
        for (int i = 0; i < 5; i++) {
            System.out.println("run"+i);
        }
    }
}
