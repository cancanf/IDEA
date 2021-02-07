package 课堂代码.顺序表和链表.链表逆置;

public class Main {
    public static void main(String[] args) {
        ListNode listNode = new ListNode(1);
        ListNode listNode2 = new ListNode(1);
        ListNode listNode3 = new ListNode(1);
        ListNode listNode4 = new ListNode(1);
        listNode.next = listNode2;
        listNode2.next = listNode3;
        listNode3.next = listNode4;
        listNode4.next = null;
//        reverseList(listNode);
        removeElements(listNode, 1);
    }

    public static ListNode reverseList(ListNode head) {
        //遍历头插带傀儡节点
        ListNode newhead = new ListNode();
        ListNode next;

        while (head != null) {
            next = head;
            head = head.next;
            next.next = newhead.next;
            newhead.next = next;

        }
        return newhead.next;
    }

    public static ListNode removeElements(ListNode head, int val) {
        //head 不带傀儡节点;
        return null;
    }
}
