package JavaBasic.TDemoInteger;

public class integ {
    public static void main(String[] args) {
//        装箱，把基本类型的数据，包装到包装类中
//        构造方法：直接声明对象

        Integer in1=new Integer(1);
        System.out.println(in1);
//        静态方法 通过valueOf赋值
        Integer in2=Integer.valueOf(1);
        System.out.println(in2);
//        拆箱 包装类中取出基本类型的数据，  基本类型Value（）
        int i3=in1.intValue();
        System.out.println(i3);
    }
}
