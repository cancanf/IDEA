package 考试.每日一题.day08;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class n个数最小的K个 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            ArrayList<Integer> list = new ArrayList<>();
            String[] s = in.nextLine().split(" ");
            int k = Integer.parseInt(s[s.length - 1]);
            for (int i = 0; i < s.length - 1; i++) {
                list.add(Integer.parseInt(s[i]));
            }
            list.sort(new Comparator<Integer>() {
                @Override
                public int compare(Integer o1, Integer o2) {
                    return o1 - o2;
                }
            });
            for (int i = 0; i < k; i++) {
                System.out.print(list.get(i) + " ");
            }
        }
    }
}
