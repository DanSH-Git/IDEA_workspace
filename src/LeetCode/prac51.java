package LeetCode;

/**
 * @author asus1
 * @create 2021/3/5 20:45
 */
public class prac51 {
    public static void main(String[] args) {
        int[] numss={-2,1,-3,4,-1,2,1,-5,4};
        int[] nums={1,2,3};
        int x=maxSubArray(numss);
        System.out.println(x);
    }

        public static int maxSubArray(int[] nums) {
            // 将所有子列和放在一个新数组中，在对其遍历，找出最大值。
            // 首先，需要知道一共有多少项，根据长度声明数组
            // 根据等差数列的和公式知道有N*（N+1）/2项
            int lengthnum=nums.length*(nums.length+1)/2;
            int[] newNum=new int[lengthnum];
            int j=0;


                for(int i=0;i<nums.length;i++){
                    int sum=0;
                    for(int k=i;k<nums.length;k++){
                    sum=sum+nums[k];
                    newNum[j]=sum;
                    j++;
                }
            }
            for (int i = 0; i < newNum.length; i++) {
                System.out.print(newNum[i]+",");
            }
            System.out.println("+++++++++++");
            int max=newNum[0];
            int temp;
            for(int k=0;k<newNum.length;k++){
                if(max<=newNum[k]){
                    max=newNum[k];
                }
            }
            return max;
        }

}
