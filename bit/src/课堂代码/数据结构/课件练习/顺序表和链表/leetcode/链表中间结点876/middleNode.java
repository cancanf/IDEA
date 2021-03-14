package 课堂代码.数据结构.课件练习.顺序表和链表.leetcode.链表中间结点876;

import 课堂代码.数据结构.课件练习.顺序表和链表.leetcode.ListNode;

public class middleNode {
    public static void main(String[] args) {
        ListNode listNode1 = new ListNode(1);
        ListNode listNode2 = new ListNode(2);
        ListNode listNode3 = new ListNode(3);
        ListNode listNode4 = new ListNode(4);
        ListNode listNode5 = new ListNode(5);
        listNode1.next = listNode2;
        listNode2.next = listNode3;
        listNode3.next = listNode4;
        listNode5 = null;
        ListNode listNode = middleNode(listNode1);
        System.out.println(listNode.val);
    }

    public static ListNode middleNode(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
}
