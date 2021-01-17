package blue.PTA.不明;

public class L1_001 {
    public static void main(String[] args) {
        int[] who = new int[4];
        int i, j;
        for (i = 0; i < 4; i++) {
            for (j = 0; j < 4; j++) {
                if (i == j) {
                    who[j] = 1;
                } else {
                    who[j] = 0;
                }
            }

            if (who[1] + who[3] == 1 && who[1] + who[2] == 1 && who[0] + who[1] == 1) {
                char a = (char) (who[i] + 'A');
                System.out.println("犯人是" + a);
            }
        }

    }


}
