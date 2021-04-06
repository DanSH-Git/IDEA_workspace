package JavaBasic.Demo6String;
/*
* 字符串中获取的常用方法：
* 1 .public int length()获取长度
* 2. public String concat(String Str）字符串拼接
* 3. public char charAt（int index)获取索引位置单个字符
* 4. public int indexOf(String str)查找参数字符串在本字符串中首次出现索引值，没有则返回-1
* 5. public String substring(int index)从index到尾部
* 6. public String substring (int begin, int end)包含左边，不含右边
* */
public class Demo2StringMethod {
    public static void main(String[] args) {
        String str1="hello";
        String str2="world";
        int len=str1.length();
        String str3=str1.concat(str2);
        char Byte=str3.charAt(2);
        int index=str3.indexOf("l");
        System.out.println("sr1 length:"+len+",concat str1 and str2:"+str3+",index2="+Byte+",l index:"+index);
        String str4=str3.substring(3);//loworld
        String str5=str3.substring(3,5);//lo
        System.out.println(str4+","+str5);
    }
}
