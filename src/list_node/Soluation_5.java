package list_node;

import utils.ListNode;

/**
 * 问题：将单链表按某值划分左边小、中间相等、右边大
 * Link：程序员的代码面试指南
 * tips：HashMap的resize过程，有着类似过程。
 * link：https://blog.csdn.net/buffeer/article/details/103835694
 */
public class Soluation_5 {

    public ListNode listPartion(ListNode head, int pivot){
        if (head == null || head.next == null){
            return head;
        }
        ListNode sH = null, sT = null;
        ListNode mH = null, mT = null;
        ListNode bH = null, bT = null;
        ListNode next = null;
        while (head != null){
            next = head.next;
            head.next = null;
            if (head.val < pivot){
                if (sT == null){
                    sH = head;
                    sT = head;
                }else {
                    sT.next = head;
                    sT = sT.next;
                }
            }else if (head.val == pivot){
                if (mT == null){
                    mH = head;
                    mT = head;
                }else {
                    mT.next = head;
                    mT = mT.next;
                }
            }else {
                if (bT == null){
                    bH = head;
                    bT = head;
                }else {
                    bT.next = head;
                    bT = bT.next;
                }
            }
            head = next;
        }
        if (sT != null){
            sT.next = mH;
            mT = mT == null ? sT : mT;
        }
        if (mT != null){
            mT.next = bH;
        }
        return sH != null ? sH : mH != null ? mH : bH;
    }
}
