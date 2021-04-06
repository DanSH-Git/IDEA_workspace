package JavaBasic.Demo3Array;
/*
* 数组是引用类型，数据类型统一，数组长度不可改变。
* 指定长度，内容
* 数据类型[]=new type[]
* */
public class DemoArray {
    public static void main(String[] args) {
//        静态初始化
        int[] array1= {1,2,3};
        String[] array2 =new String[]{ "a","b"};
        System.out.println(array1[2]);
        System.out.println(array2[0]);
    }
}

