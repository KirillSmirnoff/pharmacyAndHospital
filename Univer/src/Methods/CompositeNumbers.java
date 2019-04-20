package Methods;

import java.util.ArrayList;
import java.util.List;

public class CompositeNumbers {

    private int compositeNumber;
    List<Integer> list = new ArrayList<>();

    public void CompositeNumbersCalculate(int[] mass) {

        for (int x : mass) {
            int i = 2;
            int y = 0;
            while (i * i <= x && y != 1) {
                if (x % i == 0) {
                    y = 1 | i++;
                } else {
                    i++;
                }
            }
            if (y > 1) {
                compositeNumber++;
                list.add(x);
            }
        }
    }

    @Override
    public String toString() {
        if (compositeNumber == 0)
            return "Составных чисел в массиве нет\n";
        else
            return "Составных чисел в массиве: " + compositeNumber + " Это числа: " + list.toString()+"\n";
    }
}
