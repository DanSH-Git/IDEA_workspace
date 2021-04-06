package JavaBasic.TDemoGeneric;

import java.util.ArrayList;

public class Demo3 {
    public static void main(String[] args) {
        ArrayList<String> k1=new ArrayList<>();
        k1.add("111");
        k1.add("222");
        k1.add("333");

        ArrayList<Integer> k2=new ArrayList<>();
        k2.add(1);
        k2.add(2);
        k2.add(3);

        print(k1);
        print(k2);
    }
    public static void print(ArrayList<?> list){
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

    }
}
