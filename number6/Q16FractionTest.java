/**
 * Name : Irsyad Fikriansyah Ramadhan
 * NRP  : 5025211149
 * Class: IF184301 Object Oriented Programming (E)
 */
 
// File: Q16FractionTest.java
public class Q16FractionTest {
    public static void main(String[] args) {
        /**
         * testing the calss with:
         * 1/2 and 3/7
         */

        // making 1/2 and 3/7
        Q16Fraction f1 = new Q16Fraction(1, 2);
        Q16Fraction f2 = new Q16Fraction(3, 7);

        // testing printing f1 that contains 1 of num and 2 of denumerator
        System.out.println(f1.toString());
        // should returning "1/2"

        // testing 3/7 * 1/2
        System.out.println(f2.getProduct(f1));
        // should returning "3/14"

        // testing 3/7 + 1/2
        System.out.println(f2.getSum(f1));
        // should returning "13/14"

    }
}