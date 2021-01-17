package blue.蓝桥;

public class 分解 {
    private static boolean check(int n) {//检测数字是否含有2或者4,有则返回false没有则返回true
        int t;
        while (n != 0) {
            t = n % 10;
            if (t != 2 && t != 4)//尾数不等于2且不等于4
                n /= 10;
            else break;
        }
        return n == 0;

    }

    public static void main(String[] args) {

        int count = 0;
        for (int i = 1; i < 2019; i++) {
            for (int j = 1; j < 2019; j++) {
                for (int k = 1; k < 2019; k++) {
                    if (check(i) && check(j) && check(k) && i + j + k == 2019) {
                        if (i < j && j < k) {
                            count++;
                        }
                    }
                }
            }
        }
        System.out.println(count);
    }
}

