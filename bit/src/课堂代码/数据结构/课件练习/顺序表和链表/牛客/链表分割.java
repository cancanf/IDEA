package 课堂代码.数据结构.课件练习.顺序表和链表.牛客;

public class 链表分割 {
    public static void main(String[] args) {
        ListNode listNode1 = new ListNode(4);
        ListNode listNode2 = new ListNode(3);
        ListNode listNode3 = new ListNode(2);
        ListNode listNode4 = new ListNode(1);
        listNode1.next = listNode2;
        listNode2.next = listNode3;
        listNode3.next = listNode4;
        listNode4.next = null;
        System.out.println(partition(listNode1, 3));
    }

    public static ListNode partition(ListNode pHead, int x) {
        if (pHead == null) {
            return null;
        }
        ListNode headBig = new ListNode(1);
        ListNode headBigend = headBig;

        ListNode headSmall = new ListNode(1);
        ListNode headSmallend = headSmall;
        while (pHead != null) {
            if (pHead.val >= x) {
                headBigend.next = pHead;
                headBigend = pHead;
            } else {
                headSmallend.next = pHead;
                headSmallend = pHead;
            }
            pHead = pHead.next;
        }
        headBigend.next = null;
        headSmallend.next = headBig.next;
        return headSmall.next;

    }
}
