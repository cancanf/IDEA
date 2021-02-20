package 课堂代码.方法的使用;

public class P_12_20_4_4 {
    public static void main(String[] args) {
        int[] ints1 = new int[20];
        for (int i = 0; i < 20; i++) {
            ints1[i] = i;
        }
        for (int temp : sort(ints1)
        ) {
            System.out.print(temp + " ");
        }
    }

    private static int[] sort(int[] ints1) {
        int[] ints2 = new int[20];
        int i = 0, j = ints1.length - 1;
        int k = 0;
        while (i != j) {
            if (ints1[k] % 2 != 0) {
                ints2[i] = ints1[k];
                i++;
            } else {
                ints2[j] = ints1[k];
                j--;
            }
            k++;
        }
        return ints2;
    }
}
