package Methods;

public class Fraction {

   private double fraction;
    private int numerator;
    private int denominator;

    public void setNumerator(int ch) {
        numerator = ch;
    }

    public void setDenominator(int zn) {
        denominator = zn;
    }


    public double fractionToDecimal() {
        fraction = (double) numerator/denominator;
        return fraction;
    }

    public double guiFractionToDecimal(int num, int den) {
        fraction = (double) num/den;
        return fraction;

    }

}






