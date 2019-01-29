package Methods;

import GUI.GuiLaba2B;
import java.util.Arrays;

public class PerfectNumbers {

    private int perfectNumber;
    AddToArray arrayPerfect = new AddToArray();

    public void perfectNumbersCalculate(int x) {
        int j = 1;
        int perfect = 0;

        for (; j < x; j++)
            if (x % j == 0) {
                perfect += j;
            }

        if (x == perfect) {
            perfectNumber++;
            arrayPerfect.addMember(x);
        }
    }

    public void print() {
        if (perfectNumber == 0)
            System.out.println("совершенных чисел нет");
        else
            System.out.println("совершенных чисел: " + perfectNumber + toString());
    }


    public void printGui() {
        if (perfectNumber == 0)
            GuiLaba2B.textArea.append("совершенных чисел нет\n");
        else
            GuiLaba2B.textArea.append("совершенных чисел: " + perfectNumber + toString()+"\n");
    }

    @Override
    public String toString() {

        return Arrays.toString(arrayPerfect.listArrayToArray());
    }
}