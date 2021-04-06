package JavaAdv.ThreadDemo.ThreadCommunication;

/**
 * @author asus1
 * @create 2020/11/8 16:02
 */
public class PracFoodie extends Thread{
    private PracBaoZi bz;

    public PracFoodie(PracBaoZi bz) {
        this.bz = bz;
    }

    @Override
    public void run() {
        while(bz.Count<10){
        synchronized (bz){
            if(bz.State==Boolean.FALSE){
                try {
                    bz.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println("有包子了，正在吃包子."+"皮是："+bz.Pi+",馅是："+bz.Xian);
            bz.State=Boolean.FALSE;
            bz.notify();
            System.out.println("吃完了");
            System.out.println("_________________________________________________");

        }
    }
        System.out.println("不吃了不吃了 吃不下了");
    }
}
