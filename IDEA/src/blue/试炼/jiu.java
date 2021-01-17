package blue.试炼;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class jiu {
    public static void main(String[] args) {
        int N, M;

        Scanner in = new Scanner(System.in);
        N = in.nextInt();//+
        M = in.nextInt();//-
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < N + M + 1; i++) {
            list.add(in.nextInt());
        }
        Collections.sort(list);
        int sum = list.get(N + M);
        for (int i = N + M - 1; i >= 0; i--) {
            if (N > 0) {
                sum += list.get(i);
                N--;
            } else if (M > 0) {
                sum -= list.get(i);
                M--;
            }
        }
        System.out.println(sum);

    }
}
