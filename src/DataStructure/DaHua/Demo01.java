package DataStructure.DaHua;

import java.util.ArrayList;
import java.util.List;

/**
 * @author asus1
 * @create 2020/12/17 20:43
 * 求线性表交集
 */
public class Demo01 {
    public static void main(String[] args) {
        ArrayList<Integer> list1=new ArrayList<>();
        ArrayList<Integer> list2=new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list2.add(1);
        list2.add(4);
        list2.add(5);

        ArrayList<Integer> list3=listUnion(list1,list2);
        for (int i = 0; i < list3.size(); i++) {
            System.out.println(list3.get(i));
        }
    }
    public static ArrayList listUnion( ArrayList li1, ArrayList li2){
        List temp=new ArrayList<>();
        temp=li1;
        for (int i = 0; i < li2.size(); i++) {
            for (int i1 = 0; i1 < li1.size(); i1++) {
                if (li2.get(i)!=li1.get(i1)){
                    temp.add(li2.get(i));
                }
                break;
            }
        }
        return (ArrayList) temp;
    }
}
