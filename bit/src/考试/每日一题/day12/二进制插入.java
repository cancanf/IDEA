package 考试.每日一题.day12;

public class 二进制插入 {
    public static void main(String[] args) {
        binInsert(1024, 19, 2, 6);
    }

    public static int binInsert(int n, int m, int j, int i) {
        // write code here
        /*
        0100 0000 0000  1024
        0100 0100 1100  1100
             0001 0011   19
        * */
        char[] nchar = Integer.toBinaryString(n).toCharArray();
        char[] mchar = Integer.toBinaryString(m).toCharArray();
        for (int index = mchar.length - 1; index >= 0; index--) {
            nchar[nchar.length + index - mchar.length - j] = mchar[index];
        }
        int sum = 0;
        for (int k = nchar.length - 1; k >= 0; k--) {
            if (nchar[k] == '1') {
                sum += Math.pow(2, nchar.length - k - 1);
            }
        }
        return 1;
    }
}
