package list_node;

import utils.ListNode;

/**
 * 问题：反转链表I
 * link：https://leetcode-cn.com/problems/reverse-linked-list/
 */
public class Soluation_1 {

    public ListNode reverseList(ListNode head){
        if (head == null) return head;
        return solve(head);
    }
    //递归反转
    public ListNode solve(ListNode head){
        if (head.next == null){
            return head;
        }
        ListNode last = solve(head.next);
        head.next.next = head;
        head.next = null;

        return last; //返回最后一个结点
    }
}
