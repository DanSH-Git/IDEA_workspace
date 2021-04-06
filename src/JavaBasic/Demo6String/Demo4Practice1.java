package JavaBasic.Demo6String;

import java.util.Scanner;

/*定义一个方法，把数组{1,2,3}按照指定个数拼接成一个字符串个数如下
* [1#2#3]
* */
public class Demo4Practice1 {
    public static void main(String[] args) {
        int[] arary={1,2,3};
        convert(arary);
        Scanner sc=new Scanner(System.in);
        System.out.println("input");
        String s=sc.next();
        Count(s);
    }
    public static void convert(int[] array){
        String s=new String("[");

        for (int i = 0; i < array.length; i++) {
           if(i==array.length-1){
               s=s.concat(array[i]+"]");
           }
           else{
               s=s.concat(array[i]+"#");
           }
        }
        System.out.println(s);
    }
    public static  void Count(String s){
        int bigCont=0;
        int smallCount=0;
        int sum=0;
        for (int i = 0; i < s.length(); i++) {
            char ch=s.charAt(i);
            if(ch>='A'&&ch<='Z'){
                bigCont++;
            }
            if(ch>='a'&&ch<='z'){
                smallCount++;
            }
            if(ch>='0'&&ch<='9'){
                sum++;
            }
        }
        System.out.println("大写:"+bigCont+",小写:"+smallCount+",数字:"+sum);
    }
}
