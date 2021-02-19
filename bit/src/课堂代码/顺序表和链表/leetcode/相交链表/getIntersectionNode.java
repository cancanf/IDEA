package 课堂代码.顺序表和链表.leetcode.相交链表;

import 课堂代码.顺序表和链表.leetcode.ListNode;

import java.util.HashSet;

public class getIntersectionNode {
    public static void main(String[] args) {
        ListNode listNode1 = new ListNode(4);
        ListNode listNode2 = new ListNode(1);

        ListNode listNode3 = new ListNode(5);
        ListNode listNode4 = new ListNode(0);
        ListNode listNode5 = new ListNode(1);


        ListNode listNode9 = new ListNode(8);
        ListNode listNode10 = new ListNode(4);
        ListNode listNode11 = new ListNode(5);
        listNode1.next = listNode2;
        listNode2.next = listNode9;
        listNode9.next = listNode10;
        listNode10.next = listNode11;
        listNode11.next = null;

        listNode3.next = listNode4;
        listNode4.next = listNode5;
        listNode5.next = listNode9;
        listNode9.next = listNode10;
        listNode10.next = listNode11;

        getIntersectionNode(listNode1, listNode3);
    }

    public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
//        if(headA == null || headB == null){
//            return null;
//        }
//        ListNode per = headA;
//        ListNode cur = headB;
//
//        while (per != cur) {
//            per = per == null ? headB : per.next;
//            cur = cur == null ? headA : cur.next;
//        }
//        return per;

        if (headA == null || headB == null) {
            return null;
        }
        ListNode per = headA;
        ListNode cur = headB;
        HashSet<ListNode> set = new HashSet<>();
        while (per != null) {
            set.add(per);
            per = per.next;
        }
        while (cur != null) {
            if (!set.add(cur)) {
                return cur;
            }
            cur = cur.next;
        }
        return null;
    }
}
