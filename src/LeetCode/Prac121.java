package LeetCode;

/**
 * @author DanSH
 * @create 2021/3/11 20:28
 */
public class Prac121 {
    public static void main(String[] args) {
        int[] pp={2,4,1};
        int k=maxProfit(pp);
        System.out.println(k);
    }
    public static int maxProfit(int[] prices) {
// 先找最小值，匹配最小值索引值，在索引值后找最大值。
        int min=prices[0];
        int index=0;


        for(int i=0;i<prices.length;i++){
            if(min>=prices[i]){
                min=prices[i];
                index=i;
            }

        }
        System.out.println(min);
        int max=min;
        if(index==prices.length-1){
            return 0;
        }
        else{
            for(int j=index;j<prices.length;j++){
                if(max<=prices[j]){
                    max=prices[j];

                }
            }
            System.out.println(max);
            return max-min;
        }
    }
}
