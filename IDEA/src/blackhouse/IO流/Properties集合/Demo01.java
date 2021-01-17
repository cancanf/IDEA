package blackhouse.IO流.Properties集合;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

public class Demo01 {
    public static void main(String[] args) throws IOException {
        //  show01();
        //  show02();
        show03();
    }

    private static void show03() throws IOException {
        Properties prop = new Properties();
        prop.load(new FileReader("D:\\JAVA\\IDEA项目\\src\\黑马课程\\IO流\\Properties集合\\1.txt"));
        Set<String> set = prop.stringPropertyNames();
        for (String key :
                set) {
            String value = prop.getProperty(key);
            System.out.println(key + value);

        }

    }

    private static void show02() throws IOException {
        Properties prop = new Properties();
        prop.setProperty("万一苇", "18");
        prop.setProperty("王嘉晨", "19");
        prop.setProperty("王智玮", "20");
        FileWriter fw = new FileWriter
                ("D:\\JAVA\\IDEA项目\\src\\黑马课程\\IO流\\Properties集合\\1.txt");
        prop.store(fw, "save,date");

        fw.close();


    }

    private static void show01() {
        Properties prop = new Properties();
        prop.setProperty("万一苇", "18");
        prop.setProperty("王嘉晨", "19");
        prop.setProperty("王智玮", "20");
        Set<String> set = prop.stringPropertyNames();
        for (String key : set) {
            String value = prop.getProperty(key);
            System.out.println(key + value);
        }
    }
}
