package JavaAdv.ThreadDemo.ThreadSafe;

/**
 * @author asus1
 * @create 2020/11/5 9:39
 *方案一：解决线程安全，防止线程冲突，使用同步代码块
 * 格式：
 *    synchronized（锁对象）{
 *        可能出现线程安全的代码
 *    }
 *    1.锁对象可以使用任意对象
 *    2.保证多个线程使用的锁对象是同一个
 *    3.锁对象可以吧同步代码块锁住，只让一个线程在同步代码块中执行
 *过程：
 *    判断锁-获取锁-释放锁
 *
 *方案二：使用同步方法
 *   步骤：
 *      1.访问共享数据的代码抽取，放到一个方法中。
 *      2.为方法添加Synchronized修饰符。
 *   格式：定义方法的格式
 *        修饰符 synchronized 返回值类型 方法名（参数列表）{共享数据代码块}
 *
 */
public class Demo2Synchronized {
}
