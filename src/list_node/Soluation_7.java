package list_node;

import utils.ListNode;

/**
 * 问题：环型链表II
 * Link：https://leetcode-cn.com/problems/linked-list-cycle-ii/
 */
public class Soluation_7 {

    public ListNode detectCycle(ListNode head){
        if (head == null || head.next == null){
            return null;
        }
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            while (slow == fast){
                slow = head;
                while (slow != fast){
                    slow = slow.next;
                    fast = fast.next;
                }
                return slow;
            }
        }
        return null;
    }


}
