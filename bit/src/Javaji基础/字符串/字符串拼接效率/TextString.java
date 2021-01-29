package Javaji基础.字符串.字符串拼接效率;

public class TextString {
    public static void main(String[] args) {
        long begin = System.currentTimeMillis();
        StringBuilder builder = new StringBuilder("1");
        StringBuffer buffer = new StringBuffer("1");
        for (int i = 0; i < 10000000; i++) {
//        String str= "";
//        str = "afasdf"+"asdfasd";

//            String s1 = "Heart";
//            String s2 = "He";
//            String str = "";
//            str = s1+s2;

//            String s = "heart";//18
//            String s1 = "";
//             s1 = s1 + s;

//           String s1 = "headt";
//           buffer.append(s1);//366  445 373

            String s1 = "headt";
            String a = s1.concat(s1);//154 155 167

//            String s = "headt";//226
//            builder.append(s);//196
            //205
        }

        long end = System.currentTimeMillis();
        System.out.println(end - begin);

    }
}
