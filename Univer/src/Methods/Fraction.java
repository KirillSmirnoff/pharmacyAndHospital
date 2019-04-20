package Methods;

public class Fraction {

   private double fraction;
    private int numerator;
    private int denominator;

    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public double fractionToDecimal() {
        fraction = (double) numerator/denominator;
        return fraction;
    }

    public static double max(double a,double b,double c){
        if ((a >= b) && (a >= c))
            return a;
        else if ((b >= a) && (b >= c))
            return b;
        else if ((c >= b) && (c >= a))
            return c;
        return a;
    }
}






