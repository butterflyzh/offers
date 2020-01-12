package list_node;

import utils.ListNode;

/**
 * 问题：删除排序链表中重复元素II
 * Link：https://leetcode-cn.com/problems/remove-duplicates-from-sorted-list-ii/
 */
public class Soluation_4 {

    public ListNode deleteDuplicates(ListNode head){
        if (head == null || head.next == null){
            return head;
        }
        //没有重复元素链表的新头结点
        ListNode first = new ListNode(0);
        ListNode nx = first;
        ListNode pre = head;

        while (pre != null){
            ListNode cur = pre.next;
            boolean flag = false;
            while (cur != null && cur.val == pre.val){
                cur = cur.next;
                flag = true;
            }
            if (!flag){
                nx.next = pre;
                nx = nx.next;
                nx.next = null;
            }
            pre = cur;
        }
        return first.next;
    }
}
