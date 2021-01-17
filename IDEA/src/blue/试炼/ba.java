package blue.试炼;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ba {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        ArrayList<Long> list = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            list.add(in.nextLong());
        }
        Collections.sort(list);
        long dengcha;
        if ((list.get(1) - list.get(0) > (list.get((int) N - 1) - list.get((int) (N - 2))))) {
            dengcha = list.get((int) N - 1) - list.get((int) (N - 2));
        } else {
            dengcha = list.get(1) - list.get(0);
        }
        System.out.println((list.get(N - 1) - list.get(0)) / dengcha + 1);
    }
}
