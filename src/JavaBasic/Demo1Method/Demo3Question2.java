package JavaBasic.Demo1Method;

public class Demo3Question2 {
    public static void main(String[] args) {
        System.out.println(sum1to100());
    }
    public static int sum1to100(){
        int sum=0;
        for (int i = 1; i <= 100; i++) {

            sum=sum+i;
        }
        return sum;
    }
}
