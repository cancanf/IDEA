package 课堂代码.课后作业.类和对象;

public class text {
    public static boolean threeConsecutiveOdds(int[] arr) {
        for (int i = 2; i < arr.length; i++) {
            if (check(arr[i - 2]) && check(arr[i - 1]) && check(arr[i])) {
                return true;
            }
        }
        return false;
    }

    public static boolean check(int i) {
        return i % 2 != 0;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 34, 3, 4, 5, 7, 23, 12};
        System.out.println(threeConsecutiveOdds(arr));
    }
}