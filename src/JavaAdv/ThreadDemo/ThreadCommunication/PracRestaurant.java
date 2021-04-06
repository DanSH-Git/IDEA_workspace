package JavaAdv.ThreadDemo.ThreadCommunication;

/**
 * @author asus1
 * @create 2020/11/8 15:38
 */
public class PracRestaurant extends Thread {
    private PracBaoZi bz;


    public PracRestaurant(PracBaoZi bz) {
        this.bz = bz;
    }

    @Override
    public void run() {
        int count = 0;
        while (bz.Count<10) {
            synchronized (bz) {
                if (bz.State == Boolean.TRUE) {
                    try {
                        bz.wait();
                        System.out.println("开始生产包子，请等待3s");
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

                if (bz.Count % 2 == 1) {
                    bz.Pi = "薄皮";
                    bz.Xian = "猪肉";
                } else {
                    bz.Pi = " 人皮";
                    bz.Xian = "人肉";
                }
                bz.Count++;
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("包子生产完成," + "皮是：" + bz.Pi + ",馅是：" + bz.Xian);
                bz.State = Boolean.TRUE;
                bz.notify();
            }
        }
        System.out.println("Sell out");
    }
}
