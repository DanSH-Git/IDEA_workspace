package JavaBasic.TDemoCollection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * @author asus1
 * @create 2020/10/27 10:20
 * sort(list<T> list)使用前提
 * 被排序的集合里面存储的元素，必须实现Comparable ，重写接口中的方法ComparaTo定义规则。
 * 调用方法对象，自己this-参数：升序；反之降序
 *
 * public static <T> void sort(list<T> list, Comparator<? super T>),需要重写compare方法。
 * comparator o1-o2升序；反之降序
 *
 */
public class Demo3Method {
    public static void main(String[] args) {
        ArrayList<Integer> k=new ArrayList<>();
        k.add(5);k.add(2);k.add(3);
        ArrayList<String> sk=new ArrayList<>();
        Collections.addAll(sk,"11","55","2","43");
        Collections.sort(sk);
        Collections.sort(k);
        System.out.println(sk);
        ArrayList<Demo3Person> sk2=new ArrayList<>();
        sk2.add(new Demo3Person("tom",12));
        sk2.add(new Demo3Person("zom",12));
        sk2.add(new Demo3Person("jack",11));
        sk2.add(new Demo3Person("okk",20));
        System.out.println(sk2);
        Collections.sort(sk2);
        System.out.println(sk2);
        Collections.sort(k, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1-o2;/*升序*/
            }
        });
        System.out.println(k);
        Collections.sort(k, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2-o1;/*降序*/
            }
        });
        System.out.println(k);
        Collections.sort(sk2, new Comparator<Demo3Person>() {
            @Override
            public int compare(Demo3Person o1, Demo3Person o2) {
                int result=o1.getAge()-o2.getAge();
                if(result==0){
                    result=o1.getName().charAt(0)-o2.getName().charAt(0);
                }
                return result;
            }
        });
        System.out.println(sk2);
    }
}
