package JavaAdv.ThreadDemo.ThreadState;

/**
 * @author asus1
 * @create 2020/11/6 9:40
 * 等待唤醒案例：线程之间通信
 * 创建顾客线程：告知数量，调用wait，放弃cpu的执行，进入waiting
 * 创建老板线程：休眠5s，调用notify（）方法，提醒顾客。
 * 注意；两个线程分别使用同步代码快包裹，保证同时只能有一个执行
 * 同步使用的锁对象必须保证统一
 * 只有锁独享才能调用wait和notify（）方法
 */
public class ThreadStatePrac {
    public static void main(String[] args) {
        Object obj = new Object();
        new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (obj) {
                    System.out.println("cus：需求货物");
                    try {
                        obj.wait();//告知数量后进行休眠，需要通过notify唤醒
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    //唤醒后执行下面的代码
                    System.out.println("cus：成功收货");
                }
            }
        }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(5000);
                    //首先手动休眠5s，确保顾客线程先执行
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (obj) {
                    System.out.println("boss：花了5秒生产货物");
                    obj.notify();//唤醒wait（）的线程
                }
            }
        }).start();
    }
}
