package JavaAdv.ThreadDemo.ThreadBasic;

/**
 * @author asus1
 * @create 2020/11/3 10:46
 * 并发：指两个或者多个事件在同一时间段发生，（交替执行（单核单线程））
 * 并行：指两个或者多个时间在同一时刻发生（同时发生（多核多线程））
 *
 * 进程：应用程序可运行多个进程，是程序进入内存一次执行过程。是系统运行程序的基本单位。创建--运行--小王
 * 线程：进程中的一个执行单元，一个进程中至少有一个线程。
 * 线程调度：1.分时调度，平均分配每个线程占用CPU的时间
 *          2.抢占式调度，优先级高先使用，优先级相同时随机选择一个（线程随机性），Java为抢占式调度。
 *
 * 线程状态：
 *         1.New，新建状态。
 *         2.Runnable，运行状态。
 *         3.Blocked，锁阻塞状态。    2,3可仙湖转换，抢夺CPU时间。
 *         4.Terminated 死亡状态 。 run（）方法结束或者被终止stop（）。
 *         5.Timed_waiting 休眠状态，“计时”等待。  cpu空闲-》2 否则 3
 *         6.Waiting 无限等待，需手动唤醒  通过Object.notify()唤醒，通过Object.wait()从2转入6
 *
 *
 */
public class Intro {
}
