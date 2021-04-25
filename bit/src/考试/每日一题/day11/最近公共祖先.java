package 考试.每日一题.day11;

public class 最近公共祖先 {

    public static int getLCA(int a, int b) {
        // write code here
        int min = Math.min(a, b), max = Math.max(a, b);
        while (min != 0 && max != 0 && min != max) {
            max = max / 2;
            if (max == min) {
                return max;
            }
            return getLCA(max, min);
        }
        return 1;
    }

    public static void main(String[] args) {
        System.out.println(getLCA(2, 3));
    }


}
