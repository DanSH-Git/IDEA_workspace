package JavaBasic.Demo10multi.Laptop;

public class keyboard implements USE {
    @Override
    public void open() {
        System.out.println("连接键盘");
    }

    @Override
    public void close() {
        System.out.println("断开键盘");
    }

    public void click(){
        System.out.println("打字");
    }
}
