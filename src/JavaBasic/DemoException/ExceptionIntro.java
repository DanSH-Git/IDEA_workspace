package JavaBasic.DemoException;

/**
 * @author asus1
 * @create 2020/10/31 15:52
 * Throwable:Error,Exception
 * Exception 编译期异常，编译中出现的问题。
 * RuntimeException：运行期异常，运行过程中出现的异常。
 *    可使用Throw进行抛出，让虚拟机进行处理，若有问题，则会在控制台打印异常类型
 *    使用Try。。。catch方式处理，处理后可正确执行。
 *            try{
 *                可能出现异常的代码
 *            }catch（Exception e）{
 *                异常的处理逻辑
 *            }
 * Error：修改源代码才能运行。
 *
 * 处理逻辑：
 * JVM在虚拟方法中，根据异常类型，创建异常独享，对象包含异常的内容，原因，位置。
 * 方法中没有异常的处理逻辑（try。。catch），JVM将异常抛出给调用者。
 * 调用者无处理逻辑，则把异常对象包含以红色字体打印在控制台，JVM中断正在执行的java程序，即中断处理。
 *
 */
public class ExceptionIntro {

}
