package JavaBasic.TDemo2Date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/*使用日期时间API，计算出生天数
* 1获取当前时间对应毫秒值
* 2获取自己出生时间对应毫秒值
* 3两个时间相减
* */
public class demo4Pra {
    /*键盘输入出生日期，提醒格式
    * 根据SimpleDateFormat设置日期格式
    * 保存输入值，使用parse转换
    * 获取当前系统时间
    * 时间做差
    * 差值除以1000*60*60*24
    *
    * */
    public static void main(String[] args) throws ParseException {
        CalDays();
    }
        private static void CalDays() throws ParseException {
            Scanner sc1=new Scanner(System.in);//键入
            System.out.println("请输入出生日期：格式为yyyy-MM-dd ");
            String sc=sc1.next();//存储键入对象
            SimpleDateFormat st=new SimpleDateFormat("yyyy-MM-dd");//创建SDF，确定日期模式
            //long s1=st.parse(sc).getTime();
            Date s=st.parse(sc);//解析文本生成日期
            long s1=s.getTime();
            long s2=new Date().getTime();//获取当前时间
            long date=(s2-s1)/24/3600/1000;
        System.out.println(date);


        }




}
