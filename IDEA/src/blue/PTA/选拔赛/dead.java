package blue.PTA.选拔赛;

import java.util.Scanner;

public class dead {
    public static void main(String[] args) {
        int day;
        String input;
        Scanner in = new Scanner(System.in);
        day = in.nextInt();
        String[] split = in.nextLine().split(":");
        System.out.println(day);
        for (String i : split) {
            System.out.println(i);
        }

    }
}
