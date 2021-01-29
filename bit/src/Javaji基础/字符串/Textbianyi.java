package Javaji基础.字符串;

public class Textbianyi {
    public static void main(String[] args) {
        String s1 = "abc" + "def";//1
        String s2 = new String(s1);//2
        if (s1.equals(s2))//3
            System.out.println(".equals succeeded");//4
        if (s1 == s2)//5
            System.out.println("==succeeded");//6
        System.out.println("abcdeg".substring(0, 1));
    }
}
