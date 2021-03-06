package 寒假作业.day12;

import java.util.Stack;

public class P2 {
    public static void main(String[] args) {
        String[] tokens = {"10", "6", "9", "3", "+", "-11", "*", "/", "*", "17", "+", "5", "+"};
        System.out.println(evalRPN(tokens));
        ;
    }

    public static int evalRPN(String[] tokens) {

        Stack<Integer> numstack = new Stack<>();

        for (String str :
                tokens) {
            if ("+".equals(str) || "-".equals(str) || "*".equals(str) || "/".equals(str)) {
                int num1 = numstack.pop();
                int num2 = numstack.pop();
                if ("+".equals(str)) {
                    numstack.push(num2 + num1);
                }
                if ("-".equals(str)) {
                    numstack.push(num2 - num1);
                }
                if ("*".equals(str)) {
                    numstack.push(num2 * num1);
                }
                if ("/".equals(str)) {
                    numstack.push(num2 / num1);
                }
            } else {
                numstack.push(Integer.parseInt(str));
            }
        }
        return numstack.pop();
    }
}
