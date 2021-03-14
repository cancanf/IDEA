package 课堂代码.数据结构.课件练习.顺序表和链表.leetcode.链表逆置删除所有元素;

import 课堂代码.数据结构.课件练习.顺序表和链表.leetcode.ListNode;

public class Main {
    public static void main(String[] args) {
        ListNode listNode1 = new ListNode(1);
        ListNode listNode2 = new ListNode(1);
        ListNode listNode3 = new ListNode(1);
        ListNode listNode4 = new ListNode(6);
        listNode1.next = listNode2;
        listNode2.next = listNode3;
        listNode3.next = listNode4;
        listNode4.next = null;
        listNode1 = reverseList(listNode1);
//        listNode1 = removeElements(listNode1, 1);
        System.out.println(listNode1.val);
    }

    public static ListNode reverseList(ListNode head) {
//        遍历头插 带傀儡节点
//        ListNode newhead = new ListNode();
//        ListNode next;
//
//        while (head != null) {
//            next = head;
//            head = head.next;
//            next.next = newhead.next;
//            newhead.next = next;
//
//        }
//        return newhead.next;
        //不带傀儡节点
        ListNode prev = null;
        ListNode cur = head;
        ListNode newhead = null;
        while (cur != null) {
            //防止nextNode.next的时候为空出现空指针异常
            //nextNode.next = nextNode
            ListNode nextNode = cur.next;
            if (nextNode == null) {
                newhead = cur;
            }

            cur.next = prev;
            prev = cur;
            cur = nextNode;
        }
        return newhead;
    }

    public static ListNode removeElements(ListNode head, int val) {
//        加傀儡节点
//        ListNode realhead = new ListNode();
//        realhead.next = head;
//        ListNode delete = head;
//        head = realhead;
//
//        while (delete != null) {
//            if (delete.val == val) {
//                head.next = delete.next;
//                delete = delete.next;
//            }else{
//                    head = head.next;
//                    delete = delete.next;
//                }
//            }
//            //head 不带傀儡节点;
//            return realhead.next;

        //不加傀儡节点,先删除其余节点,最后处理头结点.
        if (head == null) {
            return null;
        }
        //prev为删除节点的前一个
        ListNode prev = head;
        //待删除节点
        ListNode cur = head.next;
        for (; cur != null; ) {
            if (cur.val == val) {
                prev.next = cur.next;
                cur = prev.next;
            } else {
                prev = prev.next;
                cur = cur.next;
            }
        }
        //最后检测头结点是否为要删除元素的情况
        if (head.val == val) {
            head = head.next;
        }
        return head;
    }
}
