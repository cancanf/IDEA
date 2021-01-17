package 练习.链表;

import java.util.Scanner;

public class weicha {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String temp = in.next();
        ListNode head = new ListNode();
        ListNode end = head;
        while(!temp.equals("#")){
            ListNode node = new ListNode(temp);

            end.next = node;
            end = node;
            temp = in.next();
        }
    }
}
