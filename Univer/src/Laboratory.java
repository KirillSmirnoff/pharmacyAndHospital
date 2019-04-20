import Methods.*;

import java.util.Arrays;

class Laboratory {

    private Input in = new Input();

    void solveLaboratory1A() {

        Formula f = new Formula();

        System.out.println("\nПРОГРАММА РАСЧЕТА ПО ДВУМ ФОРМУЛАМ С ВВОДОМ ИСХОДНЫХ ДАННЫХ \n");

        int x = in.input("\nВведите исходные данные первой переменной: > ");
        int y = in.input("\nВведите исходные данные второй переменной: > ");

        f.solve(x, y);
    }

    void solveLaboratory1B() {

       Fraction f1 = new Fraction(in.input("Введите числитель первой дроби: > "),
                in.input("Введите знаменатель первой дроби: > "));
        Fraction f2 = new Fraction(in.input("Введите числитель второй дроби: > "),
                in.input("Введите знаменатель второй дроби: > "));
        Fraction f3 =new Fraction(in.input("Введите числитель третьей дроби: > "),
                in.input("Введите знаменатель третьей дроби: > "));

        System.out.printf("%nПервая дробь %,.2f %nВтороя дробь %,.2f %nТретья дробь %,.2f %n",
                f1.fractionToDecimal(),f2.fractionToDecimal(),f3.fractionToDecimal());

        System.out.printf("%nНаибольшая дробь %,.2f %n",Fraction.max(f1.fractionToDecimal(),f2.fractionToDecimal(),f3.fractionToDecimal()));
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

        int[] array = new int[x];

        rdm.randomToArray(array, x);
        System.out.println("\n" + Arrays.toString(array) + "\n");

        composite.CompositeNumbersCalculate(array);
        perfect.perfectNumbersCalculate(array);
        prime.PrimeNumbersCalculate(array);

        System.out.print(composite);
        System.out.print(prime);
        System.out.print(perfect);
    }

    public void solveLaboratory3A() {

        MaxEvenNumberMinOddNumber maxMin = new MaxEvenNumberMinOddNumber();
        MyRandom rdm = new MyRandom(500, 10);

        int x = in.input("Введите количество элементов  массива: > ");

        int[] mass = new int[x];
        rdm.randomToArray(mass, x);

        System.out.println("\nЦелочисленный массив X(N):  " + Arrays.toString(mass) + "\n");
        maxMin.maxEvenNumberMinOddNumber(mass);
        System.out.println(maxMin);
    }

    public void solveLaboratory3B() {

        NegativeNumber negative = new NegativeNumber();
        SaddlePoint saddle = new SaddlePoint();
        MyRandom rdm = new MyRandom(10, -5);

//        int x = 0, y = 0;
//        for (int i = 0; i < 2; i++)
//            if (i == 0) {
               int  x = in.input("Введите количество строк в массиве: > ");
//            } else {
                int y = in.input("Введите количество столбцов в массиве: >");
//            }
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