package JavaBasic.TDemoSystem;

import java.util.Arrays;

/*
* currentTimeMillis()返回以毫秒为单位的当前时间
* 验证for循环的打印1-9999所需要的时间
*
* */
public class demo1 {
    public static void main(String[] args) {
        long s=System.currentTimeMillis();
        for (int i = 0; i <= 9999; i++) {
            System.out.println(i);
        }
        long s2=System.currentTimeMillis();
        System.out.println("time："+(s2-s)+","+s2+","+s);

        int[] kk={1,2,3,4,6};
        int[] nn={111,222,333,444,555};
        System.arraycopy(kk,0,nn,1,2);
        System.out.println(Arrays.toString(nn));
    }
}
