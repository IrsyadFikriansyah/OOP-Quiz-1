/**
 * Name : Irsyad Fikriansyah Ramadhan
 * NRP  : 5025211149
 * Class: IF184301 Object Oriented Programming (E)
 */
 
// File: Q16Fraction.java
public class Q16Fraction {
    /**
     * variables stored in this calss is numerator and denumerator, both int type
     * the getSum function is returning the fraction result of frac1 + frac2,
     * not the value type (ex: 1/2 + 1/3 = 5/6 , not 0.8333333)
     * the getSum function is returning the fraction result of frac1 * frac2,
     * not the value type (ex: 1/2 * 1/3 = 1/6, not 0.16666667)
     * the toString() funtion is to returning fraction model of the Q16Fraction object
     * (ex: num = 1, dnum = 2, will outputing "1/2")
     * 
     * what if the fraction is not the simplest form?
     * thats why we need to find the greatest common divisor from num and dnum
     * then divide both with the gch that just have been obtained
     * (ex: num = 2, dnum = 4, instead of outputing "2/4", it will outputing "1/2")
     */

    // properties/fields
    private int numerator;
    private int denumerator;

    // constructor
    public Q16Fraction(int numerator, int denumerator) {
        this.numerator = numerator;
        this.denumerator = denumerator;
    }

    // getters and setters

    public int getNumerator(Q16Fraction x) {
        return x.numerator;
    }

    public int getDenumerator(Q16Fraction x) {
        return x.numerator;
    }

    // methods/functions

    // turning Q16Fraction vaiable into string
    public String toString() {
        String str = this.numerator + "/" + this.denumerator;
        return str;
    }

    // getting sum from this Q16Fraction and passed Q16Fraction
    public String getSum(Q16Fraction x) {
        int numerator = x.denumerator * this.numerator + x.numerator * this.denumerator;
        int denumerator = x.denumerator * this.denumerator;
        int divisor = GCD(numerator, denumerator);
        String str = numerator / divisor + "/" + denumerator / divisor;
        return str;
    }

    // getting product from this Q16Fraction and passed Q16Fraction
    public String getProduct(Q16Fraction x) {
        int numerator = this.numerator * x.numerator;
        int denumerator = this.denumerator * x.denumerator;
        int divisor = GCD(numerator, denumerator);
        String str = numerator / divisor + "/" + denumerator / divisor;
        return str;
    }

    // getting greatest common divisor from 2 int
    private static int GCD(int num1, int num2) {
        // Handles the case when one of the number is 0 (num1)
        if (num1 == 0)
            return num2;

        // Handles the case when one of the number is 0 (num2)
        if (num2 == 0)
            return num1;

        // base case
        if (num1 == num2)
            return num1;

        // num1 is greater
        if (num1 > num2)
            return GCD(num1 - num2, num2);

        return GCD(num1, num2 - num1);
    }
}