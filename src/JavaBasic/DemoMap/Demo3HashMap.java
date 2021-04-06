package JavaBasic.DemoMap;


import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @author asus1
 * @create 2020/10/28 16:10
 * Map集合需要保证Key是唯一的，作为key的元素，必须重写hashcode和equals方法。
 *
 */
public class Demo3HashMap {
    public static void main(String[] args) {
        show01();
        show02();
    }
    public static void show01(){
//        Person key; int value
        Map<Demo3Person,Integer> map=new HashMap<>();
        map.put(new Demo3Person("aa",1),11);
        map.put(new Demo3Person("ab",2),12);
        map.put(new Demo3Person("ac",3),13);
        map.put(new Demo3Person("ad",4),14);
        Set<Map.Entry<Demo3Person,Integer>> set=map.entrySet();
        for (Map.Entry<Demo3Person,Integer> entry:set
        ) {
            System.out.println("value:"+entry.getValue()+",key:"+entry.getKey());

        }
    }
    public static void show02(){
        Map<Integer,Demo3Person> map=new HashMap<>();
        map.put(21,new Demo3Person("ba",5));
        map.put(22,new Demo3Person("bb",6));
        map.put(23,new Demo3Person("bc",7));
        map.put(24,new Demo3Person("bd",8));
        Set<Map.Entry<Integer,Demo3Person>> set=map.entrySet();
        for (Map.Entry<Integer,Demo3Person> entry:set
        ) {
            System.out.println("value:"+entry.getValue()+",key:"+entry.getKey());
        }
    }
}
