package JavaBasic.Demo5CommonClass;

import java.util.ArrayList;

public class Demo3ArrayList {
    public static void main(String[] args) {
        ArrayList<String> array =new ArrayList<>();
        array.add("tom");
        array.add("tom1");
        array.add("tom2");

//        System.out.println(array);
        for (int i = 0; i < array.size(); i++) {
            System.out.println(array.get(i));
        }
    }
}
