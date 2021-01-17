package blackhouse.IO流.输入流;

import java.io.FileInputStream;
import java.io.IOException;

public class Demo02InputStream {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("D:\\JAVA\\IDEA项目\\src\\黑马课程\\IO流\\输入流\\1.txt");
        int i = 0;
        byte[] bytes = new byte[1024];
        while ((i = fis.read(bytes)) != -1) {
            System.out.println(new String(bytes));
        }
        fis.close();
    }
}
