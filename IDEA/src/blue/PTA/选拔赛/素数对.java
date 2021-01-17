package blue.PTA.选拔赛;

import java.util.ArrayList;
import java.util.Scanner;

public class 素数对 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        boolean isok = true;
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 1; i < n; i++) {
            isok = true;
            for (int j = 2; j < i / 2 + 1; j++) {
                if (i % j == 0) {
                    isok = false;
                    continue;
                }
            }
            if (isok) {
                list.add(i);
            }
        }
        int jishu = 0;
        for (int i = 0; i < list.size() - 1; i++) {
            if (list.get(i) + 2 == list.get(i + 1)) {
                jishu++;
            }
        }
        System.out.print(jishu);

    }
}

