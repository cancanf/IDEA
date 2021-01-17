package blue.PTA.不明;

public class L1_008 {
    public static void main(String[] args) {
        long k = 0;
        for (int i = 1; i <= 1200000; i++) {
            if (1200000 % i == 0) {
                k++;
            }
        }
        System.out.println(k);
    }
}
