package 课堂代码.课后作业.认识String类;

public class Mycontains {
    public static void main(String[] args) {
        String s = "bit is very good";
        String s1 = "bit";
        System.out.println(mycontains(s, s1));

    }

    private static boolean mycontains(String s, String s1) {
        return -1 != MyindexOf.myindex(s, s1);
    }
}
