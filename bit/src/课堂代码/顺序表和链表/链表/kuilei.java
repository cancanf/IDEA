package 课堂代码.顺序表和链表.链表;

/**
 * @author 精神小伙
 */
public class kuilei {

    //傀儡节点永远的神
    public Node head = new Node();
    public Node last = head;
    private int size = 0;

    public boolean add(int val) {
        //尾插法

//        Node newnode = new Node(val);
//        last.next = newnode;
//        last = newnode;
//        size++;
//        return true;

        //头插法

        Node newnode = new Node(val);
        newnode.next = head.next;
        head.next = newnode;
        size++;
        return true;
    }

    /**
     * 1. 遍历链表, 打印链表的每个元素
     */
    public void printfList() {
        Node i = head;
        while (i != null) {
            if (i == head) {
                System.out.print("链表元素为: ");
            }
            System.out.print(" " + i.data);
            i = i.next;
        }
        System.out.println();
    }

    /**
     * 2. 遍历链表, 找到链表的最后一个节点
     */

    public Node lastNode() {
        if (size == 0) {
            return null;
        }
        return last;
    }

    /**
     * 返回倒数第二个节点
     */
    public Node penult() {
        Node i = head;
        while (i != null && i.next != null && i.next.next != null) {
            i = i.next;
        }
        return i;
    }

    /**
     * 返回倒数数第N个节点
     */
    public Node reciprocalN(int n) {
        //第一种
        Node i = head;
        for (int j = 0; j < size - n; j++) {
            i = i.next;
        }
        return i;
    }

}
