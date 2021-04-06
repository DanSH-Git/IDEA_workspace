package JavaBasic.Demo9Interface;
/*接口中可定义抽象方法
        接口的成员方法 public static final
        public abstract type name();

*public static final接口中的常量（成员变量）。
             采用 接口.常量名 调用。
             一旦赋值，不能改变。
             常量名称完全大写，用下划线进行分隔

默认方法 publice default 返回值类型 方法名称（参数列表）{方法体}

静态方法 public static 返回值类型 方法名称（参数列表）{方法体}
    通过接口名称调用，不通过类方法调用
*
* */
public interface Abs {
    public abstract void meth1();
    abstract  void meth2();
    void meth4();
    static void me(){
        System.out.println("6");
    }

}
