package JavaBasic.Demo6String;
/*
* public char[] toCharArray():将当前字符串拆分为字符数组作为返回值
* public byte[] getBytes()获得当前字符串底层的字节数组
* public String replace(CharSequence oldString,CharSequence newString);
* public String[] split(String regex)根据参数切分  .->//.
*
* */
public class Demo3StringConvert {
    public static void main(String[] args) {
        String str1="hello";
        String str2="world";
        char[] str3=str1.toCharArray();
        byte[] str4=str2.getBytes();
        String str5=str1.replace("llo","llo_yeah");
        System.out.println("str3:"+str3[2]+",str4:"+str4[2]+",str5:"+str5);
        String[] array=str2.split("l");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
