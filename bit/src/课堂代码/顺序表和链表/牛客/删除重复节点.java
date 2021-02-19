package 课堂代码.顺序表和链表.牛客;

import java.util.ArrayList;

public class 删除重复节点 {
    public static void main(String[] args) {
        ListNode listNode1 = new ListNode(1);
        ListNode listNode2 = new ListNode(1);
        ListNode listNode3 = new ListNode(2);
        ListNode listNode4 = new ListNode(3);
        listNode1.next = listNode2;
        listNode2.next = listNode3;
        listNode3.next = listNode4;
        listNode4.next = null;
        System.out.println(deleteDuplication(listNode1));
    }

    public static ListNode deleteDuplication(ListNode pHead) {
        ListNode head = new ListNode(1);
        head.next = pHead;
        ListNode per = head;
        ListNode cur = head.next;
        while (cur != null) {
            if (cur.next != null && cur.val == cur.next.val) {
                while (cur.next != null && cur.val == cur.next.val) {
                    cur = cur.next;
                }
                cur = cur.next;
                per.next = cur;
            } else {
                per = cur;
                cur = cur.next;
            }
        }


//        ArrayList<Integer> list = new ArrayList<>();
//        ArrayList<Integer> deleteList = new ArrayList<>();
//        while (head !=null){
//            if(list.contains(head.val)){
//                deleteList.add(head.val);
//            }
//            list.add(head.val);
//            head = head.next;
//        }
//        list.removeAll(deleteList);
//        ListNode newhead = new ListNode(1);
//        ListNode end = newhead;
//        for (int i :
//                list) {
//            end.next = new ListNode(i);
//            end = end.next;
//        }
//        return newhead.next;

        return head.next;
    }
}
