package JavaAdv.ThreadDemo.ThreadSafe;

/**
 * @author asus1
 * @create 2020/11/5 10:27
 * 第三种方案：使用lock锁
 * lock实现提供了比使用synchronized更加广泛的锁定操作，
 * lock接口中的方法
 *      void lock（）
 *      void unlock（）
 *      java.util.concurrent.locks.ReentrantLock implemnets Lock接口
 * 使用步骤：
 *      1，成员位置创建ReentrantLock对象
 *      2，可能出现安全问题代码前调用Lock接口中的lock方法获取锁
 *      3，可能出现安全问题代码后调用Lock中的unlock释放锁
 */
public class Demo3Lock {
    public static void main(String[] args) {
        Demo3RunnableLock dt=new Demo3RunnableLock();
        Thread th=new Thread(dt);
        Thread th1=new Thread(dt);
        Thread th2=new Thread(dt);
        th.start();
        th1.start();
        th2.start();
    }
}
