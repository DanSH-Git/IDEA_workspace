package LeetCode;
/*
* 给出一个 32 位的有符号整数，你需要将这个整数中每位上的数字进行反转。
*示例 1:
输入: 123
输出: 321
*
 示例 2:
输入: -123
输出: -321
*
示例 3:
输入: 120
输出: 21

* */
/*判断正负，判断是否为0，num存运算数字 sum存新数字*/
public class Reverse7 {
    public static void main(String[] args) {
        int o=-123;
        int k=Math.abs(o);
        String l =String.valueOf(k);
        int len=l.length();//获取长度
        String stk=Integer.toString(k);
        System.out.println(len);
        int[] k2=new int[len];
        char[] k3=new char[len];
        int sum=0;
        for (int i = 0; i < k2.length; i++) {
            k3[i]=stk.charAt(len-1-i);
            k2[i]=Integer.parseInt(String.valueOf(k3[i]));
            System.out.println("stk:"+stk.charAt(i));
            System.out.println(k2[i]);
        }
        StringBuffer sb=new StringBuffer(stk).reverse();
        stk=sb.toString();
        long ll=Long.parseLong(stk);
        int ppp=(int) ll;
        System.out.println(ppp);
        System.out.println(stk);
        for (int i = 0; i < k2.length; i++) {
            sum=sum+k2[i]*(int)Math.pow(10,len-1-i);
        }
        System.out.println("sum:"+sum);


    }
}
