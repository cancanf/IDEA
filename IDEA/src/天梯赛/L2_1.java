package 天梯赛2020;

import java.util.Scanner;
import java.util.Stack;

public class L2_1 {

    public static void main(String args[]) {
        Scanner se = new Scanner(System.in);
        int M = se.nextInt();
        int N = se.nextInt();
        int K = se.nextInt();
        int num;
        int start = 1;
        boolean f;
        for (int i = 0; i < K; i++) {
            Stack<Integer> stack = new Stack<Integer>();
            start = 1;
            f = true;
            for (int j = 0; j < N; j++) {
                num = se.nextInt();
                while (start <= num) {
                    stack.push(start++);
                }
                //     不为空              栈大小不小于M             顶部元素等于num
                if (!stack.isEmpty() && stack.size() <= M && num == stack.peek()) {
                    stack.pop();
                } else {
                    f = false;
                }
            }
            if (f) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}

