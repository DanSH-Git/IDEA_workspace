package JavaBasic.Demo12RedBag;

import JavaBasic.Demo12RedBag.RB.RandomMode;

/*
* 场景：
* 所有人有红包，最后一个给群主
*设置群主名称
* 设置分发策略，平均、随机。
* */
public class BootStrap {
    public static void main(String[] args) {
         MyRed myRed=new MyRed("Title");
         myRed.setOwnerName("Tom");
//        OpenMode normal=new NormalMode();
//        myRed.setOpenWay(normal);
        RandomMode random=new RandomMode();
        myRed.setOpenWay(random);
    }
}
