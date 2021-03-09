package 课堂代码.课后作业.认识String类;

public class MyReplace {
    public static void main(String[] args) {
        //替换字符串某一部分
        String s = "abcd123higk";
        int begin = 4;
        String str = "egj";
        System.out.println(reolace(s, begin, str));
    }

    private static String reolace(String s, int begin, String str) {
        char[] chars = s.toCharArray();
        char[] bex = str.toCharArray();
        for (int i = begin; i < str.length() + begin; i++) {
            chars[i] = bex[i - begin];
        }
        String s1 = String.valueOf(chars);
        return s1;
    }
}
