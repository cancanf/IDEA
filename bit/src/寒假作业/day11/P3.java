package 寒假作业.day11;

public class P3 {
    public static void main(String[] args) {
        char[] chars = {'a', 'a', 'b', 'b', 'c', 'c', 'c', 'c', 'c', 'c', 'c', 'c', 'c'};
        System.out.println(compress(chars));
    }

    public static int compress(char[] chars) {
        int i = 0, j = 0;
        int lon = chars.length;
        int size = 0;
        for (; j <= lon; j++) {
            if (j == lon || chars[j] != chars[i]) {
                chars[size++] = chars[i];
                if (j - i > 1) {
                    for (char c : String.valueOf(j - i).toCharArray()) {
                        chars[size++] = c;
                    }
                }
                i = j;
            }
        }
        return size;
    }
}
