/**
 * Name : Irsyad Fikriansyah Ramadhan
 * NRP  : 5025211149
 * Class: IF184301 Object Oriented Programming (E)
 */
 
// File: Q14StudentTest.java
public class Q14StudentTest {
    
    public static void main(String[] args) {

        /**
         * making object student1
         * name             : Sri Purwaningsih
         * studentId        : 1000001 
         * degreeProgram    : Bachelor Informatics
         */
        Q14Student student1 = new Q14Student("Sri Purwaningsih", "1000001", "Bachelor Informatics");

        /**
         * printing object student1, should outputing
         * "[Sri Purwaningsih, ID: 1000001, Bachelor Informatics]""
         */
        System.out.println(student1.toString());
    }
}