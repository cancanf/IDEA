package 寒假作业.day01.作业;

public class p1 {
    public static void main(String[] args) {
        System.out.println(tolowcase("AaBbasdfAFGDsfZ"));
        //aabbasdfafgdsf
        System.out.println(tolowcase2("AaBbasdfAFGDsfZ"));
        //aabbasdfafgdsfz
    }

    private static String tolowcase2(String str) {
        char[] chars = str.toCharArray();
        String s = "";
        for (int i = 0; i < chars.length; i++) {
            if(chars[i]>='A' && chars[i]<='Z'){
                chars[i]+='a'-'A';
            }
            s = s + chars[i];
        }
        return s;
    }

    private static String tolowcase(String str) {
        return str.toLowerCase();
    }
}