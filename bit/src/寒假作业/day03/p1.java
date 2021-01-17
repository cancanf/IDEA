package 寒假作业.day03;

import java.util.ArrayList;


public class p1 {
    public static void main(String[] args) {
        System.out.println(canConstruct("", "a"));
    }

    public static boolean canConstruct(String ransomNote, String magazine) {
        if(ransomNote.equals("")){
            return true;
        }
        ArrayList<String> list = new ArrayList<>();

        String[] mag = magazine.split("");
        for (int i = 0; i < mag.length; i++) {
            list.add(mag[i]);
        }

        String[] ran = ransomNote.split("");
        for (int i = 0; i < ran.length; i++) {
            if (list.contains(ran[i])) {
               list.remove(ran[i]);
            }else{
                return false;
            }
        }
        return true;
    }
}
