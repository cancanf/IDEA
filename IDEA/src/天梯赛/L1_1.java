package 天梯赛2020;

import java.util.Scanner;

public class L1_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        in.nextLine();
        String[] password = new String[N];
        for (int i = 0; i < N; i++) {
            password[i] = in.nextLine();
        }
        for (int i = 0; i < N; i++) {
            if (isshort(password[i])) {
                check(password[i]);
            } else {
                System.out.println("Your password is tai duan le.");
            }
        }
    }

    public static boolean isshort(String password) {
        if (password.length() < 6)
            return false;
        else
            return true;
    }

    public static void check(String password) {
        char[] chars = password.toCharArray();
        boolean zi = false, shu = false, dot = false, other = false;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] >= 'a' && chars[i] <= 'z' || chars[i] >= 'A' && chars[i] <= 'Z') zi = true;
            else if (chars[i] >= '0' && chars[i] <= '9') shu = true;
            else if (chars[i] == '.') dot = true;
            else other = true;
        }
        if (other) System.out.println("Your password is tai luan le.");
        else if (zi && !shu) System.out.println("Your password needs shu zi.");
        else if (!zi && shu) System.out.println("Your password needs zi mu.");
        else System.out.println("Your password is wan mei.");

    }
}
