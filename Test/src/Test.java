import java.io.IOException;
import java.util.Random;
//import javafx.c

class Test {

    public static void main(String[] args) {

        Random rdm = new Random();
        int i = rdm.nextInt(10);
        System.out.println(i);

//        Runtime runtime = Runtime.getRuntime();
//        Process exec = null;
//
//        try {
//            exec = runtime.exec("xed");
//        } catch (IOException e) {
//            System.out.println("not found command");
//        }
    }



//        int n =3;
//        int g[][]= new int[n][n];
//        for(int i = 0; i < n; i++) {
//            g[i][i] =  i + i;
//            System.out.printf("%2d",g[i][i]);
//            for(int j = 0; j < i; j++) {
//                g[j][i] = g[i][j] = i + j;
//                System.out.printf("%2d",g[j][i]);
//            }
//        }


    public static int factoril(int fact){
//            System.out.println("called factorial method: "+fact);
        if (fact <=1) {
            return 1;
        }
        int    i = factoril(fact - 1) * fact;
//            int zero = 0;
//            while (true) {
//                if (fact % 10 == 0) {
//                    zero++;
//                    fact = fact / 10;
//                } else
//                    break;
//            }
        return i;
    }

    /**
     * DIGITAL ROOT PERFECT
     */
    public static int digit_root(int n) {
        while (n > 9) {
            n = n / 10 + n % 10;
        }
        return (n);
    }

    /**
     * MY DIGITAL ROOT
     */
    public static int digitroot(int i) {
        int droot = 0;
        for (; i != 0; ) {
            if (i > 10) {
                droot = droot + (i % 10);
                i /= 10;
            } else if (i < 10) {
                droot += i;
                if (droot < 10)
                    break;
                else
                    i = droot;
                droot = 0;
            }
        }
        return droot;
    }

    /**
     * FIND THE PARITY OUTLIER
     */
    public static int findOutlier(int[] mass) {
        int even = 0;
        int indexEven = 0;
        int indexOdd = 0;
        int outlier;
        for (int i = 0; i < mass.length; i++) {
            if (mass[i] % 2 == 0) {
                even++;
                indexEven = i;
            } else
                indexOdd = i;
        }
        if (even == 1)
            outlier = mass[indexEven];
        else
            outlier = mass[indexOdd];

        return outlier;
    }

    /**SEATS IN THE THEATER
     * */
    public static  int seatsInTheater(int tCols, int tRows, int col, int row){ //For nCols = 16, nRows = 11, col = 5 and row = 3, the output should be


        return ((tRows-row)*(tCols-col+1));
    }

    /**
     * MY HUMAN READABLE TIME
     * */
    public static String makeReadable(int seconds) {
        // Do something
        int hh=0,mm=0;
        while (seconds>=60) {
            seconds -= 60;
            if (mm == 59) {
                hh++;
                mm = 0;
            } else {
                mm++;
            }
        }
        return String.format("%02d:%02d:%02d",hh,mm,seconds);
    }

    /**
     * PERFECT HUMAN READABLE TIME
     * */
    public static String make_Readable(int seconds) {
            return String.format("%02d:%02d:%02d", seconds / 3600, (seconds / 60) % 60, seconds % 60);
        }
}
