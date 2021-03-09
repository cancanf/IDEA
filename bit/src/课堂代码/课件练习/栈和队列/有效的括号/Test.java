package 课堂代码.课件练习.栈和队列.有效的括号;

import java.util.Stack;

public class Test {
    public static void main(String[] args) {

        String s = "()";
        System.out.println(isValid(s));

    }

    public static boolean isValid(String s) {
        if (s.length() % 2 == 1) {
            return false;
        }
        Stack<String> stack = new Stack<>();
        String[] split = s.split("");
        for (int i = 0; i < split.length; i++) {
            switch (split[i]) {
                case ")":
                    if (stack.empty() || !stack.pop().equals("(")) {
                        return false;
                    }
                    break;
                case "]":
                    if (stack.empty() || !stack.pop().equals("[")) {
                        return false;
                    }
                    break;
                case "}":
                    if (stack.empty() || !stack.pop().equals("{")) {
                        return false;
                    }
                    break;
                default:
                    stack.push(split[i]);
            }

        }
        return stack.empty();
    }
}