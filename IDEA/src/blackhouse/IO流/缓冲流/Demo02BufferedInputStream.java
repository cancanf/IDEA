package blackhouse.IO流.缓冲流;


import java.io.*;

public class Demo02BufferedInputStream {
    public static void main(String[] args) throws IOException {
        long s = System.currentTimeMillis();
        //1.创建FileInputStream对象,构造方法中绑定要读取的数据源
        FileInputStream fis = new FileInputStream
                ("D:\\JAVA\\IDEA项目\\src\\黑马课程" +
                        "\\IO流\\缓冲流\\01.png");
        FileOutputStream fos = new FileOutputStream
                ("D:\\JAVA\\IDEA项目\\src\\黑马课程" +
                        "\\IO流\\缓冲流\\copy.png");
        //2.创建BufferedInputStream对象,构造方法中传递FileInputStream对象,提高FileInputStream对象的读取效率
        BufferedInputStream bis = new BufferedInputStream(fis);
        BufferedOutputStream bos = new BufferedOutputStream(fos);
        // 3.使用BufferedInputStream对象中的方法read,读取文件
        int len = 0;
//
//        while((len = fis.read())!=-1){
//            fos.write(len);
//        }
//        while((len = bis.read())!=-1){
//            bos.write(len);
//        }

//        byte[] bytes = new byte[1024];
//        while ((len = fis.read(bytes))!=-1){
//            fos.write(bytes);
//        }
//
//        byte[] bytes = new byte[1024];
//        while ((len = bis.read(bytes))!=-1){
//            bos.write(bytes);
//        }

        long sd = System.currentTimeMillis();
        System.out.println(sd - s);
    }

}
