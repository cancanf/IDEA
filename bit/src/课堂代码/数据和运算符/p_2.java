package 课堂代码.数据和运算符;

public class p_2 {
    public static void main(String[] args) {
        for (int i = 1000; i <= 2000; i++) {
            if (i % 100 == 0 ? i % 400 == 0 :i % 4 == 0 ) {
                System.out.println(i);
            }
        }
    }
}
