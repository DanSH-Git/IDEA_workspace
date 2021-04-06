package JavaAdv.Stream.MethodRefer4;

/**
 * @author asus1
 * @create 2020/12/16 10:16
 * this 引用本类的成员方法
 *
 */
public class Man {
    public void buy1(){
        System.out.println("方法1");
    }
    public void buy2(Richable r){
        r.buy();
    }
    public void buy3(){
//        buy2(()->{
//            this.buy1();
//        });
        buy2(this::buy1);
    }
    public static void main(String[] args) {
        new Man().buy3();
    }
}
