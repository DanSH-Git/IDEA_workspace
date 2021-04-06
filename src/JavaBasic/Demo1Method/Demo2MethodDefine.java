package JavaBasic.Demo1Method;

public class Demo2MethodDefine {
    public static int add(int a, int b){
        int c;
        c=a+b;
        return c;
    }
    public static  void prtf(){
        for (int i = 0; i < 10; i++) {
            for (int i1 = 0; i1 < 10; i1++) {

                System.out.print("hello");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int c=add(1,2);
        System.out.println(c);
        prtf();
    }
}
