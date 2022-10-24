/**
 * Name : Irsyad Fikriansyah Ramadhan
 * NRP  : 5025211149
 * Class: IF184301 Object Oriented Programming (E)
 */
 
// File: Q15Weight.java
public class Q15Weight {
    /**
     * variables stored in this class is only for pound, double type.
     * the relation beetween pound and kilogram
     * that is being used is 1 pound = 0.45359237 kilograms.
     * 
     * the conversion from pound to kilogram take place in getKilograms()
     * method/function by multiplying 0.45359237 to pound.
     */

    // properties/fields
    private double p;

    // constructor
    public Q15Weight(double p) {
        this.p = p;
    }

    // methods/functions

    // getting pounds
    public double getPounds() {
        return this.p;
    }

    // converting pounds to kilograms
    public double getKilograms() {
        return this.p * 0.45359237;
    }

}