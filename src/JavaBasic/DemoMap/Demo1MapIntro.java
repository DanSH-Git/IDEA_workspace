package JavaBasic.DemoMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * @author asus1
 * @create 2020/10/28 11:04
 *哈希：数组+链表+红黑树（链表长度超过8），无序
 * Map:双列集合反映 映射关系，一个映射不能包含重复的键。K-V，键唯一，值可以重复。
 * HashMap:底层是哈希表，查询速度快。无序集合，存取顺序可能不一致。
 * LinkedHashMap：底层哈希表+链表（保证迭代顺序）：有序集合。
 */
public class Demo1MapIntro {
    public static void main(String[] args) {
        show01();
        show02();
    }
    /*put 存储，remove移除,get获取,containsKey判断是否包含*/
    public static void show01(){
        Map<String,Integer> map=new HashMap<>();
        map.put("111",1);
        map.put("222",2);
        map.put("333",3);
        System.out.println("打印初始Map："+map);
        map.remove("111");
        System.out.println("移除key为“111”的键值对："+map);
        System.out.println(map.get("获取key为222所对应的Value："+"222"));
        System.out.println(map.containsKey("333"));
    }
    /*使用keySet遍历，使用迭代器或者增强for，把Map集合中key放在set集合中。*/
    public static void show02(){
        Map<String,Integer> map=new HashMap<>();
        map.put("111",1);
        map.put("222",2);
        map.put("333",3);
        /*Map-Set—Iterator*/
        Set<String> set=map.keySet();
        Iterator<String> it=set.iterator();
        while(it.hasNext()){
            System.out.print(it.next()+",");
        }
        /*增强for*/
        for (String i:map.keySet()
             ) {
            System.out.print(i);

        }

    }
}
