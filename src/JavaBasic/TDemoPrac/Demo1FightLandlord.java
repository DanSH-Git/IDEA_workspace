package JavaBasic.TDemoPrac;

import java.util.ArrayList;
import java.util.Collections;

/*
*1.定义牌:
* 准备54张牌，大王，小王，四个花色，13个单牌。循环遍历存储牌
* 2.洗牌，使用Collections的方法，static void shuffle(List<?> list) 打乱洗牌
* 3.发牌，1人17张牌，4个集合，user1，user2，user3，底牌。索引大于51，发底牌。
* 4看牌，打印
* */
public class Demo1FightLandlord {
    public static void main(String[] args) {
        ArrayList<String> Poker=new ArrayList<>();
        ArrayList<String> Suit=new ArrayList<>();
        ArrayList<String> Number=new ArrayList<>();
        Collections.addAll(Suit,"♠","♦","♣","♥");

        Collections.addAll(Number,"3","4","5","6","7","8","9","10","J","Q","K","A","2");
        for (int i = 0; i < Suit.size(); i++) {
            for (int i1 = 0; i1 < Number.size(); i1++) {
                Poker.add(Suit.get(i)+" "+Number.get(i1));
            }
        }
        Poker.add("Joker1");
        Poker.add("joker2");
        System.out.println("原始牌"+Poker);
//洗牌
        Collections.shuffle(Poker);
        System.out.println("洗牌后"+Poker);
//发牌
        ArrayList<String> User1=new ArrayList<>();
        ArrayList<String> User2=new ArrayList<>();
        ArrayList<String> User3=new ArrayList<>();
        ArrayList<String> Card=new ArrayList<>();
        for (int i = 0; i < Poker.size(); i++) {
            if(i<51){
                if((i+1)%3==1){User1.add(Poker.get(i));}
                else if((i+1)%3==2){User2.add(Poker.get(i));}
                else{User3.add(Poker.get(i));}
            }
            else{
                Card.add(Poker.get(i));
            }
        }

// 看牌
        System.out.println("User1_card:"+User1);

        System.out.println("User2_card:"+User2);
        System.out.println("User3_card:"+User3);
        System.out.println("Cards:"+Card);
    }
}
