package 考试.每日一题.day12;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Test {
    public static void main(String[] args) {
        try {
            throw new Exception();
        } catch (FileNotFoundException ex) {
            System.out.println(1);
        } catch (IOException ex) {
            System.out.println(2);
        } catch (Exception ex) {
            System.out.println(3);
        }
        String hello = "hello";
        String llp = "he" + new String("llp");
        System.out.println(hello == llp);
        Byte a = 127;
        System.out.println(++a);
    }
}
