import java.util.Scanner;

public class L1_4 {
    public static void main(String[] args) {
        double aa = 1.1;
        System.out.println(Integer.valueOf("21"));
        System.out.println(Integer.parseInt("41"));
        if(aa*aa - 1.21 < 0.0000001&&
            aa*aa -1.21 > - 0.0000001){
            System.out.println("xiangtong");
        }
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        in.nextLine();
        double sum=0.0,a;
        String[] s = in.nextLine().split(" ");
        for (int i = 0; i < s.length; i++) {
            if(Double.parseDouble(s[i])==2) {

            }
            sum += 1.0/(Double.parseDouble(s[i]));
        }
        sum /= 1.0*N;
        sum = 1.0/sum;
        System.out.printf("%.2f",sum);
    }
}