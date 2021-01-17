package blackhouse.IO流.复制文件案例;

import java.io.FileInputStream;

import java.io.FileOutputStream;
import java.io.IOException;

public class copy {
    public static void main(String[] args) throws IOException {
        long st1 = System.currentTimeMillis();
        FileInputStream fis = new FileInputStream("D:\\JAVA\\IDEA项目\\src\\黑马课程\\IO流\\复制文件案例\\01.png");
        FileOutputStream fos = new FileOutputStream("D:\\JAVA\\IDEA项目\\src\\黑马课程\\IO流\\复制文件案例\\02.png");

        int len = 0;
        byte[] bytes = new byte[1024];
        while ((len = fis.read(bytes)) != -1) {
            fos.write(bytes);
        }
//        while((len = fis.read())!=-1){
//            fos.write(len);
//        }

        fos.close();
        fis.close();
        long st2 = System.currentTimeMillis();
        System.out.println(st2 - st1);
    }
}
