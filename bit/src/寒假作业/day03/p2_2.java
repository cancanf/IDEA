package 寒假作业.day03;

public class p2_2 {
    public static void main(String[] args) {
        System.out.println(isPalindrome(-121));

    }

    public static boolean isPalindrome(int x) {
        if (x < 0) return false;
        int y = x;
        int sum = 0;
        while (y != 0) {
            sum = sum * 10 + (y % 10);
            y /= 10;
        }
        return sum == x;
    }
}
