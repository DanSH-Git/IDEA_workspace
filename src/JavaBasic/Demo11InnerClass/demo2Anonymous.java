package JavaBasic.Demo11InnerClass;

/*
* 一般方法：
* 1创建抽象类与抽象方法
* 2创建抽象类的子类方法
* 3子类中重写抽象类的抽象方法
* 4调用子类对象下重写方法实现功能
*
* 匿名内部类：
* 将上述步骤化作一步，创建抽象类对象，然后直接重写。
*
* */
public class demo2Anonymous  {
    public static void main(String[] args) {
        demo2Abs f=new demo2Abs() {
            @Override
            public void fly() {
                System.out.println("ye");
            }
        };
        showfly(f);/*匿名内部类作为参数传递*/


        /*将上述步骤合并，调用方法，参数中新建子类对象，然后重写匿名方法*/
        showfly(new demo2Abs() {
            @Override
            public void fly() {
                System.out.println("ooo");
            }
        });
    }

    public static void showfly(demo2Abs f) {
        f.fly();
    }
}
