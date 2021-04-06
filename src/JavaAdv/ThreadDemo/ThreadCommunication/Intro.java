package JavaAdv.ThreadDemo.ThreadCommunication;

/**
 * @author asus1
 * @create 2020/11/8 15:23
 * 线程通信：等待与唤醒，多个线程处理同一个资源，处理的动作（任务）不同 。
 * 原因：多线程并发执行，CPU是随机切换线程的，需要协调通信，以共同操作一份数据。
 *
 * wait 不在活动，不在参与调度。需要notify唤醒
 * notify唤醒wait set中的一个线程，抢到cpu资源的由waiting转换到runnable，未抢到的转换为Blocked状态 。
 * notifyAll通知所有wait set上的全部线程。
 *上述方法必须有同一个锁对象调用；是属于Object对象；必须在同步代码快或者同步函数中进行调用
 *
 */
public class Intro {
}
