package JavaAdv.Lambda;

/**
 * @author asus1
 * @create 2020/11/10 9:33
 */
public class LambdaPrac3 {
    public static void main(String[] args) {
        int a = 120;
        int b = 130;
        invokeCalc(a, b, (int c, int d) -> {
            int result = a + b;
            return result;
        });

        //省略
        invokeCalc(a, b, (c, d) ->a + b);
    }

    private static void invokeCalc(int a, int b, Prac3Cal cal) {
        int result = cal.calc(a, b);
        System.out.println("Result is:" + result);
    }
}
