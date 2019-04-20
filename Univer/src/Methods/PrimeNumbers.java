package Methods;

import java.util.ArrayList;
import java.util.List;

public class PrimeNumbers {

    private int primeNumber;
    List<Integer> list = new ArrayList<>();

    public void PrimeNumbersCalculate(int[] mass) {
        for (int x : mass) {

            int y = 0;
            int i = 2;

            while (i * i <= x && y != 1) {
                if (x % i == 0) {
                    y = 1 | i++;
                } else {
                    i++;
                }
            }

            if (y < 1) {
                primeNumber++;
                list.add(x);
            }
        }
    }

    @Override
    public String toString() {
        if (primeNumber == 0)
            return "Простых чисел в массиве нет\n";
        else
            return "Простых чисел в массиве: " + primeNumber + " Это числа: " + list.toString()+"\n";
    }
}
