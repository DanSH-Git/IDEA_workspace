package LeetCode;
/*
* 给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那 两个 整数，并返回他们的数组下标。
你可以假设每种输入只会对应一个答案。但是，数组中同一个元素不能使用两遍。
示例:
给定 nums = [2, 7, 11, 15], target = 9
因为 nums[0] + nums[1] = 2 + 7 = 9
所以返回 [0, 1]
。*/
import java.util.Arrays;

public class sum1 {
    public static void main(String[] args) {
        int[] mm = {1, 2, 3, 4};
        System.out.println(123%10);
        System.out.println(Arrays.toString(twoSum(mm, 4)));
    }

    public static int[] twoSum(int[] nums, int target) {
        int[] k = new int[2];
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target && i != j) {
                    k[0] = i;
                    k[1] = j;
                }
            }
        }
        return k;
    }
}
