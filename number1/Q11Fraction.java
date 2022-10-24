/**
 * Name : Irsyad Fikriansyah Ramadhan
 * NRP  : 5025211149
 * Class: IF184301 Object Oriented Programming (E)
 */

// File: Q11Fraction.java
public class Q11Fraction {
    /**
      * variables stored in this calss is numerator and denumerator, both int type
      * the sum function is returning the float value of frac1 + frac2,
      * not the string type (ex: 1/2 + 1/3 = 0.8333333, not 5/6)
      * the product function is returning the float value of frac1 * frac2,
      * not the string type (ex: 1/2 * 1/3 = 0.16666667, not 1/6)
      */

    // properties/fields
    private int numerator;
    private int denumerator;

    // constructor
    Q11Fraction(int numerator, int denumerator){
        this.numerator = numerator;
        this.denumerator = denumerator;
        if (denumerator == 0){
            System.out.println("WARING! (0 DENUMERATOR)");
        }
    }

    // methods/functions
    public int getNumerator(Q11Fraction x){
        return x.numerator;
    }

    public int getDenumerator(Q11Fraction x){
        return x.numerator;
    }

    public static float sum(Q11Fraction x, Q11Fraction y){
        return (float)x.numerator / (float)x.denumerator + (float)y.numerator / (float)y.denumerator;
        // return (float)(x.denumerator * y.numerator + x.numerator * y.denumerator) / (float)(x.denumerator * y.denumerator);
    }

    public static float product(Q11Fraction x, Q11Fraction y){
        return (float)x.numerator / (float)x.denumerator * (float)y.numerator / (float)y.denumerator;
        // return (float)(x.numerator * y.numerator) / (float)(x.denumerator * y.denumerator);    
    }

    public static void main(String[] args) {
        float result;

        // making 1/2 & 1/3
        Q11Fraction fraction1 = new Q11Fraction(1, 2);
        Q11Fraction fraction2 = new Q11Fraction(1, 3);
        // testing 1/2 + 1/3
        result = sum(fraction1, fraction2);
        System.out.println(result);

        // making 1/3 & 3/4
        fraction1 = new Q11Fraction(1, 3);
        fraction2 = new Q11Fraction(3, 4);
        // testing 1/3 + 3/4
        result = sum(fraction1, fraction2);
        System.out.println(result);

        // making 1/4 & 2/3
        fraction1 = new Q11Fraction(1, 4);
        fraction2 = new Q11Fraction(2, 3);
        // testing 1/4 * 2/3
        result = product(fraction1, fraction2);
        System.out.println(result);
    }
}