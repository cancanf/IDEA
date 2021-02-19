package 课堂代码.顺序表和链表.牛客;

public class 反转链表 {
    public static void main(String[] args) {
        ListNode listNode1 = new ListNode(1);
        ListNode listNode2 = new ListNode(1);
        ListNode listNode3 = new ListNode(2);
        ListNode listNode4 = new ListNode(3);
        listNode1.next = listNode2;
        listNode2.next = listNode3;
        listNode3.next = listNode4;
        listNode4.next = null;
        ListNode re = reverseList(listNode1);
    }

    public static ListNode reverseList(ListNode head) {
        //终止条件
        if (head == null || head.next == null) {
            return head;
        }
        //每次递归都返回的是最后一个节点
        ListNode reverse = reverseList(head.next);
        head.next.next = head;
        head.next = null;
        return reverse;
    }
}
