package LeetCode;

/**
 * @author DanSH
 * @create 2021/3/20 14:01
 * 给你一个字符串 s，由若干单词组成，单词之间用空格隔开。返回字符串中最后一个单词的长度。如果不存在最后一个单词，请返回 0 。
 *
 * 单词 是指仅由字母组成、不包含任何空格字符的最大子字符串。
 *
 *
 *
 * 示例 1：
 *
 * 输入：s = "Hello World"
 * 输出：5
 *
 * 示例 2：
 *
 * 输入：s = " "
 * 输出：0

 */
public class prac58 {
    public static void main(String[] args) {
        String s= "Hello World";
        String s1="hh bb  ccc   ";
        System.out.println(lengthOfLastWord(s));
    }
    public static int lengthOfLastWord(String s) {
        String[] s1 = s.split(" ");
        if(s1.length<1) return 0;


        return s1[s1.length - 1].length();


    }
}
