package 课堂代码.顺序表和链表.牛客;

import java.util.List;

public class 回文链表 {
    public static void main(String[] args) {
        ListNode listNode1 = new ListNode(1);
        ListNode listNode2 = new ListNode(2);
        ListNode listNode3 = new ListNode(2);
        ListNode listNode4 = new ListNode(1);
        listNode1.next = listNode2;
        listNode2.next = listNode3;
        listNode3.next = listNode4;
        listNode4.next = null;
        System.out.println(chkPalindrome(listNode1));
    }

    public static boolean chkPalindrome(ListNode A) {
        //链表逆序判断.先找链表中点.翻转后方,前后依次遍历.
        ListNode fast = A;
        ListNode slow = A;
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode nextMid = slow.next;
        slow.next = null;
        ListNode prev = null;
        ListNode next = null;

        while (nextMid != null) {
            next = nextMid.next;
            nextMid.next = prev;
            prev = nextMid;
            nextMid = next;
        }
        while (A != null && prev != null) {
            if (A.val != prev.val) {
                return false;
            }
            A = A.next;
            prev = prev.next;
        }
        return true;

        //遍历一遍头插链表并计数.
//        ListNode head = A;
//        ListNode end = new ListNode(-1);
//        int i = 0;
//        int j = 0;
//        while (head != null){
//            ListNode newnode = new ListNode(head.val);
//            newnode.next = end;
//            end = newnode;
//            i++;
//            head = head.next;
//        }
//
//        for (;A.val == end.val && j < i/2 ; A = A.next,end = end.next,j++){
//
//        }
//        if(j == i/2){
//            return true;
//        }
//            return false;
    }
}
