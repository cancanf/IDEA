package 考试.每日一题.day23;

import java.util.HashMap;
import java.util.Scanner;

public class redPackage {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            int n = in.nextInt();
            int[] gifts = {1, 2, 3, 2, 2};
            System.out.println(getValue(gifts, n));
        }
    }

    private static int getValue(int[] gifts, int n) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < gifts.length; i++) {
            if (map.containsKey(gifts[i])) {
                map.put(gifts[i], map.get(gifts[i]) + 1);
            } else {
                map.put(gifts[i], 1);
            }
            if (map.get(gifts[i]) > gifts.length / 2) {
                return gifts[i];
            }
        }
        return 0;
    }
}
