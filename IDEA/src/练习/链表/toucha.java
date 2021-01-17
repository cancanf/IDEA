package 练习.链表;

import java.util.Scanner;

public class toucha {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String temp = in.next();
        ListNode head = new ListNode();

        while(!temp.equals("#")){
            ListNode node = new ListNode(temp);
            node.next = head.next;
            head.next = node;
            temp = in.next();
        }
    }
}
