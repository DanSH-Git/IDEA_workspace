package DataStructure.BlackHorse;

import java.util.LinkedList;

/*
ArrayLsit：底层是一个数组，查询快，增删慢
*Linklist：链表结构，底层是一个链表结构，查询慢，增删快， 包含大量操作首位元素的方法；不能使用多态。

*
* */
public class ListIntroduction {
    public static void main(String[] args) {
        LinkedList<Integer> LkList=new LinkedList<>();
        LkList.add(1); LkList.add(2);LkList.add(3);
        LkList.addFirst(0);
        LkList.addLast(4);
        System.out.println(LkList);
        LkList.push(100);
        System.out.println(LkList);
        System.out.println(LkList.getFirst());
        System.out.println(LkList.getLast());
        LkList.clear();
        System.out.println(LkList);

    }
}
