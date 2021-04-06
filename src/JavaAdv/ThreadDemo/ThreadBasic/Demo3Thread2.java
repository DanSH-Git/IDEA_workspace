package JavaAdv.ThreadDemo.ThreadBasic;

/**
 * @author asus1
 * @create 2020/11/4 10:35
 * 创建多线程的第二种方法：实现Runnable接口，由通过某一线程执行实例类来实现，类必须定义一个称为run的无参方法。
 * 构造方法：
 * Thread（Runnable target）分配新的Thread对象
 * Thread（Runnable target，String name）分配新的Thread对象。
 * 创建步骤：
 * 1.创建一个Runnable接口的实现类
 * 2.重写Runnable接口的run方法，设置线程任务
 * 3.创建一个Runnable接口的实现类对象、
 * 4.创建Thread类对象，构造方法中传递Runnable接口的实现类对象
 * 5.调用Thread类中的start方法，开启新的线程执行run方法。
 * <p>
 * 优势：
 * 1.避免了单继承的局限类：接口可以继承多个，同时还可以同时继承类；而继承Thread类就无法继承其他类
 * 2.增强扩展性，降低耦合性，分离了 设置线程任务（不同的接口实现类对象） 和 开启新线程（Thread传递不同对象）。
 */
public class Demo3Thread2 {
    public static void main(String[] args) {
        Demo3RunnableImpl RI = new Demo3RunnableImpl();//Runnable接口的实现类对象
        Thread th = new Thread(RI);//传递这个对象
        th.start();
//        for (int i = 0; i < 5; i++) {
//            System.out.println(Thread.currentThread().getName() + i);
//        }
        new Thread() {
            @Override
            public void run() {

                for (int i = 0; i < 5; i++) {
                    System.out.println("+++++++++++++++++++++++++++++");
                    System.out.println("匿名内部类Thread");
                    setName("InterClassThread");
                    System.out.println(Thread.currentThread().getName() + i);
                    System.out.println("+++++++++++++++++++++++++++++");
                }
            }
        }.start();
        // new Thread(){run()}
        //以第一种方式创建多线程的匿名内部类，创建Thread对象，重写run方法

        new Thread(new Runnable(){
            @Override
            public void run() {
                for (int i = 0; i < 5; i++) {
                    System.out.println("----------------------------");
                    System.out.println("匿名内部类Runnable");
                    System.out.println(Thread.currentThread().getName() +"###"+ i);
                    System.out.println("----------------------------");
                }
            }
        }).start();
        //new Thread(new Runnable(){run})
        //以第二种方式创建多线程的匿名内部类实现方式，
        // 创建Thread对象， 新建Runnable接口对象，重写run方法，对象传递过去
    }
}
