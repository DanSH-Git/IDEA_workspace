package JavaAdv.ThreadDemo.ThreadState;

/**
 * @author asus1
 * @create 2020/11/6 9:39
 * * 线程状态：
 *  *         1.New，新建状态。
 *  *         2.Runnable，运行状态。
 *  *         3.Blocked，锁阻塞状态。    2,3可仙湖转换，抢夺CPU时间。
 *  *         4.Terminated 死亡状态 。 run（）方法结束或者被终止stop（）。
 *  *         5.Timed_waiting 休眠状态，“计时”等待。  cpu空闲-》2 否则 3
 *  *         6.Waiting 无限等待，需手动唤醒  通过Object.notify()唤醒，通过Object.wait()从2转入6
 *
 *  进入5的两种方式：
 *          1，使用sleep（long m）方法，在毫秒值结束后，线程进入Runnable/Blocked状态。
 *          2，使用wait（long m）方法，wait方法如果在毫秒值结束之后，未被notify唤醒，自动醒来，抢占cpu状态，进入2/3的状态。
 *
 *  唤醒的方法：
 *          1.notify() 唤醒等待的单个线程
 *          2.notifyAll() 唤醒等待的所有线程
 */
public class Intro {
    public static void main(String[] args) {
        Object obj=new Object();
        new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (obj){
                    System.out.println("A来了");
                    try {
                        obj.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("不给我A就走了");
                }

            }
        }).start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (obj){
                    System.out.println("B来了");
                    try {
                        obj.wait(4000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("不给我B就走了");
                }

            }
        }).start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(3000);
                    System.out.println("做好了，但不给你");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (obj){
                    obj.notify();

                }
                try {
                    Thread.sleep(2000);

                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                System.out.println("恕不远送");
            }
        }).start();
    }
}
