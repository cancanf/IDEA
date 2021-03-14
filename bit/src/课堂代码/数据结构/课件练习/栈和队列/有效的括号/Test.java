package 课堂代码.数据结构.课件练习.栈和队列.有效的括号;

import java.util.Stack;

public class Test {
    public static void main(String[] args) {

        String s = "))";
        System.out.println(isValid(s));

    }

    public static boolean isValid(String s) {
        if (s.length() % 2 == 1) {
            return false;
        }
        Stack<String> stack = new Stack<>();
        String[] split = s.split("");

        //遇见左括号向入栈对应括号,在遇见右括号的时候进行比较
        for (String str :
                split) {
            if ("(".equals(str)) {
                stack.push(")");
                continue;
            } else if ("[".equals(str)) {
                stack.push("]");
                continue;
            } else if ("{".equals(str)) {
                stack.push("}");
                continue;
            }
            if (stack.empty() || !stack.pop().equals(str)) {
                return false;
            }
        }
        return stack.empty();
    }
}