import java.util.Scanner;

public class L1_8 {
    static int[][] biao = new int[3][3];

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int jix = 0, jiy = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                biao[i][j] = in.nextInt();
                if (biao[i][j] == 0) {
                    jix = i;
                    jiy = j;
                }
            }
        }
        //检查
        for (int j = 1; j <= 9; j++) {
            if (!check(j)) {
                biao[jix][jiy] = j;
            }
        }

        for (int j = 0; j < 3; j++) {
            int x = in.nextInt(), y = in.nextInt();
            System.out.println(biao[x - 1][y - 1]);
        }

        int fangxiang = in.nextInt();
        int sum = 0;
        if (fangxiang == 1 || fangxiang == 2 || fangxiang == 3) {
            for (int j = 0; j < 3; j++) {
                sum += biao[fangxiang - 1][j];
            }
        } else if (fangxiang == 4 || fangxiang == 5 || fangxiang == 6) {
            for (int j = 0; j < 3; j++) {
                sum += biao[j][fangxiang - 4];
            }
        } else if (fangxiang == 7) {
            for (int j = 0; j < 3; j++) {
                sum += biao[j][j];
            }
        } else if (fangxiang == 8) {
            sum += biao[2][0] + biao[1][1] + biao[0][2];
        }
        switch (sum) {
            case 6:
                System.out.println(10000);
                break;
            case 7:
                System.out.println(36);
                break;
            case 8:
                System.out.println(720);
                break;
            case 9:
                System.out.println(360);
                break;
            case 10:
                System.out.println(80);
                break;
            case 11:
                System.out.println(252);
                break;
            case 12:
                System.out.println(108);
                break;
            case 13:
                System.out.println(72);
                break;
            case 14:
                System.out.println(54);
                break;
            case 15:
                System.out.println(180);
                break;
            case 16:
                System.out.println(72);
                break;
            case 17:
                System.out.println(180);
                break;
            case 18:
                System.out.println(119);
                break;
            case 19:
                System.out.println(36);
                break;
            case 20:
                System.out.println(306);
                break;
            case 21:
                System.out.println(1080);
                break;
            case 22:
                System.out.println(144);
                break;
            case 23:
                System.out.println(1800);
                break;
            case 24:
                System.out.println(3600);
                break;
        }
    }

    private static boolean check(int i) {
        for (int k = 0; k < 3; k++) {
            for (int l = 0; l < 3; l++) {
                if (biao[k][l] == i) {
                    return true;
                }
            }

        }
        return false;
    }
}
