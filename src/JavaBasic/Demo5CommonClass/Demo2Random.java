package JavaBasic.Demo5CommonClass;
import java.util.Random;
import java.util.Scanner;
public class Demo2Random {
    public static void main(String[] args) {
        Random r= new Random();
        int i=r.nextInt(100);
        Scanner sc=new Scanner(System.in);
        System.out.println("已有一个0到99的随机数，请猜测");

        while (true) {
            int sum=sc.nextInt();
            if(i>sum){
                System.out.println("你的输入有误,实际值比"+sum+"大");
                System.out.println("请重新输入");
            }
            else if(i<sum){
                System.out.println("你的输入有误,实际值比"+sum+"小");
                System.out.println("请重新输入");
            }
            else{
                System.out.println("猜测正确");
                break;
            }
        }




    }

}
