package JavaBasic.DemoException;

/**
 * @author asus1
 * @create 2020/11/1 16:22
 * try catch
 * try{
 *     可能异常代码
 * }
 * catch{
 *     try可能排除多个异常，catch可以有多个捕获不同异常
 *     异常处理逻辑，异常后如何处理异常，工作中异常信息记录到一个日志中
 *     若无异常，不执行catch中语句，执行完try后执行try catch后续代码
 * }
 * finally  无论是否出现异常都会执行，一般用于资源释放和回收
 *
 * Throwable中常用的三个方法
 * String getMessage() 返回throwable的简短描述
 * String toString（）返回throwable的详细消息字符串
 * void printStackTrace() 打印异常对象，默认此方法，异常信息覆盖全面
 *
 * 一个异常分别捕获；多个异常一次捕获，多次处理；多个异常一次捕获，一次处理。
 * 多个异常一次捕获，如果异常类型包含子父类，子类在上，父类在下，否则报错
 *
 * 父类不抛出异常，子类也不能抛出，当子类遇到异常，智能进行捕获异常。
 * 父类抛出多个异常，子类重写方法：抛出相同异常/抛出父类异常的子类异常/不抛出异常
 *
 */
public class TryCatchAndMethods {
    public static void main(String[] args) {
        String d="";
        try{
            System.out.println(d.charAt(1));

        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println(e.toString());
//            e.printStackTrace();
        }
        finally{
            System.out.println("finally");
        }
        System.out.println("no problem");
    }
}
