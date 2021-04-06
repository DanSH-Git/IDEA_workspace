package DataStructure.Queue;

/**
 * @author asus1
 * @create 2020/11/30 20:50
 * 数组模拟环形队列：
 * 1，front指向队列的第一个元素；初始值为0
 * 2，rear指向队列最后一个元素的后一个位置，初始值为0
 * 3，队列满时，（rear+1）%Maxsize=front
 * 4，队列空的条件，rear==front
 * 有效数据个数(rear+MaxSize-front)%MaxSize
 */
public class CircularQueue {
    private int front;
    private int rear;
    private int Maxsize;
    private int[] arr;
    //创建环形数组
    public int[] createCQ(int MaxSize){
        front=0;
        rear=0;
        Maxsize=MaxSize;
        arr=new int[Maxsize];
        return arr;
    }
    //判断环形数组满
    public boolean isFull(){
        return (rear+1)%Maxsize==front;
    }
    //判断环形数组空
    public boolean isEmpty(){
        return rear==front;
    }

    //元素出环
    public int getValue() {
        if (isEmpty()) {
            throw new RuntimeException("环形队列为空");
        }
        int value=arr[front];
        front=(front+1)%Maxsize;
        return value;
    }
    //添加元素
    public void addValue(int val){
        if(isFull()){
            throw  new RuntimeException("队列满，无法添加");
        }
        arr[rear]=val;
        rear=(rear+1)%Maxsize;
        System.out.println("添加元素成功");
    }
    //元素展示
    public void show(){
        if(isEmpty()){
            throw new RuntimeException("环形队列为空");
        }
        for (int i = front; i <front+(rear+Maxsize-front)%Maxsize; i++) {
            System.out.println(arr[i%Maxsize]);
        }
    }
}
