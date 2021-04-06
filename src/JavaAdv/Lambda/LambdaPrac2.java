package JavaAdv.Lambda;

import java.util.Arrays;

/**
 * @author asus1
 * @create 2020/11/10 9:16
 */
public class LambdaPrac2 {
    public static void main(String[] args) {
        Prac2Person[] arr = {new Prac2Person("tom", 12),
                new Prac2Person("jack", 11), new Prac2Person("lili", 19)};
//        Arrays.sort(arr, new Comparator<Prac2Person>() {
//            @Override
//            public int compare(Prac2Person o1, Prac2Person o2) {
//                return o1.getAge()-o2.getAge();
//            }
//        });
        //使用lambda方法括号内放传递的参数，{}中放入重写的方法的语句，包括返回值
        Arrays.sort(arr,(Prac2Person o1, Prac2Person o2)->{return o1.getAge()-o2.getAge();});
        //省略 参数类型，return {} ；
        Arrays.sort(arr,( o1,  o2)-> o1.getAge()-o2.getAge());

        for (Prac2Person p:arr
             ) {
            System.out.println(p);
            
        }
    }
}
