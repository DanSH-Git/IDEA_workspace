package JavaAdv.Reflection_annotations.Reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

/**
 * @author asus1
 * @create 2020/12/19 14:51
 *  2，获取构造方法：
 *  *          Constructor< ? >[] getConstructors()
 *  *          Constructor<T> getConstructor(类< ? >...ParameterTypes)
 *  *          Constructor<T> getDeclaredConstructor(类< ? >...ParameterTypes)
 *  *          Constructor< ? >[] getDeclaredConstructors()
 *
 *    3,获取成员方法：
 *  *          Method[] getMethods()
 *  *          Method getMothod(String name,类< ? >...ParameterTypes)
 *  *          Method[] getDeclaredMethods()
 *  *          Method getDeclaredMothod(String name,类< ? >...ParameterTypes)
 */
public class Demo1ConsMethod {
    public static void main(String[] args) throws Exception {
        System.out.println("------------------- Constructor< ? >[] getConstructors()-------------------");
        //第一阶段获取class对象
        Class personClass=Person.class;
        //获取构造器
        Constructor cons=personClass.getConstructor(String.class,int.class);
        //创建对象
        Object person=cons.newInstance("tom",12);
        System.out.println(person);


        System.out.println("------------------- getMethods()-------------------");

        Person p=new Person();
        //获取指定名称的方法，利用invoke执行方法，
        personClass.getMethod("eat").invoke(p);//不含参数
        personClass.getMethod("eat",String.class).invoke(p,":rice");//含参数，先指定类型，在添加参数
        //获取所有public修饰的方法
        Method[] methods=personClass.getMethods();
        for (Method method : methods) {
            System.out.println("me::::"+method);
        }


        System.out.println("-------------------  String getName()-------------------");
        String cla=personClass.getName();
        System.out.println(cla);
    }

}
