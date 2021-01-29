package 寒假作业.day04;

public class p1 {
    public static void main(String[] args) {
        String s = "12 12 12 13564";

        System.out.println(howlong(s));

    }

    private static int howlong(String s) {
        s = s.trim();
        int i = s.lastIndexOf(" ");
        return s.length() - 1 - i;
    }
}
