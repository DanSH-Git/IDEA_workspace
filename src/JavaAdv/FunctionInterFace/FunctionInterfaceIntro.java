package JavaAdv.FunctionInterFace;

/**
 * @author asus1
 * @create 2020/12/4 15:16
 * 函数式接口：有且仅有一个抽象方法的接口。
 *            适用于函数式编程的接口，java中体现的Lambda。
 *            lambda:延迟加载，使用前提，必须使用函数式接口
 * 格式;
 *      修饰符 interface 接口名称{
 *          public abstract 返回值类型 方法名称（参数）；
 *      }
 *
 *
 */
public class FunctionInterfaceIntro {

    public static  void showlog(int level,MyFI fi){
        if (level==1){
            System.out.println(fi.method());
        }
    }

    public static void main(String[] args) {
        String s1="aaa";
        String s2="bbb";
        String s3="ccc";
        /*此处使用匿名内部内，仅仅将参数传递到showlog方法中，满足条件才会调用接口
        * 防止性能浪费，
        * */
        showlog(1,()->{
            return s1+s2+s3;
        });
}
}
