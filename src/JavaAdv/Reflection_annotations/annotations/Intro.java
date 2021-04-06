package JavaAdv.Reflection_annotations.annotations;

/**
 * @author asus1
 * @create 2020/12/21 14:28
 * 注解:也称为元数据，是代码级别的说明，声明在包、类、字段、方法、局部变量、方法参数前面对元素进行说明和注释
 * 使用： @注解名称
 *
 * 作用分类:
 *      1.编写文档:通过代码里标识的元数据生成文档
 *      2.代码分析：通过代码里标识的元数据对代码进行分析（反射）
 *      3.通过代码里标识的元数据让编译器能够实现基本的编译检查（Override）
 *
 * JDK中预定义的注解
 *      @Override :检测被标注方法是否来自父类（接口）
 *      @Deprecated ：标注已过时内容
 *      @SuppressWarnings ：压制警告
 *
 * 自定义注解：
 *      格式：
 *          元注解
 *          public @interface 注解名称{}
 *      本质：本质上是一个继承Annotation 的接口
 *          public interface MyAnno extends java.lang.annotation.Annotation
 *      属性：接口中的抽象方法
 *           要求：1.属性的返回值类型
 *                      基本数据类型；String；枚举；注解；前述类型的数组；
 *                2.定义了属性，在需要时给属性赋值
 *                      若定义属性使用default关键字给属性默认初始化值，使用注解时可不尽心属性的赋值
 *                      只有一个属性赋值，且属性铭文为value，则value可以忽略，直接定义值
 *                      数组赋值，使用{}包裹，仅一值省略{}
 *      元注解：用于描述注解的注解
 *              @Target: 描述注解能够作用的位置
 *                       ElementType 取值：
 *                          TYPE：只能作用于类
 *                          METHOD：只能作用于方法
 *                          FIELD：作用于成员变量
 *              @Retention: 描述注解被保留的阶段
 *                      RetentionPolicy.RUNTIME保存到class字节码文件，被JVM读取到
 *              @Documented: 描述注解是否被抽取到api文档中
 *              @Inherited: 描述注解是否被子类继承
 */
public class Intro {
    /**
     *
     * @param a
     * @param b
     * @return sum
     */
    public int add(int a,int b){
        return a+b;
    }
    //预定义的注解
    @Override
    public String toString() {
        return "Intro{}";
    }
    @Deprecated
    public void show(){}
    @SuppressWarnings("all")
    public void demo(){
        show();
    }
    @MyAnno(show1=1,show2="1",per=Person1.p1,anno=@MyAnno2,strs = {})
    public void myMethod(){}

}
