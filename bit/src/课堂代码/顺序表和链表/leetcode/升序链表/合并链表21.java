package 课堂代码.顺序表和链表.leetcode.升序链表;

import 课堂代码.顺序表和链表.leetcode.ListNode;

public class 合并链表21 {
    public static void main(String[] args) {
        ListNode listNode1 = new ListNode(1);
        ListNode listNode2 = new ListNode(2);
        ListNode listNode3 = new ListNode(3);
        ListNode listNode4 = new ListNode(4);
        ListNode listNode5 = new ListNode(5);
        listNode1.next = listNode2;
        listNode2.next = listNode3;
        listNode3.next = listNode4;
        listNode4.next = listNode5;
        listNode5 = null;
        ListNode listNode6 = new ListNode(2);
        ListNode listNode7 = new ListNode(2);
        ListNode listNode8 = new ListNode(3);
        ListNode listNode9 = new ListNode(7);
        ListNode listNode10 = new ListNode(8);
        listNode6.next = listNode7;
        listNode7.next = listNode8;
        listNode8.next = listNode9;
        listNode9.next = listNode10;
        listNode10 = null;
        mergeTwoLists(listNode1, listNode6);
    }

    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode head = new ListNode();
        ListNode i = head;

        while (l1 != null && l2 != null) {
            if (l1.val <= l2.val) {
                i.next = l1;
                i = l1;
                l1 = l1.next;
            } else {
                i.next = l2;
                i = l2;
                l2 = l2.next;
            }
        }
        if (l1 == null) {
            i.next = l2;
        }
        if (l2 == null) {
            i.next = l1;
        }
        return head.next;
    }
}
