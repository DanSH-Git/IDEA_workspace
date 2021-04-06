package JavaAdv.ThreadDemo.ThreadCommunication;

/**
 * @author asus1
 * @create 2020/11/8 16:28
 */
public class PracMain {
    public static void main(String[] args) {
        PracBaoZi bz=new PracBaoZi();
        new PracRestaurant(bz).start();
        new PracFoodie(bz).start();
    }
}
