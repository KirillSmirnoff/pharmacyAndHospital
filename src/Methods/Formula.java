package Methods;

import static java.lang.Math.*;

public class Formula {

//    private double [] mass = new double[5];
//
//    public double[] solve1(int m, int n) {
//        double z1 ;
//        for (int i = 0; i < 5; i++) {
//            z1 = ((m - 1) * sqrt(m) - (n - 1) * sqrt(n)) / (sqrt(pow(m, 3) * n) + n * m + pow(m, 2) - m);
//
//            n++; n++;
//
//            mass[i]=z1;
//        }
//        return mass;
//
//    }
//
//    public double[] solve2(int m, int n) {
//        double z2 ;
//        for (int i = 0; i < 5; i++) {
//
//            z2=(sqrt(m)-sqrt(n))/m;
//
//            m++; n++;
//
//            mass[i]=z2;
//
//        }
//        return mass;
//
//    }

        public void solveAllInOne(int m, int n) {
            double z1,z2;
            for (int i=0; i < 5; i++) {
                z1 = ((m - 1) * sqrt(m) - (n - 1) * sqrt(n)) / (sqrt(pow(m, 3) * n) + n * m + pow(m, 2) - m);
                z2 = (sqrt(m) - sqrt(n)) / m;

                System.out.println("\n" + "Результаты расчета по первой формуле: " + z1 + "\n"
                        + "Результаты расчета по второй формуле: " + z2 + "\n");

                m++;
                n++;

            }
        }
}
