package LeetCode;

import java.util.Stack;

/**
 * @author DanSH
 * @create 2021/3/21 14:19
 * 反转一个单链表。
 * <p>
 * 示例:
 * <p>
 * 输入: 1->2->3->4->5->NULL
 * 输出: 5->4->3->2->1->NULL
 */
public class prac206 {
    public static void main(String[] args) {
        ListNode list=new ListNode();
        ListNode head=list;
        for(int i=1;i<6;i++){
            head.val=i;
            head=head.next;
        }
        reverseList(list);

    }
    public static ListNode reverseList(ListNode head) {
        //建立一个栈，建立一个辅助指针
        Stack<ListNode> stack=new Stack<>();
        ListNode temp=head;
        while(temp!=null){
            stack.push(temp);
            temp=temp.next;
        }
        while(stack.peek()!=null){
            head=stack.pop();
            head=head.next;
        }
        return head;
    }
    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
}
