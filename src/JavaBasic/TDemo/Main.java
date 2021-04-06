package JavaBasic.TDemo;

public class Main {
    public static void main(String[] args) {
        Person p=new Person();
        p.setAge(21);
        p.setName("Tom");
        p.show();
        System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<");
        String a=p.toString();
        System.out.println(a);
        Person p1=new Person("jack",2);
        Person p2=new Person("rose",3);
        System.out.println(p1.equals(p2));
    }
}
