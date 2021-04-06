package LeetCode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author asus1
 * @create 2020/10/30 11:13
 * 判断一个整数是否是回文数。回文数是指正序（从左向右）和倒序（从右向左）读都是一样的整数。
 * <p>
 * 示例 1:
 * 输入: 121
 * 输出: true
 * <p>
 * 示例 2:
 * 输入: -121
 * 输出: false
 * 解释: 从左向右读, 为 -121 。 从右向左读, 为 121- 。因此它不是一个回文数。
 * <p>
 * 示例 3:
 * 输入: 10
 * 输出: false
 * 解释: 从右向左读, 为 01 。因此它不是一个回文数。
 */
public class prac9 {
    public static void main(String[] args) {
        int x = 121;
        System.out.println(isPalindrome(x));

    }

    public static boolean isPalindrome(int x) {
        StringBuffer sb = new StringBuffer();
        sb.append(x);
        List<Integer> list = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        for (int i = 0; i < sb.length(); i++) {
            //char-->String :String.valueOf
            //String-->Interger:Interger.parseInt
            list.add(Integer.parseInt(String.valueOf(sb.charAt(i))));
            list2.add(Integer.parseInt(String.valueOf(sb.charAt(i))));
        }
        System.out.println(list);
        System.out.println(list2);
        Collections.reverse(list);
        System.out.println(list);
        System.out.println(list2);

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) != list2.get(i)) {
                return Boolean.FALSE;
            }
        }

        return Boolean.TRUE;
    }
}







