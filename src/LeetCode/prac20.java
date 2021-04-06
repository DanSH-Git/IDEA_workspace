package LeetCode;

import java.util.Stack;

/**
 * @author asus1
 * @create 2020/10/31 15:02
 */
public class prac20 {
    public static void main(String[] args) {
        String s = "(({[}]))";
        System.out.println(isValid(s));

    }

    public static boolean isValid(String s) {
        if (s.length() % 2 == 1) return Boolean.FALSE;
        Stack<Character> chr=new Stack<>();
        for (char c:s.toCharArray()
             ) {
            if(c=='('){
                chr.push(')');
            }
            if(c=='['){
                chr.push(']');
            }
            if(c=='{'){
                chr.push('}');
            }

        }
        return chr.isEmpty();

    }
}
