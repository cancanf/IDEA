package 考试.每日一题.day23;

import java.util.Scanner;

public class jvli {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            int n = in.nextInt();
            int[] gifts = {1, 2, 3, 2, 2};

            String charA = "aggbcdef";
            String charB = "abcdef";
            System.out.println(calStringDistance(charA, charB));
        }
    }

    private static int calStringDistance(String charA, String charB) {
        char[] charsA = charA.toCharArray();
        char[] charsB = charB.toCharArray();
        for (int i = 0; i < 1; i++) {

        }
        return 1;
    }
}
