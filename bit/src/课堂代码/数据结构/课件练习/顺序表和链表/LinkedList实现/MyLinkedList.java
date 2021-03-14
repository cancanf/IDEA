package 课堂代码.数据结构.课件练习.顺序表和链表.LinkedList实现;

class Node {
    int val;
    Node prev = null;
    Node next = null;

    public Node(int val) {
        this.val = val;
    }

    public Node(int val, Node prev, Node next) {
        this.val = val;
        this.prev = prev;
        this.next = next;
    }
}

public class MyLinkedList {
    private Node head;
    private Node tail;
    private int lenth = 0;

    public MyLinkedList() {
        head = null;
        tail = null;
    }

    public int getLenth() {
        return this.lenth;
    }

    //插入节点
    //头插
    public void addFirst(int val) {
        //无傀儡节点
        Node newnode = new Node(val);
        //空链表,头节点为空
        if (head == null) {
            head = newnode;
            tail = newnode;
        } else {
            newnode.next = head;
            head.prev = newnode;
            head = newnode;
        }
        lenth++;
    }

    //尾插
    public void addLast(int val) {
        Node newnode = new Node(val);
        if (head == null) {
            head = newnode;
            tail = newnode;
        } else {
            tail.next = newnode;
            newnode.prev = tail;
            tail = newnode;
        }
        lenth++;
    }

    //指定位置插入
    public void add(int index, int val) {
        if (index < 0 || index > lenth) {
            throw new ArrayIndexOutOfBoundsException();
        }
        if (index == 0) {//头结点
            addFirst(val);
        } else if (index == lenth) {
            //插入节点为尾节点
            addLast(val);
        } else {
            //普通节点
            Node newnode = new Node(val);//4
            Node nextnode = getNode(index);//2
            Node prevnode = nextnode.prev;//1
            lenth++;
            prevnode.next = newnode;
            newnode.prev = prevnode;

            newnode.next = nextnode;
            nextnode.prev = newnode;

        }

    }

    //删除头结点
    public void removeFirst() {
        if (head == null) {
            return;
        }
        if (head.next == null) {
            head = null;
            tail = null;
            lenth = 0;
            return;
        }
        //一般情况

        head = head.next;
        head.prev = null;
        lenth--;
    }

    //删除尾节点
    public void removeLast() {
        if (head == null) {
            return;
        }
        if (head.next == null) {
            head = null;
            tail = null;
            lenth = 0;
            return;
        }

        tail = tail.prev;
        tail.next = null;
        lenth--;
    }

    //指定位置删除
    public void removeByIndex(int index) {
        if (index < 0 || index > lenth) {
            throw new ArrayIndexOutOfBoundsException();
        }
        if (index == 0) {
            removeFirst();
            return;
        }
        if (index == lenth - 1) {
            removeLast();
            return;
        }
        Node pervnode = getNode(index - 1);
        Node nextnode = pervnode.next.next;
        pervnode.next = nextnode;
        nextnode.prev = pervnode;
        lenth--;


    }

    //指定值删除
    public void removeByValue(int val) {
        int index = indexOf(val);
        if (index != -1) {
            removeByIndex(index);
        }
    }

    //根据下标找到节点
    public Node getNode(int index) {
        if (index < 0 || index > lenth) {
            throw new ArrayIndexOutOfBoundsException();
        } else {
            Node serch = head;
            for (int i = 0; i < index; i++) {
                serch = serch.next;
            }
            return serch;
        }
    }

    //得到指定节点的值
    public int get(int index) {
        Node node = getNode(index);
        if (node != null) {
            return node.val;
        } else {
            return -1;
        }
    }

    //查找值所对应下标
    public int indexOf(int value) {
        Node cur = head;
        for (int i = 0; i < lenth; i++) {
            if (cur.val == value) {
                return i;
            }
            cur = cur.next;
        }
        return -1;
    }

    //修改指定下标节点的值
    public void set(int index, int value) {
        if (index < 0 || index > lenth) {
            throw new ArrayIndexOutOfBoundsException();
        }
        Node node = getNode(index);
        node.val = value;
    }

    @Override
    public String toString() {
        Node cur = head;
        StringBuilder strbuilder = new StringBuilder();
        for (int i = 0; i < lenth; i++) {
            strbuilder.append(cur.val + " ");
            cur = cur.next;
        }
        return strbuilder.toString();
    }
}
