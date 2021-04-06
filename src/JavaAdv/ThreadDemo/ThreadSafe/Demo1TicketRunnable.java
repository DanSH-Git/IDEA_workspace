package JavaAdv.ThreadDemo.ThreadSafe;

/**
 * @author asus1
 * @create 2020/11/5 9:17
 */
public class Demo1TicketRunnable implements Runnable {
    private static int ticket = 10;
    Object obj = new Object();

    //方法一：同步代码块
//    @Override
//    public void run() {
//        while (ticket>0) {
//            synchronized (obj) {
//
//                if (ticket > 0) {
//                    try {
//                        Thread.sleep(2000);
//                    } catch (InterruptedException e) {
//                        e.printStackTrace();
//                    }
//                    System.out.println("当前线程" + Thread.currentThread().getName() + "正在卖第" + ticket + "张票");
//                    ticket--;
//                }
//            }
//        }
//    }
//---------------------------------------------
//方法二,同步方法
    @Override
    public void run() {
        while (ticket > 0) {
        SellTicket();}
    }
    //添加static，称为静态的同步方法，锁对象不是this，this是创建对象后产生，静态方法优先于对象产生，输入类的class属性。
    public static synchronized void SellTicket() {

            if (ticket > 0) {
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("当前线程" + Thread.currentThread().getName() + "正在卖第" + ticket + "张票");
                ticket--;
            }

    }
}