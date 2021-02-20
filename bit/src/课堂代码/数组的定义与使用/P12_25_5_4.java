package 课堂代码.数组的定义与使用;

public class P12_25_5_4 {
    public static void main(String[] args) {
        int[] ints = {1, 2, 3, 4, 5};
        printArray(ints);
    }

    private static void printArray(int[] ints) {
        for (int i :
                ints) {
            System.out.println(i);
        }
    }
}
