package JavaAdv.Stream.MethodRefer3;

/**
 * @author asus1
 * @create 2020/12/16 10:02
 */
public class Son extends Father {
    public void sayHello(){
        System.out.println("hell0, this is son");
    }
    public void  method(Greatable g){
        g.greet();
    }
    public void show(){
        /*method(()->{
            Father f=new Father();
            f.sayHello();
        });*/
        method(()->{super.sayHello();});
        method(super::sayHello);
    }

    public static void main(String[] args) {
        new Son().show();
    }
}
