package blue.PTA.选拔赛前热身;

import java.util.Scanner;

public class 福到了 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String chu;
        int N;
//        chu = in.next();
        N = in.nextInt();
        char[][] zheng = new char[N][N];
        char[][] ni = new char[N][N];
//        in.next();
        for (int i = 0; i < N; i++) {
            char[] temp = in.nextLine().toCharArray();
            for (int j = 0; j < N; j++) {
                zheng[i][j] = temp[j];
            }
            for (int j = N - 1; j >= 0; j--) {
                ni[N - 1 - i][j] = temp[j];
            }
        }
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(zheng[i][j]);
            }
            System.out.println();
        }
    }
}
