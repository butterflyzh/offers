package list_node;

import utils.ListNode;

/**
 * 问题：环型链表
 * Link：https://leetcode-cn.com/problems/linked-list-cycle/
 */
public class Soluation_6 {

    public boolean hasCycle(ListNode head){
        if (head == null || head.next == null){
            return false;
        }
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if (fast == slow){
                return true;
            }
        }
        return false;
    }
}
