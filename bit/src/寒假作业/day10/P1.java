package 寒假作业.day10;

public class P1 {
    public static void main(String[] args) {
        System.out.println(myAtoi("   -42"));
    }

    public static int myAtoi(String s) {
        //StringBuilder builder = new StringBuilder();
        char[] array = s.toCharArray();
        int i = 0;
        boolean sign = true;
        while (array[i] == ' ') {
            i++;
        }
        if (array[i] == '-') {
            i++;
            sign = false;
        } else if (array[i] == '+') {
            i++;
            sign = true;
        }
        for (int j = i; j < i + 10; j++) {
            if (array[j] <= '9' && array[j] >= '0') {

            }
        }
        return 1;
    }
}
