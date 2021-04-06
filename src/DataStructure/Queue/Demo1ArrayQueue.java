package DataStructure.Queue;

/**
 * @author asus1
 * @create 2020/11/26 20:11
 */
public class Demo1ArrayQueue {

}
//使用数组创建一个队列

class ArrayQueue {
    //声明私有变量，头部，尾部，最大容量，存放数据数组
    private int front;
    private int rear;
    private int MaxSize;
    private int[] Arr;

    //创建队列的构造器
    public ArrayQueue(int arrMaxSize) {
        MaxSize = arrMaxSize;
        Arr = new int[MaxSize];
        front = -1;
        rear = -1;
    }

    //判断队列是否满 rear=MaxSize-1
    public boolean isFull() {
        return rear == MaxSize - 1;
    }

    //判断是否为空rear==front
    public boolean isEmpty() {
        return rear == front;
    }

    //添加数据到队列 满则提升无法加入
    public void addQueue(int n) {
        if (isFull()) {
            System.out.println("满");
            return;
        }
        rear++;
        Arr[rear] = n;
    }

    //获取队列的数据，出队列（判空，头指针后移，返回值）
    public int getQueue() {
        if (isEmpty()) {
            System.out.println("空");
            throw new RuntimeException("空");
        }
        front++;
        return Arr[front];

    }

    //展示所有数据（判空，遍历）
    public void showQueue() {
        if (isEmpty()) {
            System.out.println("空");
            return;
        }
        for (int i = 0; i < Arr.length; i++) {
            System.out.println("Arr[" + i + "]= " + Arr[i]);
        }

    }

    //显示头数据
    public int showFront() {
        if (isEmpty()) {
            System.out.println("空");
            throw new RuntimeException("空");
        }
        return Arr[front + 1];
    }

}