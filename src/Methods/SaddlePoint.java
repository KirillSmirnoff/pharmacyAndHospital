package Methods;

//Для нахождения количества седловых точек

import GUI.GuiLaba3B;

public class SaddlePoint {

private int max=Integer.MIN_VALUE;
private int min=Integer.MAX_VALUE;
private int saddlePoint;


    public void saddlePoint(int mass[][],int x,int y){

        int column = 0;
        int row = 0;

        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                if (mass[i][j] < min) {
                    min = mass[i][j];
                    column = j;
                }
            }
            for (int r = 0; r < x; r++) {
                if (mass[r][column] > max) {
                    max = mass[r][column];
                    row = r;
                }
            }
            if (max == min) {
                saddlePoint = min;
                min = Integer.MAX_VALUE;
                max = Integer.MIN_VALUE;

                System.out.println("\nВ данном массиве число "+saddlePoint+" является седловой точкой матрицы\n"
                        + "\nНаходяшейся на пересечении  " + column + " столбца и " + row+" строки");
            }
//            else {
                min = Integer.MAX_VALUE;
                max = Integer.MIN_VALUE;
//            }
        }
    }

    public void saddlePointGui(int mass[][],int x,int y){

        int column = 0;
        int row = 0;

        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                if (mass[i][j] < min) {
                    min = mass[i][j];
                    column = j;
                }
            }
            for (int r = 0; r < x; r++) {
                if (mass[r][column] > max) {
                    max = mass[r][column];
                    row = r;
                }
            }
            if (max == min) {
                saddlePoint = min;
                min = Integer.MAX_VALUE;
                max = Integer.MIN_VALUE;

                GuiLaba3B.textArea.append("\nВ данном массиве число "+saddlePoint+" является седловой точкой матрицы\n"
                        + "\nНаходяшейся на пересечении  " + column + " столбца и " + row+" строки");
            }
//            else {
            min = Integer.MAX_VALUE;
            max = Integer.MIN_VALUE;
//            }
        }
    }

}
