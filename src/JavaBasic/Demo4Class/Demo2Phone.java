package JavaBasic.Demo4Class;

public class Demo2Phone {
    public static void main(String[] args) {
        Phone phone=new Phone();
        System.out.println("Phone's Brand is "+phone.brand+", Price is "+phone.price+", and the color is "+phone.color);
        phone.call(110);
        phone.SendMessage(110,"help");
    }
}
