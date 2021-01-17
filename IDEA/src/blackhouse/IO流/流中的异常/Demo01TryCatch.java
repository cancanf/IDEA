package blackhouse.IO流.流中的异常;

import java.io.FileWriter;
import java.io.IOException;

public class Demo01TryCatch {
    public static void main(String[] args) {
        //变量在定义的时候可以没有值,但是使用的时候必须有值.
        FileWriter fw = null;
        try {
            fw = new FileWriter("1:\\JAVA\\IDEA项目\\src\\黑马课程\\IO流\\流中的异常\\1.txt");
            for (int i = 0; i < 10; i++) {
                fw.write("123456" + i + "\n");
            }
        } catch (IOException e) {
            System.out.println(e);
        } finally {
            if (fw != null) {
                try {
                    //方法声明抛出的IOException异常对象,要么throws,要么try catch

                    fw.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

}

