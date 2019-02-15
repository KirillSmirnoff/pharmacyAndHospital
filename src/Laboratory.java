import Methods.*;
import java.util.Arrays;

public class Laboratory {

    Input in = new Input();

    public void solveLaboratory1A() {

        Formula f = new Formula();
        int x = 0, y = 0;

        System.out.println("\nПРОГРАММА РАСЧЕТА ПО ДВУМ ФОРМУЛАМ С ВВОДОМ ИСХОДНЫХ ДАННЫХ \n");

        for (int i = 0; i < 3; i++)
            if (i == 1) {
                x = in.input("\nВведите исходные данные первой переменной: >");
            } else if (i == 2) {
                y = in.input("\nВведите исходные данные второй переменной: > ");
            }

        f.solve(x, y);
    }

    public void solveLaboratory1B() {
        Fraction f1 = new Fraction();
        Fraction f2 = new Fraction();
        Fraction f3 = new Fraction();

        for (int i = 0; i < 6; i++) {
            if (i == 0) {
                f1.setNumerator(in.input("Введите числитель первой дроби: > "));
            } else if (i == 1) {
                f1.setDenominator(in.input("Введите знаменатель первой дроби: > "));
            } else if (i == 2) {
                f2.setNumerator(in.input("Введите числитель второй дроби: > "));
            } else if (i == 3) {
                f2.setDenominator(in.input("Введите знаменатель второй дроби: > "));
            } else if (i == 4) {
                f3.setNumerator(in.input("Введите числитель третьей дроби: > "));
            } else {
                f3.setDenominator(in.input("Введите знаменатель третьей дроби: > "));
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

    public void solveLaboratory2A() {
        System.out.println("TEMPORARILY NOT WORKING");
    }

    public void solveLaboratory2B() {

        MyRandom rdm = new MyRandom(500, 0);
        CompositeNumbers composite = new CompositeNumbers();
        PerfectNumbers perfect = new PerfectNumbers();
        PrimeNumbers prime = new PrimeNumbers();

        int x = in.input("Введите количество элементов  массива: > ");

        int[] aray = new int[x];

        rdm.randomToArray(aray, x);
        System.out.println("\n" + Arrays.toString(aray) + "\n");

        for (int z : aray) {
            composite.CompositeNumbersCalculate(z);
            perfect.perfectNumbersCalculate(z);
            prime.PrimeNumbersCalculate(z);
        }
        composite.print();
        prime.print();
        perfect.print();
    }

    public void solveLaboratory3A() {

        MaxEvenNumberMinOddNumber maxMin = new MaxEvenNumberMinOddNumber();
        MyRandom rdm = new MyRandom(500, 10);

        int x = in.input("Введите количество элементов  массива: > ");

        int[] mass = new int[x];
        rdm.randomToArray(mass, x);

        System.out.println("\nЦелочисленный массив X(N):  " + Arrays.toString(mass) + "\n");
        maxMin.maxEvenNumberMinOddNumber(mass);
    }

    public void solveLaboratory3B() {

        NegativeNumber negative = new NegativeNumber();
        SaddlePoint saddle = new SaddlePoint();
        MyRandom rdm = new MyRandom(101, -50);

        int x = 0, y = 0;
        for (int i = 0; i < 2; i++)
            if (i == 0) {
                x = in.input("Введите количество строк в массиве: > ");
            } else {
                y = in.input("Введите количество столбцов в массиве: >");
            }
        int[][] matrix = new int[x][y];
        rdm.randomToArray(matrix, x, y);

        System.out.println("\n Содержимое массива\n");
        for (int f = 0; f < x; f++) {
            for (int h = 0; h < y; h++)
                System.out.printf("%5d", matrix[f][h]);
            System.out.println();
        }
        negative.negativeNumberWithZero(matrix, x, y);
        saddle.saddlePoint(matrix, x, y);
    }
}