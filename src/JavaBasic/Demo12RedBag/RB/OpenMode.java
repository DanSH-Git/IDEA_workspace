package JavaBasic.Demo12RedBag.RB;

import java.util.ArrayList;

public interface OpenMode {
    /*将totalMoney分为count份，保存到ArrayList<Integer>中，返回

    totalMoney 总金额，单位为分
    totalCount 红包个数
    ArraryList<Integer> 各红包金额值，所有元素值累和等于总金额。
    * */
    ArrayList<Integer> divide(int totalMoney, int totalCount);
}
