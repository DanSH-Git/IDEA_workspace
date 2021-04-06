package JavaBasic.TDemoInteger;
/*
* 基本类型 转换为字符串
* 基本类型--》字符串
* 1.使用基本类型的值+""
* 2.使用包装类中的静态方法toString（int i）
* 3使用String类中的静态方法 valueOf（int i）
*
*字符串--》基本类型
* 使用包装类的parseXX（“字符串”）
* Integer--int
* Charastic--char
* Double--double
*
*
* */
public class Demo2type {
    public static void main(String[] args) {
        String s1=100+"";
        System.out.println(s1+200);
        String s2= s1.toString();
        System.out.println(s2);
        String s3=String.valueOf(s1);
        System.out.println(s3);

        int s4=Integer.parseInt(s1);
        System.out.println(s4);

        String s5="2.12";
        double s6=Double.parseDouble(s5);
        System.out.println(s6);

    }
}
