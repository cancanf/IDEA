

import java.util.Scanner;

public class L1_6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();
        int sum = 0, jilu = 0;
        int hang = 0;
        while (!input.equals(".")) {
            hang++;
            String[] s = input.split(" ");
            for (int i = 0; i < s.length; i++) {
                if (s[i].length() > 4) {
                    s[i] = s[i].substring(0, 4);

                }
            }
            for (int i = 0; i + 2 < s.length; i++) {
                if (s[i].equals("chi1") && s[i + 1].equals("huo3") && s[i + 2].equals("guo1")) {
                    sum++;
                    if (jilu == 0) {
                        jilu = hang;
                    }
                }
            }
            input = in.nextLine();
        }
        System.out.println(hang);
        if (sum != 0) {
            System.out.println(jilu + " " + sum);
        } else {
            System.out.println("-_-#");
        }
    }
}
