package JavaBasic.Demo3Array;

import java.util.Arrays;

public class DemoPrintArray {
    public static void main(String[] args) {
        int[] array= {1,2,3,5};
        System.out.println(Arrays.toString(array));
    }
}
/*
 * Java的内存需要划分为5个部分
 * 1.栈（stack）：存放的都是方法中的局部变量，方法(main(String[] args)的运行在栈当中。
 *   局部变量：方法的参数，或者方法内部的变量。
 *   作用域：超出作用域，从栈内存中消失。
 * 2堆（heap）：new的对象，都存在堆中。
 *   堆内存中存在一个地址值：16进制
 *   对内存里面的数据，都有默认值：
 *       1.整数 默认为0；
 *       2.浮点数 默认为0.0；
 *       3.字符 默认为"u000"
 *       4.布尔值 默认为false；
 *       5.引用类型 默认为null
 * 3方法区（Method Area）：存储.class相关信息，包含方法的信息。
 * 4本地方法栈（Native Method Stack）：与操作系统相关。
 * 5寄存器（PC Register):与CPU相关
 *
 * */