package JavaAdv.ThreadDemo.ThreadBasic;

/**
 * @author asus1
 * @create 2020/11/4 10:42
 */
public class Demo3RunnableImpl implements Runnable{
    @Override
    public void run() {

        for (int i = 0; i < 5; i++) {
            System.out.println("**********************************");
            //System.out.println("当前线程名称："+Thread.currentThread().getName());
            System.out.println("Runnbale:"+i);
            System.out.println("**********************************");
        }
    }
}
