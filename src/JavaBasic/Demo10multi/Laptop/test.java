package JavaBasic.Demo10multi.Laptop;

public class test {
    public static void main(String[] args) {
        laptop lp=new laptop();
        lp.open();
        USE u=new mouse();
        lp.option(u);

        USE k=new keyboard();
        lp.option(k);

        lp.close();
    }
}
