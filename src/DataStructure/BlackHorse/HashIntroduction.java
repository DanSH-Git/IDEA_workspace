package DataStructure.BlackHorse;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/*
* Set接口继承了Collection，不允许存储重复元素；没有索引，不能使用for循环遍历。
* 实现类HashSet。java.util.HashSet 存储与取出可能顺序不一致
* 哈希表查询速度快，HashSet底层是哈希表
*哈希值：十进制整数，系统随机给出，对象地址值，是模拟的逻辑地址，不是实际的物理地址
* 哈希冲突：元素不同，哈希值相同。
*哈希表：查询速度快，数组+红黑树（jdk1.8后） 数组+链表（jdk1.8前），将相同哈希值元素连接到一起。
*        引入红黑树：链表长度超过8位，转换为红黑树，提高查询速度。
*        存储数据，先试用hashcode方法，计算哈希值，判断是否存在哈希冲突，再使用equals判定元素是否相同。
* */
public class HashIntroduction {
    public static void main(String[] args) {
         Set<Integer> set=new HashSet<>();
         set.add(1);
         set.add(1);
         set.add(2);
//给出一个地址值和十进制的哈希值
         HashPerson hp=new HashPerson();
        System.out.println(hp);
        System.out.println(hp.hashCode());


        for (int i:set){
            System.out.println(i);
        }
        Iterator<Integer> it=set.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }

}
