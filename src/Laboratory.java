import Methods.*;

import java.util.Arrays;
import java.util.Scanner;

public class Laboratory {

    public void laba1A() {

        Scanner sc = new Scanner(System.in);
        Formula f = new Formula();
        int x = 0, y = 0;

        System.out.println("\nПРОГРАММА РАСЧЕТА ПО ДВУМ ФОРМУЛАМ С ВВОДОМ ИСХОДНЫХ ДАННЫХ \n");

            for (int i=0; i < 3; i++)
// i:{
//             Scanner sc = new Scanner(System.in);
//                try {
                    if (i == 1) {
                        System.out.print("\nВведите исходные данные первой переменной: > ");
                        x = sc.nextInt();
                    } else if(i==2){
                        System.out.print("\nВведите исходные данные второй переменной: > ");
                        y = sc.nextInt();
                    }
//                }
//     catch(java.util.InputMismatchException exc){
//         System.out.println("try again");
//         i=0;
//         x=0;
//     }
//        break i;
//    }

        f.solveAllInOne(x, y);
    }

    public  void laba1B() {
        Fraction f1 = new Fraction();
        Fraction f2 = new Fraction();
        Fraction f3 = new Fraction();

        for (int i = 0; i < 6; i++) {
            Scanner sc = new Scanner(System.in);
            if (i == 0) {
                System.out.print("Введите числитель первой дроби: > ");
                f1.setNumerator(sc.nextInt());
            } else if (i == 1) {
                System.out.print("Введите знаменатель первой дроби: > ");
                f1.setDenominator(sc.nextInt());
            } else if (i == 2) {
                System.out.print("Введите числитель второй дроби: > ");
                f2.setNumerator(sc.nextInt());
            } else if (i == 3) {
                System.out.print("Введите знаменатель второй дроби: > ");
                f2.setDenominator(sc.nextInt());
            } else if (i == 4) {
                System.out.print("Введите числитель третьей дроби: > ");
                f3.setNumerator(sc.nextInt());
            } else {
                System.out.print("Введите знаменатель третьей дроби: > ");
                f3.setDenominator(sc.nextInt());
            }
        }

        System.out.println("\nПервая дробь" + f1.fractionToDecimal());
        System.out.println("Второя дробь" + f2.fractionToDecimal());
        System.out.println("Третья дробь" + f3.fractionToDecimal());

        double a = f1.fractionToDecimal();
        double b = f2.fractionToDecimal();
        double c = f3.fractionToDecimal();


        if ((a >= b) && (a >= c))
            System.out.println("\nНаибольшая дробь " + a);
        else if ((b >= a) && (b >= c))
            System.out.println("\nНаибольшая дробь " + b);
        else if ((c >= b) && (c >= a))
            System.out.println("\nНаибольшая дробь " + c);


    }

    public void laba2A(){

    }

    public void laba2B() {

        MyRandom rdm = new MyRandom(500, 0);
        CompositeNumbers composite = new CompositeNumbers();
        PerfectNumbers perfect = new PerfectNumbers();
        PrimeNumbers prime = new PrimeNumbers();

        Scanner sc = new Scanner(System.in);
        System.out.print("Введите количество элементов  массива: > ");
        int x = sc.nextInt();

        int[] aray = new int[x];

        rdm.randomToArray(aray, x);
        System.out.println("\n"+ Arrays.toString(aray) + "\n");

        for (int z : aray) {
            composite.CompositeNumbersCalculate(z);
            perfect.perfectNumbersCalculate(z);
            prime.PrimeNumbersCalculate(z);
        }
        composite.print();
        prime.print();
        perfect.print();
    }

    public void laba3A() {

        MaxEvenNumberMinOddNumber maxMin = new MaxEvenNumberMinOddNumber();
        MyRandom rdm = new MyRandom(500, 10);

        Scanner sc = new Scanner(System.in);
        System.out.print("Введите количество элементов  массива: > ");
        int x = sc.nextInt();

        int[] mass = new int[x];
        rdm.randomToArray(mass, x);

        System.out.println("\nЦелочисленный массив X(N):  " + Arrays.toString(mass) + "\n");
        maxMin.maxEvenNumberMinOddNumber(mass);
    }

    public void laba3B() {

        NegativeNumber negative = new NegativeNumber();
        SaddlePoint saddle = new SaddlePoint();
        MyRandom rdm = new MyRandom(101, -50);       // свой класс RANDOM в скобках мин и макс значение

        Scanner sc = new Scanner(System.in);
        int x = 0, y = 0;
        for (int i = 0; i < 2; i++)
            if (i == 0) {
                System.out.print("Введите количество строк в массиве: > ");
                x = sc.nextInt();
            } else {
                System.out.print("Введите количество столбцов в массиве: > ");
                y = sc.nextInt();
            }

//        int x = 3;
//        int y = 4;

        int[][] matrix = new int[x][y];      //инициализация массива

        rdm.randomToArray(matrix, x, y);      //метод записи в  масив значений с помошью RANDOM

//matrix[0][0]=5;  matrix[0][1]=1;  matrix[0][2]=5;  matrix[0][3]=6;
//matrix[1][0]=8;  matrix[1][1]=3;  matrix[1][2]=7;  matrix[1][3]=12;
//matrix[2][0]=8;  matrix[2][1]=2;  matrix[2][2]=6;  matrix[2][3]=8;

        System.out.println("\n Содержимое массива\n");
        for (int f = 0; f < x; f++) {
            for (int h = 0; h < y; h++)
                System.out.printf("%5d", matrix[f][h]);     //Вывод на экран содержимого массива  "%5d" - означает растояние межд элементами
            System.out.println();
        }

        negative.negativeNumberWithZero(matrix, x, y);        //метод находит количество отрицательных чисел в строке в которой имеется 0 элемент
        saddle.saddlePoint(matrix, x, y);
    }
}