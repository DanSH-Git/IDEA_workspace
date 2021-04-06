package JavaAdv.FunctionInterFace;

/**
 * @author asus1
 * @create 2020/12/4 15:21
 * 有且只有一个抽象方法，接口可包含其他方法（默认，静态，私有）
 *@FunctionalInterface  用于检测接口是否是一个函数式接口
 */
@FunctionalInterface
public interface MyFI {
//    有且只有一个抽象方法
    public abstract  String method();
}
