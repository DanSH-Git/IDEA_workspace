package JavaBasic.Demo7Extends;

/*方法覆盖重写
* 1.必须保证父子类之间的方法名称相同，参数列表也相同
* 2.@override写在方法前面，用来检测是不是有效的方法覆盖重写
* 3.子类方法的返回值必须 小于等于 父类方法的返回值范围。
* java.lang.Object是所有类的公共最高父类
* 4. 子类方法权限必须 大于等于 父类方法的权限修饰符
* public>protected>(default)>private
*使用覆盖重写：部分方法重写。
*
* 继承关系中，父子类构造方法 public  class name访问特点：
* 1.子类方法中默认隐含一个super（），一定先调用父类操作，后执行子类构造.
* 2，子类构造可通过super调用父类重载构造
* 3.super父类构造调用，必须是子类构造方法的第一个语句，不能一个子类调用多次super
*
* 继承：
* 1.一个类的直接父类只有一个
* 2.可以多级继承 A extends B, B extends C
* */
public class Demo1 {
    public static void main(String[] args) {
        Zi zi=new Zi();
        zi.call();
        zi.send();
    }
}
