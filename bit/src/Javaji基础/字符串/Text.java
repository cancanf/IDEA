package Javaji基础.字符串;

public class Text {
    public static void main(String[] args) {
        System.out.println(fistUpper("yuisama"));
        System.out.println(fistUpper(""));
        System.out.println(fistUpper("a"));
    }

    public static String fistUpper(String str) {
        if ("".equals(str) || str == null) {
            return str;
        }
        if (str.length() > 1) {
            return str.substring(0, 1).toUpperCase() + str.substring(1);
        }
        return str.toUpperCase();
    }
    //    public static void main(String[] args) {
//
//        String s1 = new String("abc");
//        String s2 = new String("abc").intern();
//        String s3 = "abc";
//        String s4 = "abc";


//        String str = "helloworld" ;
//        System.out.println(str.indexOf("l")); // 2
//        System.out.println(str.indexOf("l",5)); // 8
//        System.out.println(str.lastIndexOf("l")); // 8
//        String str1 = "**@@helloworld!!" ;
//        System.out.println(str1.startsWith("**")); // true
//        System.out.println(str1.startsWith("@@",2)); // ture
//        System.out.println(str1.endsWith("!!")); // true
//        String s = "192a168z1a1";
//        String[] split = s.split("a|z");
//        System.out.println(Arrays.toString(split));
/*
        if (s1.equals(s2)) {
            System.out.println("可以使用 equals  来比较");
        } else {
            System.out.println("不可以使用 equals  来比较");
        }
        if (s1 == s2) {
            System.out.println("可以使用== 来比较");
        } else {
            System.out.println("不可以使用== 来比较");
        }

        System.out.println("============================");

        if (s3.equals(s4)) {
            System.out.println("可以使用 equals  来比较");
        } else {
            System.out.println("不可以使用 equals  来比较");
        }
        if (s3 == s4) {
            System.out.println("可以使用== 来比较");
        } else {
            System.out.println("不可以使用== 来比较");
        }

        System.out.println("============================");

        if (s2.equals(s3)) {
            System.out.println("可以使用 equals  来比较");
        } else {
            System.out.println("不可以使用 equals  来比较");
        }
        if (s2 == s3) {
            System.out.println("可以使用== 来比较");
        } else {
            System.out.println("不可以使用== 来比较");
        }
*/

}
