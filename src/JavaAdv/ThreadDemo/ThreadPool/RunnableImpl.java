package JavaAdv.ThreadDemo.ThreadPool;

/**
 * @author asus1
 * @create 2020/11/9 9:29
 */
public class RunnableImpl implements Runnable {
    @Override
    public void run() {
        System.out.println("+++++++++++++++++++++++++++++++++++++++");
        System.out.println("重写run方法");
        System.out.println("Name:"+Thread.currentThread().getName());
        System.out.println("创建新线程");
    }
}
