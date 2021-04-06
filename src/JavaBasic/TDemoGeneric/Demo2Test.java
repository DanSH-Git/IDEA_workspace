package JavaBasic.TDemoGeneric;

public class Demo2Test{
    public static void main(String[] args) {
        Demo2MyClass<String> k=new Demo2MyClass<>();
        k.methd("sss");
        Demo2MyClass<Integer> k1=new Demo2MyClass<>();
        k1.methd(1);
        /*在创建对象是选择我们想要选择的类型*/

    }



}
