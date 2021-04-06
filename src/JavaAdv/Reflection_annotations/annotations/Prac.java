package JavaAdv.Reflection_annotations.annotations;

import java.lang.reflect.Method;

/**
 * 在程序中使用（解析）注解，获取注解中定义的属性值
 * 1.获取注解定义的位置对象（Class，Method，Field）
 * 2.获取指定的注解
 * 3.调用注解中的抽象方法，获取配置的属性值。
 */
@MyAnno3(className="JavaAdv.Reflection_annotations.annotations.Person",methodName = "eat")
public class Prac {
    public static void main(String[] args) throws Exception {
    //解析注解
        //获取该类的字节码文件对象
        Class<Prac> re=Prac.class;
        //获取上边的注解对象,内存中生成一个该注解接口的子类实现对象
        /*
        *    public class MyAnno3Impl implements MyAnno3{
        *           public String className(){
        *                   return "JavaAdv.Reflection_annotations.annotations.Person"
        *           }
        *           public String methodName(){
        *                   return "eat"
        *           }
        *
        *   }
        *
        * */

        MyAnno3 an=re.getAnnotation(MyAnno3.class);
        //调用抽象方法,获取返回值
        String clName=an.className();
        String meName=an.methodName();

        //加载类进内存
        Class cla=Class.forName(clName);
        Object obj=cla.newInstance();
        Method method=cla.getMethod(meName);
        method.invoke(obj);

    }
}