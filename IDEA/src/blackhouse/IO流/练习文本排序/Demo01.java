package blackhouse.IO流.练习文本排序;

import java.io.*;
import java.util.HashMap;

public class Demo01 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("D:\\JAVA\\IDEA项目\\src\\黑马课程\\IO流\\练习文本排序\\1.txt"));
        BufferedWriter bw = new BufferedWriter(new FileWriter("D:\\JAVA\\IDEA项目\\src\\黑马课程\\IO流\\练习文本排序\\2.txt"));

        String line = null;
        HashMap<String, String> map = new HashMap<>();
        while ((line = br.readLine()) != null) {
            String[] arr = line.split("\\.");
            map.put(arr[0], arr[1]);
        }
        for (String key :
                map.keySet()) {
            String value = map.get(key);
            line = key + "." + value;
            bw.write(line + "\n");
        }
        bw.close();
        br.close();
    }

}
