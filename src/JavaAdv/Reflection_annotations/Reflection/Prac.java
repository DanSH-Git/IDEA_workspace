package JavaAdv.Reflection_annotations.Reflection;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.util.Properties;

/**
 * @author asus1
 * @create 2020/12/19 15:34
 * 写一个框架，帮助创建任意类的对象，执行其中的任意方法
 * 步骤：
 *      1.配置文件
 *      2.反射
 * 实现：
 *      1.将创建对象的全类名和需要执行的方法定义在配置文件中
 *      2.程序中加载读取配置文件
 *      3.使用反射加载类文件进内存
 *      4.创建对象，执行方法
 */
public class Prac {
    public static void main(String[] args) throws IOException, ClassNotFoundException, IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException {
        Properties pro=new Properties();
        //获取文件路径
//        ClassLoader cl=Prac.class.getClassLoader();
//        InputStream is=cl.getResourceAsStream("pro.properties");
        InputStream is = Prac.class.getClassLoader().getResourceAsStream("pro.properties");
        pro.load(is);
        //获取数据

        String cname=pro.getProperty("className");
        String mname=pro.getProperty("methodName");
        //加载类进内存
//        Class cla=Class.forName(cname);
//        Object obj=cla.newInstance();
        Object obj = Class.forName(cname).newInstance();
//        Method method=cla.getMethod(mname);
//        method.invoke(obj);
        Class.forName(cname).getMethod(mname).invoke(obj);
    }
}
