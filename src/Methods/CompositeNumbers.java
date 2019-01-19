package Methods;

import Methods.AddToArray;

import java.util.Arrays;

public class CompositeNumbers {

    private int compositeNumber;
    AddToArray arrayComposite = new AddToArray();

   public void CompositeNumbersCalculate(int x) {
        int y = 0;
        int i = 2;

        while (i * i <= x && y != 1) {
            if (x % i == 0) {
                y = 1 | i++;
            } else {
                i++;
            }
        }
        if (y > 1) {
            compositeNumber++;
            arrayComposite.addMember(x);
        }
    }

    public void print(){
        if(compositeNumber==0)
            System.out.println("составных чисел нет");
        else
        System.out.println("составных чисел: " + compositeNumber+toString());
    }

    @Override
    public String toString() {
        return Arrays.toString(arrayComposite.listArrayToArray());
    }
}
