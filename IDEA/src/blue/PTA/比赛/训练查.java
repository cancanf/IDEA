package blue.PTA.比赛;

import java.util.Scanner;
import java.util.Stack;

public class 训练查 {
    public static void main(String[] args) {

        Stack<Object> stack = new Stack<>();
        Scanner scan = new Scanner(System.in);

        String s = scan.nextLine();
        String[] sarray = s.split(" ");

        String regex = "[0-9]*";//缺个*
        boolean temp = false;
        int number = 0;
        int fuhao = 0;


        for (int i = sarray.length - 1; i >= 0; i--) {
            try {
                if (sarray[i].matches(regex)) {
                    stack.push(Double.parseDouble(sarray[i]));
                    number++;
                } else {
                    fuhao++;
                    double a = (double) stack.pop();
                    double b = (double) stack.pop();
                    double result = jisuan(a, b, sarray[i]);

                    stack.push(result);
                }
            } catch (Exception e) {
                temp = true;
            }
        }
        if (temp || number - 1 != fuhao || stack.empty()) {
            System.out.println("ERROR");
        } else {
            double ans = (double) stack.pop();
            System.out.printf("%.1f", ans);
        }
    }

    public static double jisuan(double a, double b, String f) {
        switch (f) {
            case "+":
                return a + b;
            case "-":
                return a - b;
            case "*":
                return a * b;
            case "/":
                return a / b;
        }
        return 0;
    }
}

