package JavaAdv.ThreadDemo.ThreadSafe;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author asus1
 * @create 2020/11/5 10:59
 */
public class Demo3RunnableLock implements Runnable {
    private int ticket=10;
    Lock lck=new ReentrantLock();
    @Override
    public void run() {
        while(ticket>0){
            lck.lock();
            if(ticket>0){
                try{
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("线程："+Thread.currentThread().getName()+"正在卖"+ticket+"张票");
                ticket--;
            }
            lck.unlock();
        }
    }
}
