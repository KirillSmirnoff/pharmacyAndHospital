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

    public void randomToArray(int mass[][], int row, int column) {           //для X(M,N) массива

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {

                mass[i][j] = nextInt(maxBoundary) + (minBoundary);
            }

        }
    }

    public void randomToArray(int[]mass,int x){                  //для X(N) массива
        if (x!=0) {
            mass[x - 1] = nextInt(maxBoundary) + (minBoundary);
            randomToArray(mass,x-1);
        }
    }
}