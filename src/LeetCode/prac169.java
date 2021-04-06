package LeetCode;

/**
 * @author DanSH
 * @create 2021/3/19 10:42
 *
 */
public class prac169 {
    public static void main(String[] args) {
        int[] num={6,5,5};
        int i = majorityElement(num);
        System.out.println(i);
    }
    public static int majorityElement(int[] nums) {
        int count=0;
        int cad=nums[0];
        for(int i=0;i<nums.length;i++){
            if(cad==nums[i]&&count>0){
                count++;
                System.out.println(count);
            }
            else{
                count--;
                if(count<0){
                cad=nums[i];
                System.out.println("i:"+i+",cad:"+cad+",nums:"+nums[i]);
                count=0;}
            }
        }
        return cad;

//        Arrays.sort(nums);
//        int lg=nums.length/2+1;
//        System.out.println(lg+","+nums[lg]);
//        return nums[lg];
//
//        int multi=nums.length/2;
//        HashSet<Integer> set=new HashSet<>();
//        for(int i=0;i<nums.length;i++){
//            set.add(nums[i]);
//        }
//
//        for(int j:set){
//            int sum=0;
//            for(int k=0;k<nums.length;k++){
//                if(j==nums[k]){
//                    System.out.println("第"+k+"次,j="+j+",k="+k);
//                    sum++;
//                }
//            }
//            if(sum>multi) return sum;
//        }
//        return 0;
    }
}
