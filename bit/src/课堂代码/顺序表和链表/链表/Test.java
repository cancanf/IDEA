package 课堂代码.顺序表和链表.链表;

public class Test {
    public static void main(String[] args) {
        MyLinkedList list = new MyLinkedList();
        kuilei kuilei = new kuilei();
//无傀儡节点
        for (int i = 0; i < 10; i++) {
            list.add(i);
        }
        // 1. 遍历链表, 打印链表的每个元素
//        list.printfList();
//        System.out.println("最后一个节点");
//        System.out.println(list.lastNode().data);
//        System.out.println("倒数第二个节点");
//        System.out.println(list.penult().data);
//        System.out.println("倒数第N个节点");
//        System.out.println(list.reciprocalN(5).data);
//        System.out.println("获取链表长度");
//        System.out.println(list.size());
//        System.out.println("查找链表上是否存在某个元素");
//        System.out.println(list.contains(5));
//        System.out.println("使用下标和值进行插入");
//        list.insert(2,100);
//        System.out.println("按值删除链表节点");
//        list.remove(10);
//        System.out.println("按节点删除节点");
//        list.removeNode(list.head);
//        list.removeNode(list.last);
//        list.removeNode(list.head.next);
//        System.out.println("按下标删除节点");
//        list.removeIndex(5);
//        list.printfList();

//      有傀儡节点
        for (int i = 0; i < 10; i++) {
            kuilei.add(i);
        }
        System.out.println("遍历链表, 打印链表的每个元素");
        kuilei.printfList();
        System.out.println("最后一个节点");
        System.out.println(kuilei.lastNode().data);
        System.out.println("返回倒数第二个节点");
        System.out.println(kuilei.penult().data);
        System.out.println("返回倒数数第N个节点");
        System.out.println(kuilei.reciprocalN(3).data);
        System.out.println("获取链表长度");
        System.out.println(kuilei.size());
        System.out.println("查找链表上是否存在某个元素");
        System.out.println(kuilei.contains(5));
        System.out.println("使用下标和值进行插入");
        kuilei.insert(2, 100);
        System.out.println("按值删除链表节点");
        kuilei.remove(9);
        System.out.println("按节点删除节点");
        kuilei.removeNode(kuilei.head.next);
//        kuilei.removeNode(kuilei.last);
//        kuilei.removeNode(kuilei.head.next.next);
        System.out.println("按下标删除节点");
        kuilei.removeIndex(3);
        kuilei.printfList();

    }
}
