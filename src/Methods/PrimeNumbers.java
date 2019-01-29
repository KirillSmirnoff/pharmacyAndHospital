package Methods;

import GUI.GuiLaba2B;
import java.util.Arrays;

public class PrimeNumbers {

    private int primeNumber;
    AddToArray arrayPrime = new AddToArray();

    public void PrimeNumbersCalculate(int x) {
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
            arrayPrime.addMember(x);
        }
    }

    public void print(){
        if(primeNumber==0)
            System.out.println("простых чисел нет");
        else
        System.out.println("простых чисел: " + primeNumber+toString());
    }


    public void printGui(){
        if(primeNumber==0)
            GuiLaba2B.textArea.append("простых чисел нет\n");
        else
            GuiLaba2B.textArea.append("простых чисел: " + primeNumber+toString()+"\n");
    }

    @Override
    public String toString() {
        return Arrays.toString(arrayPrime.listArrayToArray());
    }
}
