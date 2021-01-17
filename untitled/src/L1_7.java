import java.util.Scanner;

public class L1_7 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n = in.nextInt(), m = in.nextInt();
        in.nextLine();

        for (int i = 0; i < m; i++) {
            double jia = Math.pow(2, n);
            String[] split = in.nextLine().split("");
            int sum = 0;
            for (int j = 0; j < n; j++) {
                jia = jia / 2;
                if (split[j].equals("n")) {
                    sum += jia;
                }
            }
            System.out.println(sum + 1);
        }
    }
}
