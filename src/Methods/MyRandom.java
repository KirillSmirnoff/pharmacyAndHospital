package Methods;

//Записывает RANDOM знчения в массив указыввется минимальный и максимальный  RANDOM значение
//два метода для X(N) и X(M,N) массивов

import java.util.Random;

public class MyRandom extends Random {
    private int maxBoundary;
    private int minBoundary;

    public MyRandom(int maxBoundary, int minBoundary) {
        this.maxBoundary = maxBoundary;
        this.minBoundary = minBoundary;
    }

    public int[][] randomToArray(int mass[][], int row, int column) {           //для X(M,N) массива

        MyRandom twoDemension = new MyRandom(maxBoundary, minBoundary);

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {

                mass[i][j] = twoDemension.nextInt(maxBoundary) + (minBoundary);
            }

        }
        return mass;
    }

    public int [] randomToArray(int mass[],int x){                  //для X(N) массива

        MyRandom oneDemension = new MyRandom(maxBoundary, minBoundary);

        for (int i = 0; i < mass.length; i++)
            mass[i] = oneDemension.nextInt(maxBoundary) + (minBoundary);

        return mass;
    }
}
