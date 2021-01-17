import java.util.Scanner;
import java.util.Stack;

public class L2_1 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        Stack<Integer> shuzi = new Stack<>();
        Stack<String> fuhao = new Stack<>();

        int N = in.nextInt();
        for (int i = 0; i < N; i++) {
            shuzi.push(in.nextInt());
        }
        in.nextLine();
        String[] s = in.nextLine().split(" ");
        for (int i = 0; i < N - 1; i++) {
            fuhao.push(s[i]);
        }
        while (!(shuzi.empty() && fuhao.empty())) {
            if (shuzi.size() == 1) {
                System.out.println(shuzi.pop());
                return;
            }
            int n1, n2;
            n1 = shuzi.pop();
            n2 = shuzi.pop();
            String fu = fuhao.pop();
            if (fu.equals("*")) {
                shuzi.push(n2 * n1);
            } else if (fu.equals("/")) {
                if (n1 == 0) {
                    System.out.println("ERROR: " + n2 + "/0");
                    return;
                }
                shuzi.push(n2 / n1);
            } else if (fu.equals("+")) {
                shuzi.push(n2 + n1);
            } else if (fu.equals("-")) {
                shuzi.push(n2 - n1);
            }

        }
    }
}
