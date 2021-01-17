package blue.试炼;

public class zhengshuhe {
    public static void main(String[] args) {//2019, 3个数 不包括2||4;
        int count = 0;
        int shuzi = 2019;
        for (int i = 1; i < shuzi; i++) {
            for (int j = 1; j < shuzi - i; j++) {
                int k = shuzi - i - j;
                if (i != j && i != k && j != k) {
                    if (check(i) && check(j) && check(k) && i + j + k == shuzi) {
                        count++;
                    }
                }
            }
        }
        System.out.println(count / 6);
    }

    private static boolean check(int i) {
        int wei = 0;
        while (i > 0) {
            wei = i % 10;
            if (wei == 2 || wei == 4) {
                return false;
            } else {
                i = i / 10;
            }
        }
        return true;
    }
}
