package JavaBasic.Demo1Method;
public class Demostar {
    public static void star(){
        for (int i = 0; i < 5; i++) {
            for (int i1 = 0; i1 < 20; i1++) {
                System.out.print("*");
            }
            System.out.println();
        }


    }
    public static void main(String[] args) {
        star();
    }
}
