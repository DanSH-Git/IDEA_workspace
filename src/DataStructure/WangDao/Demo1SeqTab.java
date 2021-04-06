package DataStructure.WangDao;

/**
 * @author asus1
 * @create 2020/12/31 10:21
 * 1.java中实现c的结构体
 */
public class Demo1SeqTab {
    int MaxSize=10;
    int[] SqList=new int[MaxSize];

//    初始化-
    public int[] Init(int[] a){
        for (int i = 0; i < MaxSize; i++) {
            a[i]=0;
        }
        return a;
    }

    public void test(){

        System.out.println(Init(SqList));
    }

}
