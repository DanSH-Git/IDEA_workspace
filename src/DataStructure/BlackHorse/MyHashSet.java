package DataStructure.BlackHorse;

import JavaBasic.TDemo.Person;

import java.util.HashSet;

/**
 * @author asus1
 * @create 2020/10/26 10:57
 */
public class MyHashSet {
    public static void main(String[] args) {
        HashSet<HashPerson> person =new HashSet<>();
        Person p1=new Person("aa",11);
        Person p2=new Person("aa",11);
        System.out.println(p1==p2);
        System.out.println(p1.equals(p2));
    }
}
