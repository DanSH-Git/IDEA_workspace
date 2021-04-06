package JavaBasic.Demo5CommonClass;

import java.util.ArrayList;
import java.util.Random;

/*用一个大集合存入20个随机数字，筛选偶数元素，放在小集合中，使用自定义的方法实现筛选，
*
*
* */
public class Demo6ArrayListPractice4 {
    public static void main(String[] args) {
        ArrayList<Integer> array1=new ArrayList<>();
        ArrayList<Integer> array2=new ArrayList<>();

        Random ra=new Random();
        for(int i=0;i<20;i++){
            array1.add(ra.nextInt(100));
        }
        System.out.println("ori-data: "+array1+",size:"+array1.size());
        for(int i=0;i<array1.size();i++){
            if(array1.get(i)%2==0){
                array2.add(array1.get(i));
            }

        }
        System.out.println("new-data: "+array2+",size:"+array2.size());
    }


}
