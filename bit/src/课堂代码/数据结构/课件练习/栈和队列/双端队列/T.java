package 课堂代码.数据结构.课件练习.栈和队列.双端队列;


public class T {
    public static void main(String[] args) {
        //未完成
        MyCircularDeque deque = new MyCircularDeque(1000);
        deque.insertFront(3);
        deque.insertLast(7);
        deque.insertLast(9);
        System.out.println(deque.getFront());
        deque.deleteLast();
        System.out.println(deque.getRear());

        deque.insertFront(9);
        deque.deleteLast();
        deque.getRear();
        System.out.println(deque.insertLast(2));
        deque.isFull();
    }
}

class MyCircularDeque {
    int[] queue;
    int head;
    int tail;
    int size;

    public MyCircularDeque(int k) {
        queue = new int[k + 1];
        head = 0;
        tail = 0;
    }


    public boolean insertFront(int value) {
        if (size == queue.length) {
            return false;
        }
        int index = (head + tail) % queue.length;
        int[] newquene = new int[queue.length];

        System.arraycopy(this.queue, head, newquene, head + 1, tail - head);
        newquene[head] = value;
        queue = newquene;
        head++;
        tail++;
        return true;
    }


    public boolean insertLast(int value) {
        int index = (head + tail) % queue.length;
        if (tail < index) {
            queue[tail++] = value;
            return true;
        } else {
            return false;
        }
    }

    public boolean deleteFront() {
        int[] newquene = new int[size];
        if (tail < size) {
            System.arraycopy(this.queue, 1, newquene, 0, tail - 1);
            queue = newquene;
            tail--;
            return true;
        } else {
            return false;
        }
    }


    public boolean deleteLast() {
        if (tail > 0) {
            tail--;
            return true;
        }
        return false;
    }


    public int getFront() {
        return queue[0];
    }


    public int getRear() {
        if (tail > 0) {
            return queue[tail];
        }
        return -1;
    }

    public boolean isEmpty() {
        return tail == 0;
    }


    public boolean isFull() {
        return tail == size;
    }

}
