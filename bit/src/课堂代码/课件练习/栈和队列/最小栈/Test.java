package 课堂代码.课件练习.栈和队列.最小栈;

import java.util.Stack;

public class Test {
    public static void main(String[] args) {
        MinStack minStack = new MinStack();
        minStack.push(-2);
        minStack.push(0);
        minStack.push(-3);
        System.out.println(minStack.getMin());
        System.out.println(minStack.top());
        minStack.pop();
    }
}

class MinStack {
    Stack<Integer> stack;
    Stack<Integer> minstack;

    /**
     * initialize your data structure here.
     */
    public MinStack() {
        //题解采用辅助栈的做法
        stack = new Stack<>();
        minstack = new Stack<>();
        minstack.push(Integer.MAX_VALUE);
    }

    public void push(int x) {
        stack.push(x);
        if (minstack.empty() || x <= minstack.peek()) {
            minstack.push(x);
        }
    }

    public void pop() {
        int ret = stack.pop();
        if (!minstack.empty() && ret == minstack.peek()) {
            minstack.pop();
        }
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return minstack.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
