package 课堂代码.课件练习.栈和队列.设计循环队列;

public class Test {
    public static void main(String[] args) {
        MyCircularQueue queue = new MyCircularQueue(3);
        queue.enQueue(1);
        queue.enQueue(2);
        queue.enQueue(3);
        queue.enQueue(4);
        System.out.println(queue.Rear());
        System.out.println(queue.isFull());
        System.out.println(queue.deQueue());
        queue.enQueue(4);
        System.out.println(queue.Rear());
    }
}

class MyCircularQueue {
    private int[] date;
    private int head = 0;
    private int tail = 0;
    private int size = 0;

    //MyCircularQueue(k): 构造器，设置队列长度为 k 。
    public MyCircularQueue(int k) {
        date = new int[k];
    }

    //enQueue(value): 向循环队列插入一个元素。如果成功插入则返回真。
    public boolean enQueue(int value) {
        if (size == date.length) {
            return false;
        }
        date[((head + size) % date.length)] = value;
        size++;
        return true;
    }

    //deQueue(): 从循环队列中删除一个元素。如果成功删除则返回真。
    public boolean deQueue() {
        if (size == 0) {
            return false;
        }
        head++;

        if (head == date.length) {
            head = 0;
        }
        size--;
        return true;
    }

    //Front: 从队首获取元素。如果队列为空，返回 -1 。
    public int Front() {
        if (size == 0) {
            return -1;
        }
        return date[head];
    }

    //Rear: 获取队尾元素。如果队列为空，返回 -1 。
    public int Rear() {
        if (size == 0) {
            return -1;
        }
        return date[(head + size - 1) % date.length];
    }

    //isEmpty(): 检查循环队列是否为空。
    public boolean isEmpty() {
        return size == 0;
    }

    //isFull(): 检查循环队列是否已满。
    public boolean isFull() {
        return size == date.length;
    }
}

/**
 * Your MyCircularQueue object will be instantiated and called as such:
 * MyCircularQueue obj = new MyCircularQueue(k);
 * boolean param_1 = obj.enQueue(value);
 * boolean param_2 = obj.deQueue();
 * int param_3 = obj.Front();
 * int param_4 = obj.Rear();
 * boolean param_5 = obj.isEmpty();
 * boolean param_6 = obj.isFull();
 */
