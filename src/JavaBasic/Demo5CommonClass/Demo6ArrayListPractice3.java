package JavaBasic.Demo5CommonClass;

import java.util.ArrayList;

/*定义以指定格式打印集合的方法，需要用{}扩住，使用@分割每个元素*/
public class Demo6ArrayListPractice3 {
    public static void main(String[] args) {

        ArrayList<String> array=new ArrayList<>();
        array.add("qq");
        array.add("aa");
        array.add("bb");
        array.add("dd");
        System.out.print("{");
        for (int i = 0; i < array.size()-1; i++) {
            System.out.print(array.get(i)+"@");
        }
        System.out.print(array.get((array.size()-1)));

        System.out.println("}");

    }
}
