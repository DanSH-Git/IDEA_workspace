package JavaBasic.TDemo2Date;
/*
* Date来自java.util.Date:表示时间和日期的类
* 精确到号毫秒格式1000ms=1s
* xxxx-xx-xx xx：xx：xx：xxx
*毫秒值可对时间和日期进行计算。将日期转换为毫秒计算，在转换。
* 日期转换为毫秒：
*   当前日期，时间原点（0毫秒）：1970-1-1 00:00:00
*   计算（当前日期-时间原点）System.currenTimeMillis
*中国属于东八区，会在计算日期毫秒时增加8个小时。
* */
public class demo1Demo {
    public static void main(String[] args) {
        System.out.println(System.currentTimeMillis());

    }
}
