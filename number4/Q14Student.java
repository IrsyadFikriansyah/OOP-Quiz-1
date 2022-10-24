/**
 * Name : Irsyad Fikriansyah Ramadhan
 * NRP  : 5025211149
 * Class: IF184301 Object Oriented Programming (E)
 */
 
// File: Q14Student.java
public class Q14Student {
    /**
     * properties name, studentId, and degreeProgram stored as String
     * toString() function is turning all properties into readable string
     * ex: "[Sri Purwaningsih, ID: 1000001, Bachelor Informatics]"
     */
    // properties/fields
    private String name;
    private String studentId;
    private String degreeProgram;

    // constructor
    public Q14Student(String name, String studentId, String degreeProgram) {
        this.name = name;
        this.studentId = studentId;
        this.degreeProgram = degreeProgram;
    }

    // function toString to turn object into string
    public String toString() {
        String str = "[" + this.name + ", ID: " + this.studentId + ", " + this.degreeProgram + "]";
        return str;
    }
}