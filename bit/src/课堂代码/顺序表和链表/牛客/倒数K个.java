package 课堂代码.顺序表和链表.牛客;

import 课堂代码.顺序表和链表.leetcode.ListNode;

public class 倒数K个 {
    public static void main(String[] args) {
        ListNode listNode1 = new ListNode(1);
        ListNode listNode2 = new ListNode(2);
        ListNode listNode3 = new ListNode(3);
        ListNode listNode4 = new ListNode(4);
        listNode1.next = listNode2;
        listNode2.next = listNode3;
        listNode3.next = listNode4;
        listNode4.next = null;
        System.out.println(FindKthToTail(listNode1, 1).val);
    }

    public static ListNode FindKthToTail(ListNode head, int k) {

        //链表间隔
        if (k <= 0 || head == null) {
            return null;
        }
        ListNode fast = head;
        ListNode slow = head;

        for (int i = 0; i < k; i++) {
            if (fast == null) {
                return null;
            } else {
                fast = fast.next;
            }
        }
        for (; fast != null; fast = fast.next, slow = slow.next) {
        }
        return slow;
    }
}
