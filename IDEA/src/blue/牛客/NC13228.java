package blue.牛客;

import java.util.Scanner;

public class NC13228 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n;
        long T, C;

        n = in.nextInt();
        T = in.nextLong();
        C = in.nextLong();

        pop[] pops = new pop[n];

        for (int i = 0; i < n; i++) {
            pops[i] = new pop(in.nextDouble(), in.nextDouble());
        }


    }


}


class pop {
    double t, v;

    public pop(double t, double v) {
        this.t = t;
        this.v = v;
    }

    public double getT() {
        return t;
    }

    public void setT(double t) {
        this.t = t;
    }

    public double getV() {
        return v;
    }

    public void setV(double v) {
        this.v = v;
    }


}

