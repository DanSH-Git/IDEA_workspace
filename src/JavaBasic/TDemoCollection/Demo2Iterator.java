package JavaBasic.TDemoCollection;

import java.util.ArrayList;
import java.util.Collection;
import  java.util.Iterator;

public class Demo2Iterator {
    public static void main(String[] args) {
        Collection<String> coll=new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            coll.add("i"+i);
        }
        System.out.println(coll);
        Iterator<String> it1=coll.iterator();

       while (it1.hasNext()){

           System.out.print(it1.next()+",");
        }
        System.out.println("");
       /*增强for循环，foreach
       *
       * for（type name：type[] name*/
       for(String i:coll){
           System.out.print(i+",");
       }
        System.out.println("");
       int[] m={1,2,3};
       for(int k : m){
            System.out.print(k+",");
        }
    }
}
