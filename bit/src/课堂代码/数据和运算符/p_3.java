package 课堂代码.数据和运算符;

public class p_3 {
    public static void main(String[] args) {
        for (int i = 2; i <= 100; i++) {
            if (check(i)) {
                System.out.println(i);
            }
        }
    }

    private static boolean check(int i) {
        for (int j = 2; j <= Math.sqrt(i); j++) {
            if (i % j == 0) {
                return false;
            }
        }
        return true;
    }
}
