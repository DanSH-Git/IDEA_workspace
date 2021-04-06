package JavaBasic.Demo8Abstract;

import java.util.ArrayList;
/*1.建立集合，存储若干红包金额，
2.查看群主余额，判断余额与红包大小
3.扣钱重新设置余额
4.红包均值与余额
5。余额放进最后一个红包
6.设置最后一个红包，返回集合。
*
* */
public class Demo2captain extends Demo2Users {
    public Demo2captain() {
    }

    public Demo2captain(String name, int money) {
        super(name, money);
    }

    public ArrayList<Integer> Send(int totalMoney, int count){

        ArrayList<Integer> rest=new ArrayList<>();
        if(totalMoney>super.getMoney()){
            System.out.println("余额不足，无法发放");
            return rest;
        }
        int avg=totalMoney/count;
        int restt=totalMoney%count;
        for (int i = 0; i < count - 1; i++) {
            rest.add(avg);
        }
        rest.add(avg+restt);
        setMoney(super.getMoney()-totalMoney);
        return rest;


    }

}
