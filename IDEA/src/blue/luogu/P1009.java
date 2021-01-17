package blue.luogu;

import java.math.BigInteger;
import java.util.Scanner;

public class P1009 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        BigInteger sum = BigInteger.valueOf(0);
        int n;

        n = in.nextInt();
        for (int i = 1; i <= n; i++) {


            sum = sum.add(digui(BigInteger.valueOf(i)));
        }
        System.out.println(sum);
    }

    private static BigInteger digui(BigInteger n) {

        while (true) {
            if (n.compareTo(BigInteger.valueOf(1)) == 0) {
                return n;
            } else {
                return n.multiply(digui(n.subtract(BigInteger.valueOf(1))));

            }
        }
    }


}
