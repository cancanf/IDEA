package 课堂代码.程序逻辑作业;

import java.util.ArrayList;
import java.util.Scanner;

public class P12_14_3_4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        ArrayList<Character> list1 = new ArrayList<>();
        ArrayList<Character> list2 = new ArrayList<>();
        String result = Integer.toBinaryString(n);
        char[] chars = result.toCharArray();
        for (int i = 0; i < result.length(); i++) {
            if (i % 2 == 0) {
                list2.add(chars[i]);
            } else {
                list1.add(chars[i]);
            }
        }
        System.out.println("偶数位");
        list1.forEach(System.out::println);

        System.out.println("奇数位");
        list2.forEach(System.out::println);
    }
}
