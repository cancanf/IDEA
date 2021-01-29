package 寒假作业.day08;

public class Gire {
    public static int ans = 0;

    public static void main(String[] args) {
        func(4, 0);
        System.out.println(ans);
    }

    public static int func(int n, int step) {
        if (n < 0) {
            return 0;
        }
//        System.out.println(step);
        if (n == 0 && step % 2 == 0) {
            ++ans;
        }
        func(n - 1, step + 1);
        func(n - 2, step + 1);
//        func(n - 1,++step);
//        func(n - 2,++step);
        return 0;
    }
}
