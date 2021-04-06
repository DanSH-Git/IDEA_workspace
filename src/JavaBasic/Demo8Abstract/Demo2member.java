package JavaBasic.Demo8Abstract;

import java.util.ArrayList;
import java.util.Random;

public class Demo2member extends Demo2Users {
    public Demo2member() {
    }

    public Demo2member(String name, int money) {
        super(name, money);
    }
    public void receive(ArrayList<Integer> list) {
        int Index = new Random().nextInt(list.size());
        int delta = list.remove(Index);
        int money = super.getMoney();
        super.setMoney(money + delta);


    }
}
