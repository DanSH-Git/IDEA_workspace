package JavaBasic.DemoMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * @author asus1
 * @create 2020/10/28 14:21
 *
 * Map集合遍历键值对方式：
 * 获取Map中所有Entry对象，以Set的集合形式返回
 * 遍历包含键值对的集合Set，得到每一个键值对对象Entry
 * 根据键值对对象,获取对象中的键与值
 *
 * tips：Map不能直接用迭代器和增强for遍历，需转为Set后使用
 */
public class Demo2Entry {
    public static void main(String[] args) {
        Map<String,Integer> map=new HashMap<>();//Map 子类HashMap
        map.put("111",1);
        map.put("222",2);
        map.put("333",3);
//set<Entry> name=已有map.entrySet()
        //数据类型：Map.Entry<key.type,value.type>
        //Map方法: entrySet
        Set<Map.Entry<String,Integer>> set=map.entrySet();//Set存储，对象为Map下Entry键值对对象

        //迭代方法1：遍历Set集合，获取每一个Entry对象。使用迭代器遍历Set集合
        Iterator<Map.Entry<String,Integer>> it=set.iterator();
        while(it.hasNext())
        {
            //使用Entry中的方法getKey（）和getValue()获取键值
            Map.Entry<String,Integer> entry=it.next();
            String key=entry.getKey();
            int value=entry.getValue();
            System.out.println("key:"+key+"Value:"+value);

        }
        System.out.println("______________");
        //迭代方法2：增强for
        for (Map.Entry<String,Integer> entry:set
             ) {
            System.out.println("key:"+entry.getKey()+"Value:"+entry.getValue() );

        }
    }
}
