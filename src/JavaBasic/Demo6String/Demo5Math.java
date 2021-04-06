package JavaBasic.Demo6String;

/*计算在-10.8到5.9之间，绝对值大于6或者小于2.1的正数有多少个？
* 循环计算
*
* */
public class Demo5Math {
    public static void main(String[] args) {
        int num1=0;
      for (double i=-10.8;i<5.9;i++){
          if((Math.abs(i)>6||Math.abs(i)<2.1)&&Math.abs(i)>0){
                num1++;
          }
      }
        System.out.println("区间内有"+num1+"个");
    }
}
