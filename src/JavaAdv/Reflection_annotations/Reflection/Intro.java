package JavaAdv.Reflection_annotations.Reflection;

import java.lang.reflect.Field;

/**
 * @author asus1
 * @create 2020/12/18 9:13
 * 反射：将类的各个组成部分封装为其他对象
 *      好处：1.程序运行过程中可操作对象
 *           2.可以解耦，提高程序可拓展性
 *
 * Java代码运行三个阶段：
 *      1. 源码阶段：   .java文件通过javac编译称为.class文档
 *      2. Class类对象阶段：  通过类加载器编译为Class类对象
 *                              Filed[] fields成员变量
 *                              Constructor[] cons 构造方法
 *                              Method[] methods 成员方法
 *      3. Runtime运行阶段：  运行阶段调用
 *
 * 获取Class对象的方式(源代码阶段)：
 *      1，Class.forName("全类名"),将字节码文件加载进内存，返回Class对象
 *          多用于配置文件，将类名定义在配置文件中，读取文件，加载类
 *      2，类名.class通过类名的属性class获取
 *          多用于参数传递
 *      3，对象.getClass(); getClass()方法在Object中定义
 *          多用于对象的获取字节码的方式
 *      同一个字节码文件在一次程序运行过程中， 都只会被加载一次
 *
 *  Class对象获取功能(Class类对象阶段)，
 *      1，获取成员变量：
 *           Filed[] getFiled():获取所有public修饰的成员变量
 *           Filed getFiled(String name) 获取指定名称的public修饰的成员变量
 *           Filed[] getDeclaredField() 获取所有成员变量，不考虑修饰符
 *           Filed getDeclaredField(String name) 获取指定名称的，不限制修饰符的成员变量
 *      2，获取构造方法：
 *          Constructor< ? >[] getConstructors()
 *          Constructor<T> getConstructor(类< ? >...ParameterTypes)
 *          Constructor<T> getDeclaredConstructor(类< ? >...ParameterTypes)
 *          Constructor< ? >[] getDeclaredConstructors()
 *      3,获取成员方法：
 *          Method[] getMethods()
 *          Method getMothod(String name,类< ? >...ParameterTypes)
 *          Method[] getDeclaredMethods()
 *          Method getDeclaredMothod(String name,类< ? >...ParameterTypes)
 *      4,获取类名
 *          String getName()
 *
 *
 */
public class Intro {
    public static void main(String[] args) throws Exception {
        System.out.println("--------------------获取对象三种方式------------------");
        //同一个字节码文件在一次程序运行过程中， 都只会被加载一次
        Class aClass1 = Class.forName("JavaAdv.Reflection_annotations.Reflection.Person");
        System.out.println(aClass1);

        Class aClass2 =Person.class;
        System.out.println(aClass1);

        Person p2=new Person();
        Class aClass3=p2.getClass();
        System.out.println(aClass3);
        //

        System.out.println("------------------- Filed[] getFiled()-------------------");
        //获取Person的Class对象
       Class personClass=Person.class;
       //获取所有public修饰的成员变量
        Field[] fields=personClass.getFields();
        for (Field field : fields) {
            System.out.println(field);
        }

        System.out.println("----------------Filed getFiled(String name)-------------------");
        //获取成员变量a的值
        Field a=personClass.getField("a");
        Person p=new Person();
        System.out.println(a.get(p));
        //设置值
        a.set(p,"tom");
        System.out.println(a.get(p));

        System.out.println("----------------Filed getDeclaredFiled(String name)-------------------");
        Field[] fields2=personClass.getDeclaredFields();
        for (Field field : fields2) {
            System.out.println(field);
        }
        System.out.println("----------------Filed getDeclaredFiled(String name)-------------------");
        Field a1=personClass.getDeclaredField("c");
        a1.setAccessible(true);//忽略权限修饰符的安全检查
        Person p1=new Person();
        System.out.println(a1.get(p1));

    }
}
