package JavaBasic.TDemoCalendar;

import java.util.Calendar;

/*
* 日历类 java.util.calendar
* 抽象类，提供操作日历操作的方法，无法直接创建对象使用
* 存在静态方法，getInstance ，返回Calendar子类对象
* */
public class demo {
    public static void main(String[] args) {
        Calendar c=Calendar.getInstance();
        System.out.println(c);//获取当前日期

        int a=c.get(Calendar.YEAR);
        System.out.println(a);
        c.set(Calendar.YEAR,2012);//重新设定日期
        int year=c.get(Calendar.YEAR);//get字段 获取日期
        System.out.println(year);
        c.set(2021,1,1);//同时设置多字段
        System.out.println();
        int year1=c.get(Calendar.YEAR);
        int mon=c.get(Calendar.MONTH);
        int da=c.get(Calendar.DATE);//get年月日
        System.out.println(year1+","+mon+","+da);

        c.add(Calendar.YEAR,-1);//add修改值
        System.out.println(c.get(Calendar.YEAR));

    }
}
