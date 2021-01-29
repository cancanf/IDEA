package 寒假作业.day05;

public class p2 {
    public static void main(String[] args) {
        System.out.println(isLongPressedName("vtkgn", "vttkgnn"));
    }

    public static boolean isLongPressedName(String name, String typed) {
        char[] names = name.toCharArray();
        char[] typeds = typed.toCharArray();
        int i = 0, j = 0;
        while (j < typeds.length) {
            if (i < names.length && names[i] == typeds[j]) {
                i++;
                j++;
            } else if (j > 0 && typeds[j] == typeds[j - 1]) {
                j++;
            } else {
                return false;
            }
        }
        return i == names.length;
    }
}
