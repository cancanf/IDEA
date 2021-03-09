package 课堂代码.课件练习.顺序表和链表.leetcode.环形链表2;

import 课堂代码.课件练习.顺序表和链表.leetcode.ListNode;

import java.util.HashMap;

public class detectCycle {
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
        listNode5.next = listNode3;
        System.out.println(detectCycle(listNode1).val);
    }

    public static ListNode detectCycle(ListNode head) {
/*
        if (head == null) {
            return null;
        }
        ListNode fast = head;
        ListNode slow = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) {
                fast = head;
                while (fast != slow) {
                    fast = fast.next;
                    slow = slow.next;
                }
                return fast;
            }
        }
        return null;
*/
        ListNode per = head;
        int i = 0;
        HashMap<ListNode, Integer> hashMap = new HashMap<>();
        while (per != null) {
            if (hashMap.containsKey(per)) {
                return per;
            }
            hashMap.put(per, i++);
            per = per.next;
        }
        return null;

    }
}
