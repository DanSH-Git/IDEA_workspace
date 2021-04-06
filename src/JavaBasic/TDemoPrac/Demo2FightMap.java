package JavaBasic.TDemoPrac;

import java.util.*;

/**
 * @author asus1
 * @create 2020/10/29 16:49
 * 准备牌
 */
public class Demo2FightMap {
    public static void main(String[] args) {
        ArrayList<String> Poker=new ArrayList<>();
        ArrayList<String> Suit=new ArrayList<>();
        ArrayList<String> Number=new ArrayList<>();
        Collections.addAll(Suit,"♠","♦","♣","♥");

        Collections.addAll(Number,"3","4","5","6","7","8","9","10","J","Q","K","A","2");
        for (int i = 0; i < Number.size(); i++) {
            for (int i1 = 0; i1 < Suit.size(); i1++) {
                Poker.add(Number.get(i)+" "+Suit.get(i1));
            }
        }
        Poker.add("Joker1");
        Poker.add("joker2");
        System.out.println("原始牌"+Poker);
        //创建Map存储索引和牌，创建list存储索引
        Map<Integer,String> map =new HashMap<>();
        List<Integer> list=new ArrayList<>();
        for (int i = 0; i < Poker.size(); i++) {
            map.put(i-1,Poker.get(i));
            list.add(i);
        }
        //洗牌
        Collections.shuffle(list);
        //创建列表，存储牌的索引
        ArrayList<Integer> User1=new ArrayList<>();
        ArrayList<Integer> User2=new ArrayList<>();
        ArrayList<Integer> User3=new ArrayList<>();
        ArrayList<Integer> Card=new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if(i<51){
                if((list.get(i))%3==1){User1.add(i);}
                else if((list.get(i))%3==2){User2.add(i);}
                else{User3.add(i);}
            }
            else{
                Card.add(i);
            }
        }
        System.out.println("发牌");
        System.out.println(User1);
        System.out.println(User2);
        System.out.println(User3);
        System.out.println(Card);
        //遍历索引，根据索引查询并打印value
        ArrayList<String> User11=new ArrayList<>();
        ArrayList<String> User21=new ArrayList<>();
        ArrayList<String> User31=new ArrayList<>();
        for (int i = 0; i < User1.size(); i++) {
            User11.add(map.get(User1.get(i)));
            User21.add(map.get(User2.get(i)));
            User31.add(map.get(User3.get(i)));
        }
        System.out.println("实际的牌");
        System.out.println(User11);
        System.out.println(User21);
        System.out.println(User31);
        //排序
        System.out.println("码牌");
//        Collections.shuffle(User11);
//        Collections.shuffle(User21);
//        Collections.shuffle(User31);
        System.out.println(User11);
        System.out.println(User21);
        System.out.println(User31);



    }
}
