package JavaAdv.FunctionInterFace.Supplier;

import java.util.function.Supplier;

/**
 * @author asus1
 * @create 2020/12/7 10:27
 * 使用Supplier接口作为方法参数类型，通过lambda表达式求出int数组中的最大值，接口泛型使用java.lang.Integer
 */
public class SupplierPrac {
    public static void main(String[] args) {
        int[] kk={4,3,6,1,7,5};
        int max=getMax(()->{
            int maxnum=kk[0];
            for (int i = 0; i < kk.length; i++) {
                if(kk[i]>maxnum){
                    maxnum=kk[i];
                }
            }

            return maxnum;
        });
        System.out.println(max);
    }
    public static int getMax(Supplier<Integer> integerSupplier){
        return integerSupplier.get();
    }
}
