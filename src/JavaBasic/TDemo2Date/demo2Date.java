package JavaBasic.TDemo2Date;

import java.text.SimpleDateFormat;
import java.util.Date;

public class demo2Date {
    public static void main(String[] args) {
        demo03();
    }
    private static void demo01(){
        Date date=new Date(0L);
        System.out.println(date);
    }
    private  static void demo02(){
        Date date=new Date();
        long time = date.getTime();
        System.out.println(time);
    }
    private static void demo03(){
        SimpleDateFormat st=new SimpleDateFormat();
        Date date=new Date();
        long time =date.getTime();//获取当前时间
        String s1=st.format(time);//将Date日期转换为符合模式的字符串
        System.out.println(s1);
        System.out.println(";;;;;;;;;;;;;;;");

    }
}
