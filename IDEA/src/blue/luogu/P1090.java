package blue.luogu;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class P1090 {
    public static void main(String[] args) {
        long star = System.currentTimeMillis();

        Scanner in = new Scanner(System.in);
        int n, tili = 0;
        int[] a;
        n = in.nextInt();
        in.nextLine();
        String[] s = in.nextLine().split(" ");
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < s.length; i++) {
            list.add(Integer.parseInt(s[i]));
        }
        for (int i = 0; i < s.length - 1; i++) {
            list.sort(new Comparator<Integer>() {
                @Override
                public int compare(Integer o1, Integer o2) {
                    return o1 - o2;
                }
            });

            tili += list.get(i) + list.get(i + 1);
            list.set(i + 1, list.get(i) + list.get(i + 1));

        }
        System.out.println(tili);

        long endTime = System.currentTimeMillis();
//        System.out.println(endTime-star);

    }
}

