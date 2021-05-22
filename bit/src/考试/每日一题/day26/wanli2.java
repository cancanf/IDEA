package 考试.每日一题.day26;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Scanner;

public class wanli2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //大数乘法 Karetsuba乘法
        while (in.hasNext()) {
            String n = in.next();
            String r = in.next();
            BigDecimal Bign = new BigDecimal(n);
            BigDecimal Bigr = new BigDecimal(r);
            karetsuba(Bign, Bigr);
        }
    }

    private static void karetsuba(BigDecimal n, BigDecimal r) {
        BigDecimal pai = new BigDecimal("6.28");
        r = r.multiply(pai);
        //碗小于身高
        if (r.compareTo(n) == -1) {
            System.out.println("No");
        } else {
            System.out.println("Yes");
        }

    }
}

