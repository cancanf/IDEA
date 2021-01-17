import java.util.Scanner;

public class L1_5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] taiya = new int[4];
        for (int i = 0; i < 4; i++) {
            taiya[i] = in.nextInt();
        }
        int zuidi = in.nextInt(), fazhi = in.nextInt();
        int min = taiya[0], max = taiya[0];
        for (int i = 0; i < 4; i++) {
            if (taiya[i] < min) {
                min = taiya[i];
            }
            if (taiya[i] > max) {
                max = taiya[i];
            }
        }
        int flag = 1;
        int sum = 0;
        int jilu = 0;
        for (int i = 0; i < 4; i++) {
            if (taiya[i] < zuidi || (max - taiya[i]) > fazhi) {
                flag = 2;
                sum++;
                jilu = i + 1;
            }
            if (sum >= 2) {
                flag = 3;
            }

        }
        if (flag == 1) {
            System.out.println("Normal");
        } else if (flag == 2) {
            System.out.printf("Warning: please check #%d!", jilu);
        } else {
            System.out.println("Warning: please check all the tires!");
        }
    }
}
