package JavaBasic.TDemo2Date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*构造方法：SimpleDateFormat(String pattern) 用给定的模式与语音㕂的日期格式符号构造
*
* 模式
* yMdHms年月日时分秒（小大小 大小小）
*yyyy-MM-dd HH:mm:ss
* yyyy年MM月dd日 HH时mm分ss秒
* */
public class demo3DateFormat {
    public static void main(String[] args) throws ParseException {
        demo1();
    }

    private static void demo1() throws ParseException {
        SimpleDateFormat st=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date=new Date();
        String sk=st.format(date);
        System.out.println(sk);
        System.out.println(";;;;;;;;;;;;;");
        Date em=st.parse(sk);
        System.out.println(em);
    }
}
