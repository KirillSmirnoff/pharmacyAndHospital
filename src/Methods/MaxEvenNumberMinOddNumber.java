package Methods;

// Для нахождения в массиве X(N) номера и значение максимального четного
// и минимального нечетного элементов мвссива

public class MaxEvenNumberMinOddNumber {

   private int max = Integer.MIN_VALUE;
    private int min = Integer.MAX_VALUE;
    private int maxIndex =0;
    private int minIndex =0;

    public void maxEvenNumberMinOddNumber(int mass[]){
        for (int i = 0; i < mass.length; i++){
            if (mass[i] % 2 == 0) {
                if (mass[i] > max) {
                    max = mass[i];
                    maxIndex =i;
                }
            }
            else if (mass[i] < min) {
                min = mass[i];
                minIndex = i;
            }
        }
        System.out.println("Максимальное четное значение:  "+max + "  номер в массиве "+ maxIndex +"\n\n"
                + "Минимальное нечетное значение:  "+min+ "  номер в массиве "+ minIndex);
    }
}
