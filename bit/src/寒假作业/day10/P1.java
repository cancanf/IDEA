package 寒假作业.day10;

public class P1 {
    public static void main(String[] args) {
        System.out.println(myAtoi("-2147483647"));
    }

    public static int myAtoi(String s) {
        //StringBuilder builder = new StringBuilder();
        char[] array = s.toCharArray();
        int i = 0;
        int sign = 1;
        while (i < s.length() && array[i] == ' ') {
            i++;
        }
        if (i == s.length()) {
            return 0;
        }

        if (array[i] == '-') {
            i++;
            sign = -1;
        } else if (array[i] == '+') {
            i++;
        }
        int res = 0;
        while (i < s.length()) {
            char curr = array[i];
            if (curr > '9' || curr < '0') {
                break;
            }
            System.out.println((curr - '0'));
            //res 大于 越界值/10 或者 res 等于越界值/10 且 curr>越界值的最后一位(保证res在下面运算的结果范围在int最大范围里)
            if (res > Integer.MAX_VALUE / 10 || (res == Integer.MAX_VALUE / 10 && (curr - '0') > Integer.MAX_VALUE % 10)) {
                return Integer.MAX_VALUE;
            }
            if (res < Integer.MIN_VALUE / 10 || (res == Integer.MIN_VALUE / 10 && (curr - '0') > -(Integer.MIN_VALUE % 10))) {
                return Integer.MIN_VALUE;
            }
            res = res * 10 + sign * (curr - '0');
            i++;
        }
        return res;
    }
}
