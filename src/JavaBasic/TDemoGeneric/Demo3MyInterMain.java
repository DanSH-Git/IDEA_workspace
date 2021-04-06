package JavaBasic.TDemoGeneric;

public class Demo3MyInterMain {
    public static void main(String[] args) {
        Demo3MyInterImpl<String> k=new Demo3MyInterImpl<>();
        k.meth("ooo");

        Demo3MyInterImpl<Double> k2=new Demo3MyInterImpl<>();
        k2.meth(5.6);
    }
}
