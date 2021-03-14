package 课堂代码.数据结构.课件练习.栈和队列.有效的括号;

import java.util.HashMap;
import java.util.Stack;

public class tijie {
    public static void main(String[] args) {

        String s = "((";
        System.out.println(isValid(s));

    }

    public static boolean isValid(String s) {
        if (s.length() % 2 == 1) {
            return false;
        }
        //使用hashmap记录键值对,方便查找
        HashMap<Character, Character> hashMap = new HashMap<>();
        hashMap.put(')', '(');
        hashMap.put(']', '[');
        hashMap.put('}', '{');
        Stack<Character> stack = new Stack<>();
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (hashMap.containsKey(chars[i])) {
                if (stack.empty() || stack.pop() != hashMap.get(chars[i])) {
                    return false;
                }
            } else {
                stack.push(chars[i]);
            }
        }
        return stack.empty();
    }
}
