package 课堂代码.课后作业.认识String类;

public class MyCompareTo {
    public static void main(String[] args) {
        String str1 = "zbcd";
        String str2 = "abc";
        System.out.println(myconpareto(str1, str2));

    }

    private static int myconpareto(String str1, String str2) {
        int min = Math.min(str1.length(), str2.length());
        char[] chars1 = str1.toCharArray();
        char[] chars2 = str2.toCharArray();
        for (int i = 0; i < min; i++) {
            if (chars1[i] != chars2[i]) {
                return chars1[i] - chars2[i];
            }
        }
        return str1.length() - str2.length();
    }
}
