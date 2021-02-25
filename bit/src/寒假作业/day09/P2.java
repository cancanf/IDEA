package 寒假作业.day09;

public class P2 {
    public static void main(String[] args) {
        System.out.println(addBinary("11", "1"));

    }

    public static String addBinary(String a, String b) {
        StringBuilder s = new StringBuilder();
        int jin = 0;
        for (int i = a.length() - 1, j = b.length() - 1; i >= 0 || j >= 0; i--, j--) {
            int sum = jin;
            sum += i >= 0 ? a.charAt(i) - '0' : 0;
            sum += j >= 0 ? b.charAt(i) - '0' : 0;
            s.append(sum % 2);
            jin = sum / 2;
        }
        s.append(jin == 1 ? jin : "");
        return s.reverse().toString();
    }
}
