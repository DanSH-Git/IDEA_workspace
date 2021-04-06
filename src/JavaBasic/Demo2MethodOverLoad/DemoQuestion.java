package JavaBasic.Demo2MethodOverLoad;

public class DemoQuestion {
    public static void main(String[] args) {
        System.out.println(compare(1,2));


    }
    public static boolean compare(byte a, byte b){
        return a==b;
    }
    public static  boolean compare(short a,short b){
        return  a==b;
    }
    public static  boolean compare(int a, int b){
        return a==b;
    }

}
