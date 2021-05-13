package 考试.每日一题.day21;

import java.util.Scanner;

public class MP3光标 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            int musicSum = in.nextInt();
            in.nextLine();
            String[] orders = in.nextLine().split("");
            int current = 1;
            int left = 1, right = musicSum % 4;
            for (String order :
                    orders) {
                if (musicSum <= 4) {
                    if (order.equals("U")) {
                        current--;
                    } else {
                        current++;
                    }
                    if (current < 1) {
                        current = musicSum;
                    }
                    if (current > musicSum) {
                        current = 1;
                    }
                } else if (musicSum > 4) {

                    if (order.equals("U")) {
                        current--;
                        if (current < left) {
                            left--;
                            right--;
                        }
                    } else {
                        current++;
                        if (current > right) {
                            left++;
                            right++;
                        }
                    }
                    if (current < 1) {
                        current = musicSum;
                        left = musicSum - 3;
                        right = musicSum;

                    }
                    if (current > musicSum) {
                        current = 1;
                        left = 1;
                        right = 4;
                    }
                }
            }
            for (int i = left; i <= right; i++) {
                System.out.print(i + " ");
            }
            System.out.println();
            System.out.println(current);
        }
    }
}

