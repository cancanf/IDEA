package 课堂代码.课件练习.顺序表和链表.链表;

import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

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

        Node newnode = new Node(val);
        last.next = newnode;
        last = newnode;
        size++;
        return true;

        //头插法

//        Node newnode = new Node(val);
//        newnode.next = head.next;
//        head.next = newnode;
//        size++;
//        return true;
    }

    /**
     * 1. 遍历链表, 打印链表的每个元素
     */
    public void printfList() {
        Node i = head.next;
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
        Node i = head.next;
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

    /**
     * 5.获取链表长度
     */
    public int size() {
        return size;
    }

    /**
     * 6.查找链表上是否存在某个元素
     */
    public boolean contains(int val) {
        for (Node i = head.next; i != null; i = i.next) {
            if (i.data == val) {
                return true;
            }
        }
        return false;
    }

    /**
     * 7.1下标和值进行插入
     */
    public boolean insert(int index, int val) {
        if (index < 0 || index > size) {
            System.out.println("索引越界!");
            return false;
        }
        //插入到头
        Node newnode = new Node(val);
        Node i = head;
        //插入到其他
        for (int j = 0; j < index; j++) {
            i = i.next;
        }
        newnode.next = i.next;
        i.next = newnode;

        return true;
    }

    /**
     * 8.1按值删除节点
     */

    public boolean remove(int val) {
        Node i = head;
//        while (i.next.data != val) {
//            i = i.next;
//        }
//        if (i == null) {
//            System.out.println("未找到要删除的值!");
//            return false;
//        }
//        i.next = i.next.next;
//        return true;
//
        for (; i.next != null; i = i.next) {
            if (i.next.data == val) {
                i.next = i.next.next;
                return true;
            }
        }
        System.out.println("未找到要删除的值!");
        return false;
    }

    /**
     * 8.2按节点删除节点
     */
    public boolean removeNode(Node node) {
        Node i = head;
//        while (i.next != node) {
//            i = i.next;
//        }
//        if (i == null) {
//            System.out.println("未找到要删除的值!");
//            return false;
//        }
//        i.next = i.next.next;
//        return true;
//
        for (; i != null; i = i.next) {
            if (i.next == node) {
                i.next = i.next.next;
                return true;
            }
        }
        System.out.println("未找到要删除的节点!");
        return false;
    }

    /**
     * 8.3按下标删除节点
     */
    public boolean removeIndex(int index) {
        if (index < 0 || index > size) {
            System.out.println("下标越界!");
            return false;
        }
        Node i = head;
        for (int j = 0; j < index; j++) {
            i = i.next;
        }
        i.next = i.next.next;
        return true;
    }
}
