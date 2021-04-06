package LeetCode;

/**
 * @author asus1
 * @create 2020/10/27 16:55
 * 给你一个整数数组 nums 。
 *
 * 如果一组数字 (i,j) 满足 nums[i] == nums[j] 且 i < j ，就可以认为这是一组 好数对 。
 *
 * 返回好数对的数目。

 * 示例 1：
 * 输入：nums = [1,2,3,1,1,3]
 * 输出：4
 * 解释：有 4 组好数对，分别是 (0,3), (0,4), (3,4), (2,5) ，下标从 0 开始
 *
 * 示例 2：
 * 输入：nums = [1,1,1,1]
 * 输出：6
 * 解释：数组中的每组数字都是好数对

 */
public class prac1512 {
    public static void main(String[] args) {
        int[] nums={1,2,3,1,1,3};
        System.out.println(numIdenticalPairs(nums));
    }
    public static int numIdenticalPairs(int[] num){
        int i=0;
        for (int i1 = 0; i1 < num.length; i1++) {
            for (int i2 = 0; i2 < num.length; i2++) {
                if(num[i1]==num[i2]&&i1<i2){
                    i++;
                }
            }
        }
        return i;
    }
}
