package JavaAdv.Lambda;

/**
 * @author asus1
 * @create 2020/11/10 8:39
 * 面向对象：调用对象方法完成目标
 * 函数式：重视获取结果
 * 匿名内部类：无参数，无返回值，代码块
 * Lambda组成：参数，箭头，代码
 *             格式：   (抽象方法参数类别)->{重写代码方法}
 *             ->参数传递给方法体。
 *             {重写方法方法体}
 * lambda省略格式，可以省略
 *      凡是根据上下文推导出来的内容，都阔以省略书写
 *      可以省略的内容：
 *      1.参数列表：数据类型可省略
 *      2.参数列表中参数如果只有一个，类型和（）可以省略
 *      3.{}中只有一行 ，可以省略{}，return，分号，但必须同时省略。
 *
 * 使用前提：必须有接口，接口有且只有一个抽象方法，必须具有上下文推断，参数或局部变量类型必须为lambda的接口类型
 */
public class LambdaIntro {
    public static void main(String[] args) {
        //匿名内部类创建多线程
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName()+" is created successfully");
            }
        }).start();

        //lambda
        new Thread(()->{
            System.out.println(Thread.currentThread().getName()+" was created successfully");
        }).start();

        //优化省略lambda
        new Thread(()->System.out.println(Thread.currentThread().getName()+" was created successfully,too")).start();
    }
}
