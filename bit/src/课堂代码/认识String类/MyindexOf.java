package 课堂代码.认识String类;

public class MyindexOf {
    public static void main(String[] args) {
        String s = "bit is very good";
        String s1 = "bit";

        System.out.println(myindex(s, s1));
    }

    public static int myindex(String s, String s1) {
        char[] chars = s.toCharArray();
        char[] chars1 = s1.toCharArray();
        int flag = 0;
        for (int i = 0, j = 0; i < chars.length; i++) {
            int tempi = i, tempj = 0;
            while (i < chars.length) {
                if (chars[tempi] == chars1[tempj]) {
                    tempi++;
                    tempj++;
                } else {
                    break;
                }
                if (tempj == chars1.length)
                    return i;
            }
        }
        return -1;
    }
}
