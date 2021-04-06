package JavaBasic.DemoException;

/**
 * @author asus1
 * @create 2020/11/2 10:27
 *
 * 自定义异常类
 * 格式：
 * public class xxxException extends Exception()
 * 添加 空参构造方法 和 带异常信息的构造方法
 */
public class Demo3MyException extends Exception {
    public Demo3MyException(String message) {
        super(message);
    }

    public Demo3MyException() {
        super();
    }
}
