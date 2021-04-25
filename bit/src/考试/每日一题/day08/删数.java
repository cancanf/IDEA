package 考试.每日一题.day08;

import java.util.ArrayList;
import java.util.Scanner;

public class 删数 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            ArrayList<Integer> list = new ArrayList<>();
            int N = in.nextInt();
            if (N > 1000) {
                N = 999;
            }
            for (int i = 0; i < N; i++) {
                list.add(i);
            }
            int i = 0;
            while (!(list.size() == 1)) {
                i = i + 2;
                if (i > list.size() - 1) {
                    i = i % list.size();
                }
                list.remove(i);
            }
            System.out.println(list.get(0));
        }
    }
}
