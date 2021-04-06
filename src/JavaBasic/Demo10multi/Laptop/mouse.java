package JavaBasic.Demo10multi.Laptop;

public class mouse implements USE {

    @Override
    public void open() {
        System.out.println("鼠标连接");
    }

    @Override
    public void close() {
        System.out.println("鼠标断开连接");

    }
    public void click(){
        System.out.println("鼠标单击");
    }
}
