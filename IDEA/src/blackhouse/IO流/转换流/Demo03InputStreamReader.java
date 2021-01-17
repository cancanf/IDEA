package blackhouse.IO流.转换流;

import java.io.*;

public class Demo03InputStreamReader {
    public static void main(String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(new FileInputStream("D:\\JAVA\\IDEA项目\\src\\黑马课程\\IO流\\转换流\\1.txt"), "gbk");
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("D:\\JAVA\\IDEA项目\\src\\黑马课程\\IO流\\转换流\\2.txt"), "UTF-8");
        int len = 0;
        while ((len = isr.read()) != -1) {
            osw.write(len);
        }
        osw.close();
        isr.close();

    }
}
