package JavaBasic.TDemoStringBuilder;

public class StrB {
    public static void main(String[] args) {
        StringBuilder s = new StringBuilder();
        System.out.println(s);
        StringBuilder s2 = new StringBuilder("ss");
        System.out.println(s2);
        s2.append("ssssss");
        System.out.println(s2);
        String s3 = s2.toString();
        System.out.println(s3);
    }
}
