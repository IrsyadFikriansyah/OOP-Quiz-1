/**
 * Name : Irsyad Fikriansyah Ramadhan
 * NRP  : 5025211149
 * Class: IF184301 Object Oriented Programming (E)
 */
 
// File: Q15WeightTest.java
public class Q15WeightTest {
    /**
     * The program is test with p = 2.
     * should outputing:
     *  2.0
     *  0.90718474
     */
    public static void main(String[] args) {

        Q15Weight weight1 = new Q15Weight(2);
        System.out.println(weight1.getPounds());
        System.out.println(weight1.getKilograms());
    }
}