package JavaBasic.TDemoCollection;
/*
学习顶层：学习顶层、抽象类中的共性方法，所有子类使用。
使用顶层：顶层是接口或者抽象类，无法创建对象使用，需要使用底层子类创建对象使用。
* 数组存储的是同一类型的元素，可以存储基本数据类型值；集合存储的是对象，对象类型可以不一致
* */

import java.util.ArrayList;
import java.util.Collection;

/*
 * 集合类型1，List(有序，可重复，有索引）：Vector，ArrayList（查询快，删减慢），LinkedList（查询慢，删减快），
 * 集合类型2, Set(不允许重复，无索引）: HashSet无序（LinkedHashSet有序），TreeSet无序（底层二叉树实现，一般用于排序)，
 * 目标：使用集合存储数据；遍历；掌握特性。
 * */
/*共性方法：

 * */
public class Demo1Collec {
    public static void main(String[] args) {
        Collection<String> coll = new ArrayList<>();//多态
        coll.add("11");
        coll.add("22");
        coll.add("33");//添加元素，返回值为boolean
        System.out.println("add11 22 33:"+coll);
        coll.remove("22");
        System.out.println("remove22:"+coll);
        boolean s1=coll.contains("11");
        System.out.println("contain11:"+s1);
        System.out.println("size:"+coll.size());
//        创建Object存储数组数据
        Object[] str1 =coll.toArray();
        for (int i = 0; i < str1.length; i++) {
            System.out.println("str"+i+":"+str1[i]);
        }
        coll.clear();//清空元素，返回值为空;
        System.out.println("clear:"+coll);
        System.out.println("Empty:"+coll.isEmpty());//判断为空
    }
}
