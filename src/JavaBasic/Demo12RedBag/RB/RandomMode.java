package JavaBasic.Demo12RedBag.RB;

import java.util.ArrayList;
import java.util.Random;
public class RandomMode implements OpenMode {
    @Override
    public ArrayList<Integer> divide(final int totalMoney, final int totalCount) {
        ArrayList<Integer> list=new ArrayList<>();
        Random r =new Random();
        int liftMoney=totalMoney;
        int liftCount=totalCount;
        for(int i=0;i<totalCount-1;i++){
            int money=r.nextInt(liftMoney/liftCount*2)+1;
            list.add(money);
            liftMoney-=money;
            liftCount--;
        }
        list.add(liftMoney);

        return list;
    }
}
