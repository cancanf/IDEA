package 课堂代码.顺序表和链表.leetcode.环形链表;

import 课堂代码.顺序表和链表.leetcode.ListNode;

import java.util.HashMap;


public class hasCycle {
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
        listNode5.next = listNode1;
        System.out.println(hasCycle(listNode1));

    }

    public static boolean hasCycle(ListNode head) {
        //哈希表存储
//        ListNode per = head;
//        int i = 0;
//        HashMap<ListNode,Integer> hashMap = new HashMap<>();
//        while (per!=null){
//            if(hashMap.containsKey(per)){
//                return true;
//            }
//            hashMap.put(per,i++);
//            per = per.next;
//        }
//        return false;
        //双指针法
        if (head == null) {
            return false;
        }
        ListNode fast = head;
        ListNode slow = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) {
                return true;
            }
        }
        return false;
    }
}
