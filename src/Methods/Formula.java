package Methods;

import GUI.GuiLaba1A;

import static java.lang.Math.*;

public class Formula {

private  double z1,z2;

        public void solve(int m, int n) {
            for (int i=0; i < 5; i++) {
                z1 = ((m - 1) * sqrt(m) - (n - 1) * sqrt(n)) / (sqrt(pow(m, 3) * n) + n * m + pow(m, 2) - m);
                z2 = (sqrt(m) - sqrt(n)) / m;

                System.out.println("\n" + "Результаты расчета по первой формуле: " + z1 + "\n"
                        + "Результаты расчета по второй формуле: " + z2 + "\n");

                m++;
                n++;

            }
        }

    public void solveGui(int m, int n) {
        for (int i=0; i < 5; i++) {
            z1 = ((m - 1) * sqrt(m) - (n - 1) * sqrt(n)) / (sqrt(pow(m, 3) * n) + n * m + pow(m, 2) - m);
            z2 = (sqrt(m) - sqrt(n)) / m;

            GuiLaba1A.textArea.append("\n" + "Результаты расчета по первой формуле: " + z1 + "\n"
                    + "Результаты расчета по второй формуле: " + z2 + "\n");
            m++;
            n++;

        }

    }

}
