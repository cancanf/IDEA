package 考试.第一次JavaSE;

import java.util.ArrayList;
import java.util.Scanner;

public class P_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            char[] chars = in.nextLine().toCharArray();
            ArrayList<Character> list = new ArrayList<>();
            for (int i = 0; i < chars.length; i++) {
                if (!list.contains(chars[i])) {
                    list.add(chars[i]);
                }
            }
            for (char a :
                    list) {
                System.out.print(a);
            }
            System.out.println();
        }
    }
}
