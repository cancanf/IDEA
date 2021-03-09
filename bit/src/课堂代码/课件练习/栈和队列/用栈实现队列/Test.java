package 课堂代码.课件练习.栈和队列.用栈实现队列;

import java.util.Stack;

public class Test {
    public static void main(String[] args) {
        MyQueue myQueue = new MyQueue();
        for (int i = 1; i < 10; i++) {
            myQueue.push(i);
        }
    }

}

class MyQueue {
    Stack<Integer> stack;

    /**
     * Initialize your data structure here.
     */
    public MyQueue() {
        stack = new Stack<Integer>();
    }

    /**
     * Push element x to the back of queue.
     */
    public void push(int x) {
        //栈的特点是先入后出,要实现队列的特点,先入先出.
        //每一个入栈的时候,我们可以将之前的全部出栈并
        //
        int[] ints = new int[100];
        int i = 0;
        for (; !stack.empty(); i++) {
            ints[i] = stack.pop();
        }
        stack.push(x);
        for (; i > 0; i--) {
            stack.push(ints[i - 1]);
        }
    }


    /**
     * Removes the element from in front of queue and returns that element.
     */
    public int pop() {
        return stack.pop();
    }

    /**
     * Get the front element.
     */
    public int peek() {
        return stack.peek();
    }

    /**
     * Returns whether the queue is empty.
     */
    public boolean empty() {
        return stack.empty();
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */