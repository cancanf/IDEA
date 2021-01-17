package blackhouse.IO流.输入流;

import java.io.FileInputStream;
import java.io.IOException;

public class Demo01InputStream {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("D:\\JAVA\\IDEA项目\\src\\黑马课程\\IO流\\输入流\\1.txt");
        int len = 0;
        while ((len = fis.read()) != -1) {
            System.out.println(len);
        }
//        int len = fis.read();System.out.println(len);
//        len = fis.read();  System.out.println(len);
//        len = fis.read();  System.out.println(len);
//        len = fis.read();  System.out.println(len);
        //到结尾-1
        fis.close();
    }
}
