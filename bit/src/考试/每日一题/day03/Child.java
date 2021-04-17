package 考试.每日一题.day03;

class Person {
    private String name = "Person";
    int age = 0;
}

public class Child extends Person {
    public String grade;

    public static void main(String[] args) {
        Person p = new Child();
        String str1 = "hello";
        String str2 = "he" + new String("llo");
        System.out.println(str1 == str2);

    }
}
