package 课堂代码.数据结构.课件练习.顺序表和链表.ArrayList实现;

class MyArrayListIndexOutOfRangeException extends RuntimeException {
    public MyArrayListIndexOutOfRangeException(String message) {
        super(message);
    }
}

public class MyArrayList {

    private String[] data = null;
    //当前容量
    private int size = 0;
    //最大容量
    private int capacity = 100;

    public MyArrayList() {
        this.data = new String[capacity];
    }

    //增删改查方法
    private void realloc() {
        int newscast = capacity + (capacity >> 2);
        String[] newdate = new String[newscast];
        for (int i = 0; i < data.length; i++) {
            newdate[i] = data[i];
        }
        data = newdate;
    }

    public boolean add(String elem) {
        if (size == capacity) {
            realloc();
        }
        data[size++] = elem;
        return true;
    }

    public boolean add(int index, String elem) {
        if (index < 0 || index > size) {
            return false;
        }
        if (size == capacity) {
            realloc();
        }
        if (size - index >= 0) {
            System.arraycopy(data, index, data, index + 1, size - index);
        }
        /*
        for (int i = size - 1; i >= index; i--) {
            data[i + 1] = data[i];
        }
         */
        data[index] = elem;
        return true;
    }

    public String remove(int index) {
        if (index < 0 || index > size) {
            return null;
        }
        String result = data[index];
        for (int i = index; i < size - 1; i++) {
            data[i] = data[i + 1];
        }
        size--;
        return result;
    }

    public boolean remove(String elem) {
        int index = 0;
        for (; index < size; index++) {
            if (data[index].equals(elem)) {
                break;
            }
        }
        if (index > size) {
            return false;
        }
        for (int i = index; i < size - 1; i++) {
            data[i] = data[i + 1];
        }
        size--;
        return true;
    }

    public String get(int index) {
        if (index < 0 || index > size) {
            throw new MyArrayListIndexOutOfRangeException("下标越界 ! index " + index);
        }
        return data[index];
    }

    public void set(int index, String elem) {
        if (index < 0 || index > size) {
            throw new MyArrayListIndexOutOfRangeException("下标越界 ! index " + index);
        }
        data[index] = elem;
    }

    public boolean contains(String elem) {
        for (int i = 0; i < size; i++) {
            if (data[i].equals(elem)) {
                return true;
            }
        }
        return false;
    }

    public int indexOf(String elem) {
        for (int i = 0; i < size; i++) {
            if (data[i].equals(elem)) {
                return i;
            }
        }
        return -1;
    }

    // 9. 查找元素位置(从后往前找)
    public int lastIndexOf(String elem) {
        for (int i = size - 1; i >= 0; i--) {
            if (data[i].equals(elem)) {
                return i;
            }
        }
        return -1;
    }

    public void clear() {
        size = 0;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }


    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("[");
        for (int i = 0; i < size; i++) {
            stringBuilder.append(data[i]);
            if (i < size - 1) {
                stringBuilder.append(",");
            }
        }
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}