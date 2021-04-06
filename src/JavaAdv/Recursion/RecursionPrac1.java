package JavaAdv.Recursion;

/**
 * @author asus1
 * @create 2020/11/12 9:30
 * 使用递归计算1到n的和
 * 使用递归计算阶乘
 */
public class RecursionPrac1 {
    public static void main(String[] args) {
        System.out.println(Add(-1));
        System.out.println(Multi(6));
    }

    private static int Multi(int i) {
        while (i - 1 >= 0) {
            return Multi(i - 1) * i;
        }
        return 1;
    }

    private static int Add(int i) {
        while (i - 1 >= 0) {
            return Add(i - 1) + i;
        }
        return 0;
    }
}
