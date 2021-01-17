package blue.蓝桥;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Scanner;

public class D {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int sum = 0;
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 6; i++) {
            list.add(in.nextInt());
            sum += list.get(i);
        }

        int n = list.size();
        double sim = sum / 6.0;
        int sum1 = 0;
        int sum2 = 0;

        for (int k = 0; k < n; k++) {
            double min = sim - list.get(0);
            int t = 0;
            for (int i = 0; i < list.size() - 1; i++) {
                double cha = sim - list.get(i);

                if (cha < min) {
                    min = cha;
                    t = i;
                }
            }
            if (sum1 < sum2) {
                sum1 += list.get(t);
            } else {
                sum2 += list.get(t);
            }
            list.remove(t);
        }
        System.out.println(sum1 - sum2);
        BigInteger bigInteger = new BigInteger(String.valueOf(1));
    }

}
