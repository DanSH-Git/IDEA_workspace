package JavaBasic.Demo4Class;

/*局部变量与成员变量
* 位置：局部：方法内部；成员：方法外部。
* 作用范围：局部变量：方法内部调用；成员：类内全局调用
* 默认值：局部变量：无默认值，需要复制。成员：有默认值，与数据类型相同
* 内存位置：局部变量：栈，成员变量：堆
* 生命周期：局部变量：随方法生存结束；成员变量：随着对象生存结束。
* */
public class Demo3PhoneSameAdress {
    public static void main(String[] args) {
        Phone two =getPhone();
        System.out.println("Phone's color is "+ two.color);
    }
    public static Phone getPhone(){
        Phone one= new Phone();
        one.color="red";
        one.call(123);
        return one;
    }
}
