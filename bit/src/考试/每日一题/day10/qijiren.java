package 考试.每日一题.day10;

public class qijiren {
    public static void main(String[] args) {
        int i = new Robot().countWays(3, 4);
        System.out.println(i);
    }

    public static class Robot {
        public int countWays(int x, int y) {
            // write code here
            int max = Math.max(x, y);
            if (max < 2) {
                return 0;
            }
            if (max == 2) {
                return 2;
            }
            int total = 0;
            for (int i = 1; i <= max; i++) {
                total += i;
            }
            return total;
        }
    }
}
