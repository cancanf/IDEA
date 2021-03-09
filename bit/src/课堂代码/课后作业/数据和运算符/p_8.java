package 课堂代码.课后作业.数据和运算符;

public class p_8 {
    public static void main(String[] args) {
        for (int i = 0; i <= 999; i++) {
            double sum = 0;
            int temp = i;
            for (int j = 0; j < 3; j++) {
                sum += Math.pow(temp % 10, 3);
                temp /= 10;
            }
            if (sum == i) {
                System.out.println(i);
            }
        }
    }
}
