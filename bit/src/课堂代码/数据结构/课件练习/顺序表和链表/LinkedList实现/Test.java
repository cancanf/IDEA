package 课堂代码.数据结构.课件练习.顺序表和链表.LinkedList实现;

public class Test {
    public static void main(String[] args) {
        //空链表
       /*getlenth和addFirst,addLast检查完毕
        MyLinkedList linkedList = new MyLinkedList();
        System.out.println("长度为: " + linkedList.getLenth());
        linkedList.addFirst(1);
        System.out.println(linkedList.toString());
        System.out.println("长度为: " + linkedList.getLenth());
        linkedList.addFirst(2);
        System.out.println(linkedList.toString());
        System.out.println("=========================");
        linkedList = new MyLinkedList();
        System.out.println("长度为: " + linkedList.getLenth());
        linkedList.addLast(1);
        System.out.println(linkedList.toString());
        System.out.println("长度为: " + linkedList.getLenth());
        linkedList.addLast(2);
        System.out.println(linkedList.toString());
        System.out.println("=========================");
        */
        MyLinkedList linkedList = new MyLinkedList();
        System.out.println("长度为: " + linkedList.getLenth());
        System.out.println("数组越界");

        linkedList.add(0, 1);
        linkedList.add(1, 2);
        linkedList.add(2, 3);
        linkedList.add(3, 4);
//        linkedList.add(-10,20);
        //1 2 4 2
//        linkedList.removeFirst();
        //4 2 3
//        linkedList.removeLast();
        //4 2
//        linkedList.removeByIndex(0);
//        linkedList.removeByIndex(3);
//        linkedList.removeByIndex(2);
//        linkedList.removeByValue(3);
//        System.out.println(linkedList.get(0));
//        System.out.println(linkedList.get(3));
        linkedList.set(0, 100);


        System.out.println(linkedList.toString());
        System.out.println("长度为: " + linkedList.getLenth());

        linkedList = new MyLinkedList();
        linkedList.removeLast();
        linkedList.removeFirst();
        linkedList.removeByIndex(0);

        /*
        //非空
        for (int i = 0; i < 10; i++) {
            linkedList.addLast(i);
        }
        System.out.println("长度为: " + linkedList.getLenth());
        System.out.println(linkedList.toString());
        System.out.println("插入节点于角标5 值为 100");
        linkedList.add(5,100);
        System.out.println(linkedList.toString());
        */

    }
}
