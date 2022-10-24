/**
 * Name : Irsyad Fikriansyah Ramadhan
 * NRP  : 5025211149
 * Class: IF184301 Object Oriented Programming (E)
 */
 
//File Jokes.java
public class Jokes {

    // String of the joke
    private static String joke_string;

    // Function to determine if a joke is funny or not
    // If the length of the joke is < 20, it's funny. Otherwise, it is not funny
    // using .lenght() to get the length of the string
    public static void is_funny() {
        if (joke_string.length() < 20) {
            System.out.println("It's funny");
        } else {
            System.out.println("It's not funny");
        }
    }

    // Function to get the first word of the joke, separated by space
    // using .split(regex, limit) to split the string into limit number of strings
    // which is saperated by the regex
    public static void first_word() {
        String arr[] = joke_string.split(" ", 2);
        System.out.println(arr[0]);
    }

    // To test the program
    public static void main(String[] args) {
        /**
         * testing the calss with:
         * "Knock knock who's there?", and "Your life"
         */

        joke_string = "Knock knock who's there?";
        is_funny();
        first_word();
        joke_string = "Your life";
        is_funny();
        first_word();
    }
}