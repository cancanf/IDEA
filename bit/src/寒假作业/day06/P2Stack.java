package 寒假作业.day06;

import java.util.Stack;

public class P2Stack {
    public static void main(String[] args) {
        System.out.println(reverseOnlyLetters("a-bC-dEf-ghIj"));
    }

    public static String reverseOnlyLetters(String S) {
        Stack<Character> stack = new Stack<>();
        char[] chars = S.toCharArray();
        for (char c :
                chars) {
            if (Character.isLetter(c)) {
                stack.push(c);
            }
        }
        StringBuilder builder = new StringBuilder();
        for (char c :
                chars) {
            if (Character.isLetter(c)) {
                builder.append(stack.pop());
            } else {
                builder.append(c);
            }
        }
        return builder.toString();
    }
}
