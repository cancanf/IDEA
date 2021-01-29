package 寒假作业.day03;

public class p2 {
    public static void main(String[] args) {

        System.out.println(isPalindrome(12334321));


    }

    public static boolean isPalindrome(int x) {
        //双指针
        char[] chars = String.valueOf(x).toCharArray();
        for (int i = 0, j = chars.length - 1; i < j; i++, j--) {
            if (chars[i] != chars[j]) {
                return false;
            }
        }
        return true;
    }
}
