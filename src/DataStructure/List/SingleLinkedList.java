package DataStructure.List;

/**
 * @author asus1
 * @create 2020/12/3 20:24
 */

public class SingleLinkedList {
    public static void main(String[] args) {
        HeroNode h1 = new HeroNode(1, "aaa");
        HeroNode h2 = new HeroNode(2, "bbb");
        HeroNode h3 = new HeroNode(3, "ccc");
        HeroNode h4 = new HeroNode(4, "ddd");
        SingleLinkedListDemo sll = new SingleLinkedListDemo();

        sll.add(h1);
        sll.add(h2);
        sll.add(h3);
        sll.add(h4);
        sll.list();
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++");
        HeroNode he = new HeroNode(2, "eee");
        sll.update(he);
        sll.list();
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++");
        sll.remove(2);
        sll.list();
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("不算头结点的长度为"+sll.getLength(sll.getHead()));
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("倒数第1个节点是"+sll.getReNode(sll.getHead(),1));
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("翻转结果为："+sll.reverse(sll.getReverseHead()));
    }

}


class SingleLinkedListDemo {
    //初始化头结点
    private HeroNode head = new HeroNode(0, "");
    private HeroNode reversehead=new HeroNode(0,"");
    public HeroNode getHead() {
        return head;
    }
    public HeroNode getReverseHead() {
        return reversehead;
    }


    //1.翻转链表
    public HeroNode reverse(HeroNode heroNode){
        //判空
        if(heroNode==null){
            System.out.println("空链表，节点数量为0");
            return null;
        }
        //创建2个临时节点
        HeroNode temp=head;
        HeroNode temp1=reversehead;
        while(true){
            if(temp.next==null){
                break;
            }
            temp1=temp.next;
            if (temp.next==temp1)
                temp1.next=temp;
            temp=temp.next;
        }
        temp.next=heroNode;
        temp1.next=reversehead;
        return temp1;
    }

    //获得倒数第N个节点
    public HeroNode getReNode(HeroNode heroNode,int index){
        if(heroNode==null){
            System.out.println("空链表，节点数量为0");
            return null;
        }
        int len=getLength(heroNode);
        if(len<=0||len<index){
            return null;
        }
        HeroNode temp=head.next;
        for (int i = 0; i < len - index+1; i++) {
            temp=temp.next;
        }
        return  temp;
    }


    //

    //添加节点到单向链表
    //不考虑编号顺序，找到最后节点，将最后节点的next指向新的节点
    public void add(HeroNode heroNode) {
        //头结点不能动，建立辅助节点遍历
        HeroNode temp = head;
        while (true) {
            //找到链表的最后
            if (temp.next == null) {
                break;
            }
            temp = temp.next;
        }
        //temp指向链表最后，将最后节点指向新的节点
        temp.next = heroNode;
    }

    //获取单链表节点个数
    public int getLength(HeroNode heroNode){
        if(heroNode==null){
            System.out.println("空链表，节点数量为0");
            return 0;
        }

        int i=0;
        HeroNode heroNode1=head.next;
        while(heroNode1.next!=null){
            i++;
            heroNode1=heroNode1.next;
        }
        return i;


    }

    //遍历显示
    public void list() {
        if (head.next == null) {
            System.out.println("链表为空");
            return;
        }
        HeroNode temp = head.next;
        while (true) {
            if (temp == null) {
                break;
            }
            //输出节点信息
            System.out.println(temp);
            temp = temp.next;
        }
    }

    /*修改节点信息，根据no编号来修改 */
    public void update(HeroNode heroNode) {
//        判断为空
        if (head.next == null) {
            System.out.println("链表为空");
            return;
        }
//        临时变量
        HeroNode temp = head.next;
        boolean flag = false;
        while (true) {
            //遍历完结束
            if (temp == null) {
                break;
            }
            //未遍历完，
            if (temp.no == heroNode.no) {
                flag = true;
                break;
            }
            temp=temp.next;
        }
        if (flag){
            temp.name=heroNode.name;
        }
        else{
            System.out.println("没有找到编号");
        }
    }
    public void remove(int no){
        if(head.next==null){
            System.out.println("链表为空");
            return;
        }
        HeroNode temp=head.next;
        boolean flag=true;
        while(true){
            if(temp.next==null){
                break;
            }
            if(temp.no==no){
                flag=true;
                break;
            }
            temp=temp.next;
        }
        if(flag){
            temp.next=temp.next.next;
        }
        else{
            System.out.println("未找到节点");
        }
    }
}


class HeroNode {
    public int no;
    public String name;
    public HeroNode next;

    public HeroNode(int no, String name) {
        this.no = no;
        this.name = name;

    }

    @Override
    public String toString() {
        return "HeroNode{" +
                "no=" + no +
                ", name='" + name + '\'' +
                '}';
    }
}