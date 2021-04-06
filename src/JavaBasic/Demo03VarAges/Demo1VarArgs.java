package JavaBasic.Demo03VarAges;

/**
 * @author asus1
 * @create 2020/10/27 9:41
 * 可变参数，当方法的参数列表数据类型已经确定，但参数的个数不确定，则使用可变参数，在定义方法时使用。
 * 使用格式：
 *   修饰符 返回值类型 方法名（数据类型...变量名）{}
 * 原理：数组根据传递参数的个数不同，创建不同长度的数组存储参数，传递参数个数可以0个
 * 注意事项：一个方法的参数列表只能用一个可变参数；可变参数位于多参数末尾，可设为Object类型。
 */
//定义方法计算整数和
public class Demo1VarArgs {
    public static void main(String[] args) {
        int[] k={1,2,3,4};
        int[] k2={1,2,3,4,5};
        System.out.println(cal(k2));
    }
    public static int cal(int...arr){
        int sum=0;
        System.out.println(arr.length);
        for (int i: arr
             ) {
            sum=sum+i;
        }
        return sum;

    }
}
