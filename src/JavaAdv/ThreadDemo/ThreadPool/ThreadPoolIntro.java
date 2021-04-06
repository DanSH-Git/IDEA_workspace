package JavaAdv.ThreadDemo.ThreadPool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author asus1
 * @create 2020/11/9 8:52
 * 线程池：容纳多个线程的容器，线程可以反复使用，省去了频繁创建线程对象的操作，无需反复创建销毁线程，节省资源。
 * 优势：降低资源消耗，提高响应速度，提高线程的可管理性。
 * 集合加线程，如ArrayList<Thread>,LinkedList<Thread> ,使用add（new Thread（））添加。
 * 使用remove（index）方法，返回被移除的元素（线程）。
 * 使用完毕后，再次添加
 *
 * java.util.concurrent.Executors:线程池的工厂类，用来生成线程池。
 * 该类中的静态方法：static ExecutorService newFixedThreadPool(int nThread),创建可重用，固定线程数的线程池。
 * 参数；int nThread 线程池中包含线程数量。
 * 返回类型：ExecutorService接口，返回的是该接口的实现类对象，使用接口接收，面向接口编程。
 *          用来从线程池中获取线程，调用start方法，执行线程任务。
 *          submit（Runnable task)提交一个Runnable任务用于执行
 *          销毁线程池：void shutdown（）
 *
 * 使用步骤：
 *         1.使用线程池的工厂类Executors里提供的静态方法newFixedThreadPool生产一个指定线程数量的线程池。
 *         2.创建一个类，实现Runnable接口，重写run方法。
 *         3.调用submit，传递线程任务，开启线程，执行run方法。 后或采用shutdown方法销毁线程池。
 */
public class ThreadPoolIntro {
    public static void main(String[] args) {
        //搞清楚Executors newFixedThreadPool ExecutorService之间的关系。
        // newFixedThreadPool 是Executors中的方法，用于生成；ExecutorService是newFixedThreadPool的返回类型，用于接收。
        ExecutorService es= Executors.newFixedThreadPool(2);
        es.submit(new RunnableImpl());
        es.submit(new RunnableImpl());

        es.shutdown();


    }
}
