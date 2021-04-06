package JavaBasic.Demo3Array;

import java.util.Arrays;

public class Demo3ArrayFlip {
    public static void main(String[] args) {
        int[] aaa={1,2,3,4,5,6};
        for(int min=0,max=aaa.length-1;min<max;min++,max--){
            int temp = aaa[min];
            aaa[min] = aaa[max];
            aaa[max] = temp;
        }
        System.out.println(Arrays.toString(aaa));
    }
}
