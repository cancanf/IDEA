package 考试.每日一题.day27;

import java.math.BigInteger;
import java.util.Scanner;

public class sanjiao {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            BigInteger a = BigInteger.valueOf(in.nextLong());
            BigInteger b = BigInteger.valueOf(in.nextLong());
            BigInteger c = BigInteger.valueOf(in.nextLong());
            if (a.add(b).compareTo(c) > 0 && a.add(c).compareTo(b) > 0 && c.add(b).compareTo(a) > 0) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }
}
