package JavaBasic.Demo5CommonClass;

import java.util.ArrayList;
import java.util.Random;

/*
* 生成6个到33的随机数，添加到集合并打印输出
* */
public class Demo5ArrayListPriactice1 {
    public static void main(String[] args) {
        Random rd=new Random();
        ArrayList<Integer> array=new ArrayList<>();
        for (int i1 = 0; i1 < 6; i1++) {
            int i=rd.nextInt(34);
            array.add(i);
        }
        for (int k=0; k<6; k++){
            System.out.println(array.get(k));
        }
    }
}
