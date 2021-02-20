package 课堂代码.数据和运算符;

public class p_1 {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            sum += how(i);
        }
        System.out.println(sum);
    }

    private static int how(int i) {
        int sum = 0;
        while (i != 0) {
            if (i % 10 == 9) {
                sum++;
            }
            i /= 10;
        }
        return sum;
    }
}
