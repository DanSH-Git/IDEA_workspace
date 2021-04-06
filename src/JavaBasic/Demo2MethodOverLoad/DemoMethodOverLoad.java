package JavaBasic.Demo2MethodOverLoad;
/*
* 方法重载：多个方法名称一样，但参数列表不同
* 仅需记住一个方法名称，即可调用实现多个功能
* 参数类型不同，个数不同，多类型顺序不同
* 无关因素：与名称无关，与返回值类型无关
* */
public class DemoMethodOverLoad {
    public static void main(String[] args) {
        System.out.println(sum(1,2));
        System.out.println(sum(1,2,3));
    }
    public static int sum(int a, int b){
        return a+b;
    }
    public static  int  sum(int a ,int b, int c){
        return a+b+c;

    }
}
