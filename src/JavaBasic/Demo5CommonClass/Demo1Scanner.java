package JavaBasic.Demo5CommonClass;
import java.util.Scanner;
public class Demo1Scanner {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入第一个数");
        int str1=scanner.nextInt();
        System.out.println("请输出第二个数");
        int str2=scanner.nextInt();
        System.out.println("请输前两个数之和");
        int str3=scanner.nextInt();
        int result=str1+str2;
        if(str3==result){
            System.out.println("运算正确");
        }
        else{
            System.out.println("运算有误，正确结果是"+result);
        }
//        System.
    }


}
