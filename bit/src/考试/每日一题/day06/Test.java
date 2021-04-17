package 考试.每日一题.day06;

import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;

public class Test {
    public static void main(String[] args) throws UnsupportedEncodingException {
        byte[] src = new byte[0], dst;
        dst = new String(src, "GBK").getBytes("UTF-8");
        System.out.println(test(10));

    }

    private static int test(int b) {
        try {
            b += 10;
            return b;
        } catch (RuntimeException e) {

        } finally {
            {
                b += 10;
                return b;
            }
        }

    }
}
