package LeetCode;

import java.util.Arrays;
import java.util.HashMap;

/**
 * @author DanSH
 * @create 2021/4/1 10:16
 * 给定一个非空的整数数组，返回其中出现频率前 k 高的元素。
 * 示例 1:
 *
 * 输入: nums = [1,1,1,2,2,3], k = 2
 * 输出: [1,2]
 *
 * 示例 2:
 *
 * 输入: nums = [1], k = 1
 * 输出: [1]
 */
public class Prac347 {
    public static void main(String[] args) {
        int[] num={-1,-1};
        int k=1;
        topKFrequent(num,k);

    }
    public static int[] topKFrequent(int[] nums, int k) {
        int[] sum=new int[k];
        // 创建一个HashMap，遍历数组，存储元素为key，出现次数为value；
        //
        HashMap<Integer,Integer> map=new HashMap();
        for(int num:nums){
            if(map.containsKey(num)){
                map.put(num,map.get(num)+1);
            }
            else{
                map.put(num,1);
            }
        }
        // 获取值，存入数组
        int[] keyss=new int[map.size()];
        int i=0;
        for(Integer l:map.values()){
            keyss[i]=l;
            i++;
        }
        // 排序
        Arrays.sort(keyss);
        // 取出现频率最高的前k个值
        int[] temp=new int[k];
        for(int j=0;j<k;j++){
            temp[j]=keyss[keyss.length-1-j];
        }
        // 包含值 返回key key为高频值
        for(int n=0;n<k;n++){
            if(map.containsValue(temp[n])){
                sum[n]=map.get(temp[n]);
            }
        }
        for (int a = 0; a < sum.length; a++) {
            System.out.println(sum[a]);
        }
        return sum;
    }
}
