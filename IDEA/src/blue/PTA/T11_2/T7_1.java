package blue.PTA.T11_2;

import java.util.Scanner;

public class T7_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double kg, m;
        String[] s = in.nextLine().split(" ");
        kg = Double.parseDouble(s[0]);
        m = Double.parseDouble(s[1]);
        double pr = kg / (m * m);

        double so = Double.parseDouble(String.format("%.1f", pr));

        System.out.println(so);
        if (so > 25) {
            System.out.println("PANG");
        } else {
            System.out.println("Hai Xing");
        }

    }
}
