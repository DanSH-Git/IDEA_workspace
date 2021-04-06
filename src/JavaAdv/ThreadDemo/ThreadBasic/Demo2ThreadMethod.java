package JavaAdv.ThreadDemo.ThreadBasic;

/**
 * @author asus1
 * @create 2020/11/4 9:34
 */
public class Demo2ThreadMethod {
    public static void main(String[] args) {
        Demo1MyThread mt=new Demo1MyThread();

        mt.run();//执行子类对象中重写的run方法
        System.out.println("+++++++++++");

        mt.start();//开启多线程
        mt.setName("aaaa");//设置线程名称
        System.out.println("mt-rename:"+mt.getName());
        System.out.println("mainxiancheng:"+Thread.currentThread().getName());//获取当前线程名称


        for (int i = 0; i < 10; i++) {
            System.out.println(i);
            try {
                Thread.sleep(1000);//休眠1s
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
