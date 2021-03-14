package 考试.第一次SE;

class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }

}


public class P_2 {
    public static void main(String[] args) {
        ListNode node = new ListNode(1);
        node.next = new ListNode(3);
        node.next.next = new ListNode(5);

        ListNode node2 = new ListNode(1);
        node2.next = new ListNode(2);
        node2.next.next = new ListNode(3);
        node2.next.next.next = new ListNode(9);
        node2.next.next.next.next = new ListNode(10);
//        ListNode merge = Merge(node, node2);
        ListNode node1 = Solution(node, node2);

        while (node1 != null) {
            System.out.println(node1.val);
            node1 = node1.next;
        }

//        while (merge!=null){
//            System.out.println(merge.val);
//            merge = merge.next;
//        }
    }

    public static ListNode Solution(ListNode list1, ListNode lis2) {
        ListNode newHead = new ListNode(-1);
        ListNode tmp = newHead;
        while (list1 != null && lis2 != null) {
            if (list1.val < lis2.val) {
                tmp.next = list1;
                tmp = tmp.next;
                list1 = list1.next;
            } else {
                tmp.next = lis2;
                tmp = tmp.next;
                lis2 = lis2.next;
            }

        }
        if (list1 == null) {
            tmp.next = lis2.next;
        }
        if (lis2 == null) {
            tmp.next = list1.next;
        }
        return newHead.next;
    }

    public static ListNode Merge(ListNode list1, ListNode list2) {

        ListNode top = new ListNode(-1);
        ListNode end = top;
        while (list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                end.next = list1;
                end = list1;
                list1 = list1.next;
            } else {
                end.next = list2;
                end = list2;
                list2 = list2.next;
            }
        }
        while (list1 != null) {
            end.next = list1;
            end = list1;
            list1 = list1.next;
        }
        while (list2 != null) {
            end.next = list2;
            end = list2;
            list2 = list2.next;
        }
        return top.next;
    }
}
