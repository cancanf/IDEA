package 课堂代码.数组的定义与使用;

public class P12_25_5_5 {
    public static void main(String[] args) {
        int[] ints = new int[100];
        for (int i = 0; i < 100; i++) {
            ints[i] = i+1;
        }
        for (int i :
                ints) {
            System.out.println(i);
        }
    }
}
