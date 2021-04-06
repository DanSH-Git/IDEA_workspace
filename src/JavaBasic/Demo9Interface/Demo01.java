package JavaBasic.Demo9Interface;
/*接口是多个类的公共规范
接口是一种引用数据类型
*格式
public interface name{

}

*创建实现类使用
* */
public class Demo01 implements Abs {
    @Override
    public void meth1() {
        System.out.println("1");
    }

    @Override
    public void meth2() {
        System.out.println("2");

    }

    @Override
    public void meth4() {
        System.out.println("3");

    }

    public static void main(String[] args) {
        Demo01 d=new Demo01();
//        使用一个类重写接口中的抽象方法，实例化类调用重写的接口方法
        d.meth1();
        d.meth2();
        d.meth4();
//        使用接口名称.静态方法，调用接口中的静态方法。不需要实例化使用
        Abs.me();

    }
}
