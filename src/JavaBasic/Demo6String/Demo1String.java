package JavaBasic.Demo6String;
/*程序中所有双引号字符串，都是hiString类对象
* 字符串的特点：
* 1.内容不可变
* 2.内容可以共享使用，相同字符串，仅创建一个，不同对象指向不同。
* 3.字符串效果上相当于是char[]字符数组，底层原理是byte[]字节数组.
* 创建：
* public String()
* public String(char[] array)
* public String (byte[] array)
* 直接创建：
* String name="xxxx"; 直接写上双引号也是字符串对象。
*
* */
public class Demo1String {
    public static void main(String[] args) {
        char[] array={'a','b'};
        String str=new String(array);
        System.out.println("str:"+str);

        byte[] array2={97,98,99};
        String str2=new String(array2);
        System.out.println("str2:"+str2);
    }

}
