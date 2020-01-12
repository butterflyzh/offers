package list_node;

import utils.ListNode;

/**
 * 问题：删除排序链表的重复元素
 * Link：https://leetcode-cn.com/problems/remove-duplicates-from-sorted-list/
 */
public class Soluation_3 {

    public ListNode deleteDuplicates(ListNode head){
        if(head == null || head.next == null){
            return head;
        }
        ListNode pre = head;
        ListNode cur = head.next;
        while(cur != null){
            if(cur.val == pre.val){
                pre.next = cur.next;
            }else{
                pre = cur;
            }
            cur = cur.next;
        }
        return head;
    }
}
