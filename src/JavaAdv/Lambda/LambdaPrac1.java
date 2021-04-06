package JavaAdv.Lambda;

/**
 * @author asus1
 * @create 2020/11/10 8:59
 */
public class LambdaPrac1 {
    public static void main(String[] args) {

        invokeCook(( )->{
            System.out.println("eating!");
        });
    }
    private static void invokeCook(Prac1Cook cook){
        cook.makefood();
    }
}
