package JavaBasic.DemoMap;

import java.util.HashMap;
import java.util.LinkedHashMap;

/**
 * @author asus1
 * @create 2020/10/29 14:31
 * LinkedHashMap:接口的哈希表和链表实现，具有可预知的迭代顺序。
 * 链表记录元素顺序
 */
public class Demo4LinkedHashMap {
    public static void main(String[] args) {
        HashMap<Integer,Integer> map=new HashMap<>();
        map.put(1,1);
        map.put(4,2);
        map.put(2,3);
        map.put(3,4);
        System.out.println(map);//无序的Hashmap
        LinkedHashMap<Integer,Integer> map1=new LinkedHashMap<>();
        map1.put(1,1);
        map1.put(4,2);
        map1.put(2,3);
        map1.put(3,4);//有序的LinkedHashMap
        System.out.println(map1);

    }
}
