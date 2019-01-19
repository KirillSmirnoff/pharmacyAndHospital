package Methods;

//Для нахождения количества отрицательных
// чисел в строке в которой имеется 0 элемент

public class NegativeNumber {
   private int negativeNumber = 0;

    public void negativeNumberWithZero(int mass[][],int x, int y){

        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                if (mass[i][j] == 0) {
                    for (int h=0; h < y; h++) {
                        if (mass[i][h] < 0) {
                            negativeNumber++;
                        }
                        j++;
                        if (h == (y - 1)) {
                            System.out.println("\nв строке " + i + " отрицательных элементов " + negativeNumber);
                            negativeNumber = 0;

                        }

                    }

                }
            }
        }
    }
}
