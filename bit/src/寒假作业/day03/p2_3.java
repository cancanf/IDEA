package 寒假作业.day03;

public class p2_3 {
    public static void main(String[] args) {
        System.out.println(isPalindrome(122121));

    }

    public static boolean isPalindrome(int x) {
        String str1 = String.valueOf(x);
        StringBuffer buffer = new StringBuffer(String.valueOf(x));
        return buffer.reverse().toString().equals(str1);

    }
}
