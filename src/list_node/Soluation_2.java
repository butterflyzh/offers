package list_node;

import utils.ListNode;

/**
 * 问题：反转链表II
 * Link：https://leetcode-cn.com/problems/reverse-linked-list-ii/
 */
public class Soluation_2 {

    ListNode last = null;
    public ListNode reverseBetween(ListNode head, int m, int n){
        if (m == 0){
            return solve(head, n);
        }else{
            head.next = reverseBetween(head.next, m-1, n-1);
            return head;
        }
    }

    //反转前n个结点
    public ListNode solve(ListNode head, int n){
        if (n == 1){
            last = head.next;
            return head;
        }
        ListNode pre = solve(head.next, n-1);
        head.next.next = head;
        head.next = last;
        return pre;
    }
}
