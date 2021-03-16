package 课堂代码.数据结构.课件练习.栈和队列.最近请求数字;

import java.util.Stack;

public class test {
    public static void main(String[] args) {
        RecentCounter counter = new RecentCounter();
        counter.ping(1);
        counter.ping(100);
        counter.ping(3001);
        counter.ping(3002);
    }
}

class RecentCounter {
    Stack<Integer> stack;
    int[] num = new int[10000];
    int i = 0;

    public RecentCounter() {
        stack = new Stack<Integer>();
    }

    public int ping(int t) {
        stack.push(t);

        for (; !stack.empty(); i++) {
            int a = stack.pop();
            num[i] = a;
            if (a < t - 3000) {
                return i;
            }
        }
        for (int k = i - 1; k >= 0; k--) {
            stack.push(num[k]);
        }
        return stack.size();
    }
}
