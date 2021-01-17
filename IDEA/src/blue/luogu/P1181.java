package blue.luogu;

import java.util.ArrayList;
import java.util.Scanner;

public class P1181 {
    public static void main(String[] args) {
        int N, M;
        int q = 0, sum = 0, duan = 0;
        Scanner in = new Scanner(System.in);
        N = in.nextInt();
        M = in.nextInt();
        in.nextLine();
        String[] s = in.nextLine().split(" ");
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < s.length; i++) {
            list.add(Integer.parseInt(s[i]));
        }
        while (true) {

            if (q == s.length) {
                break;
            }
            sum += list.get(q);
            q++;
            if (sum > M) {
                q--;
                sum = 0;
                duan++;
            }

        }
        System.out.println(duan + 1);
    }
}
