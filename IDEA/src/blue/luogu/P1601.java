package blue.luogu;

import java.math.BigInteger;
import java.util.Scanner;

public class P1601 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String n = in.next();
        BigInteger a = new BigInteger(n);
        n = in.next();
        BigInteger b = new BigInteger(n);
        System.out.println(a.add(b));
    }
}
