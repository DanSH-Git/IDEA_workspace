package JavaAdv.Reflection_annotations.annotations;

/**
 * @author asus1
 * @create 2020/12/21 15:04
 */
public @interface MyAnno {
    //注解中可定义方法
    int show1();
    String show2();
    MyAnno2 anno();
    String[] strs();
    Person1 per();
}
