package 考试.每日一题.day06;

public class zifuchuan {
    public static void main(String[] args) {
        String s = "0";
        int i = StrToInt(s);
        System.out.println(i);
    }

    public static int StrToInt(String str) {
        Integer.valueOf("-123456");
        if (str == null) {
            return 0;
        }
        char[] chars = str.toCharArray();
        int sum = 0;
        int i = 0;
        if (chars[0] == '-' || chars[0] == '+') {
            i = 1;
        }
        for (; i < chars.length; i++) {
            if ('0' <= chars[i] && chars[i] <= '9') {
                sum = sum * 10 + (chars[i] - '0');
            } else {
                return 0;
            }
        }
        if (chars[0] == '-') {
            return -sum;
        } else {
            return sum;
        }
    }
}
