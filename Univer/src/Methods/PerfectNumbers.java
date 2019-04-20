package Methods;

import java.util.ArrayList;
import java.util.List;

public class PerfectNumbers {

    private int perfectNumber;
    List<Integer> list = new ArrayList<>();

    public void perfectNumbersCalculate(int[] mass) {

        for (int x : mass) {
            int j = 1;
            int perfect = 0;

            for (; j < x; j++)
                if (x % j == 0) {
                    perfect += j;
                }

            if (x == perfect) {
                perfectNumber++;
                list.add(x);
            }
        }
    }

    @Override
    public String toString() {
        if (perfectNumber == 0)
            return "Совершенных чисел в массиве нет\n";
        else
            return "Совершенных чисел в массиве: " + perfectNumber + " Это числа: " + list.toString()+"\n";
    }
}