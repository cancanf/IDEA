package blackhouse.IO流.输入流;

import java.io.FileReader;
import java.io.IOException;

public class Demo02Reader {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("src\\黑马课程\\IO流\\输入流\\1.txt");
        int len = 0;
//        while((len = fr.read())!=-1){
//            System.out.print((char)len);
//        }
        char[] cs = new char[1024];
        while ((len = fr.read(cs)) != -1) {
            System.out.println(new String(cs));
        }
        fr.close();


    }
}
