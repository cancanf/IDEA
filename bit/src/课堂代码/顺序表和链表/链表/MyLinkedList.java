package 课堂代码.顺序表和链表.链表;

/**
 * @author 精神小伙
 */
public class MyLinkedList {

    //无傀儡节点
    public Node head;
    public Node last;
    private int size = 0;


    public boolean add(int val) {
//      尾插法
        Node newnode = new Node(val);
        if (head == null) {
            head = newnode;
            last = newnode;
        } else {
            last.next = newnode;
            last = newnode;
        }
        size++;
        return true;

        //头插法
//        Node newnode = new Node(val);
//        if (head == null) {
//            head = newnode;
//            last = newnode;
//        } else {
//            newnode.next = head;
//            head = newnode;
//        }
//        size++;
//        return true;
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
     * 3.返回倒数第二个节点
     */
    public Node penult() {
        Node i = head;
        while (i != null && i.next != null && i.next.next != null) {
            i = i.next;
        }
        return i;
    }

    /**
     * 4.返回倒数数第N个节点,正数不写了
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
        for (Node i = head; i != null; i = i.next) {
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
        //插入到头
        Node newnode = new Node(val);
        Node i = head;
        if (index == 0) {
            newnode.next = head;
            head = newnode;
        } else {//插入到其他
            for (int j = 0; j < index - 1; j++) {
                i = i.next;
            }
            newnode.next = i.next;
            i.next = newnode;
        }
        return true;
    }

    /**
     * 8.1按值删除节点
     */

    public boolean remove(int val) {
        Node i = head;
        if (val == head.data) {
            head = head.next;
            return true;
        }
        while (i.next != null && i.next.data != val) {
            i = i.next;
        }
        if (i.next == null) {
            return false;
        }
        i.next = i.next.next;
        return true;
    }

    /**
     * 8.2按节点删除节点
     */
    public boolean removeNode(Node node) {
        Node i = head;
        if (node == head) {
            head = head.next;
            return true;
        }
        while (i != null && i.next != node) {
            i = i.next;
        }

        if (i == null) {
            return false;
        }

        i.next = i.next.next;
        return true;
    }

    /**
     * 8.3按下标删除节点
     */
    public boolean removeIndex(int index) {
        if (index < 0 || index > size) {
            return false;
        }
        if (index == 0) {
            head = head.next;
            return true;
        }
        Node i = head;
        for (int j = 0; j < index - 1; j++) {
            i = i.next;
        }
        i.next = i.next.next;
        return true;
    }
}
