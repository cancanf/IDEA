package 课堂代码.数据结构.课件练习.栈和队列.用队列实现栈;


public class Test {
    public static void main(String[] args) {
        MyStack myStack = new MyStack();
        for (int i = 0; i < 2; i++) {
            myStack.push(i);
        }
        System.out.println(myStack.top());
        System.out.println(myStack.empty());
        System.out.println(myStack.pop());
        System.out.println(myStack.pop());
        System.out.println(myStack.pop());
    }
}

class MyStack {

    private int[] date;
    int size;


    /**
     * Initialize your data structure here.
     */
    public MyStack() {
        date = new int[10];
        size = 0;
    }

    /**
     * Push element x onto stack.
     */
    public void push(int x) {
        //扩容
        if (size >= date.length) {
            int[] ints = new int[date.length + (date.length >> 1)];
            System.arraycopy(date, 0, ints, 0, size);
            date = ints;
        }
        date[size++] = x;
    }

    /**
     * Removes the element on top of the stack and returns that element.
     */
    public int pop() {
        if (size == 0) {
            return -1;
        }
        return date[--size];
    }

    /**
     * Get the top element.
     */
    public int top() {
        if (size == 0) {
            return -1;
        }
        return date[size - 1];
    }

    /**
     * Returns whether the stack is empty.
     */
    public boolean empty() {
        return size == 0;
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */
