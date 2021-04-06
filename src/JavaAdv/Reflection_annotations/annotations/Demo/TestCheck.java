package JavaAdv.Reflection_annotations.annotations.Demo;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Method;

/**
 * @author asus1
 * @create 2020/12/22 21:15
 */
public class TestCheck {
    public static void main(String[] args) throws IOException {
        //创建对象
        Test test=new Test();
        //获取字节码文件对象
        Class cls=test.getClass();
        //获取所有方法
        Method[] methods=cls.getMethods();

        int number=0;//记录异常次数
        BufferedWriter bw=new BufferedWriter(new FileWriter("bug.txt"));//保留异常日志

        for (Method method : methods) {
            //判断方法上是否存在注解
            if(method.isAnnotationPresent(Check.class)){
                try {//有则执行
                    method.invoke(test);
                } catch (Exception e) {  //捕获异常
                        bw.write(method.getName()+"........ Exception");
                        bw.newLine();
                        bw.write("name:"+e.getCause().getClass().getSimpleName());
                        bw.newLine();
                        bw.write("reason"+e.getCause().getMessage());
                        bw.newLine();
                        bw.write("-------------");
                        bw.newLine();
                }
            }
        }
        bw.write(number+"次异常");
        bw.flush();
        bw.close();
    }
}
