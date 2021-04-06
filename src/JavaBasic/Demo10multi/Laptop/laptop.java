package JavaBasic.Demo10multi.Laptop;

public class laptop {
    public void open(){
        System.out.println("笔记本开启");
    }
    public void close(){
        System.out.println("笔记本关闭");
    }
    public void option(USE u){
        if(u!=null){
            u.open();
            if(u instanceof mouse){
                mouse m=(mouse) u;

                m.click();

            }
            if(u instanceof keyboard){
                keyboard k=(keyboard) u;

                k.click();

            }
            u.close();
        }

    }
}
