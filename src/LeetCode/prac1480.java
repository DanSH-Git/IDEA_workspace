package LeetCode;

/**
 * @author asus1
 * @create 2020/10/26 20:13
 * 给你一个数组 nums 。数组「动态和」的计算公式为：runningSum[i] = sum(nums[0]…nums[i]) 。
 *
 * 请返回 nums 的动态和。
示例 1：
输入：nums = [1,2,3,4]
输出：[1,3,6,10]
解释：动态和计算过程为 [1, 1+2, 1+2+3, 1+2+3+4] 。

示例 2：
输入：nums = [1,1,1,1,1]
输出：[1,2,3,4,5]
解释：动态和计算过程为 [1, 1+1, 1+1+1, 1+1+1+1, 1+1+1+1+1] 。

 */
public class prac1480 {
    public static void main(String[] args) {
        int[] sum1={1,2,3,4,5};
        int[] sum2=runningSum(sum1);
        for (int k:sum2
             ) {
            System.out.println(k);
        }

    }
    public static int[] runningSum(int[] nums) {
        int[] num2=new int[nums.length];
        int sum=0;
        for (int i = 0; i < nums.length; i++) {
            sum=nums[i]+sum;
            num2[i]=sum;
        }
        return num2;
    }
}
