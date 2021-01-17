import java.util.Scanner;

public class L1_3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double bizhi = in.nextDouble();
        int shuxing = in.nextInt();
        double jilizhi = in.nextDouble();
        double jieguo;
        if (shuxing == 0) {
            jieguo = bizhi * 2.455;
        } else {
            jieguo = bizhi * 1.26;
        }
        if (jieguo > jilizhi) {
            System.out.println(String.format("%.2f", jieguo) + " T_T");
        } else {
            System.out.println(String.format("%.2f", jieguo) + " ^_^");
        }
    }
}
