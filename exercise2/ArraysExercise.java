package exercise2;

import java.util.Arrays;

class ArraysExercise {
    // Take the arrays.js file, and refactor the code into Java in this file.
    public static int[] nums = new int[] { 10, 23, 3, 4, 5, 2, 1 };
    public static String[] greetings = { "hello", "howdy", "hallo", "hola", "bonjour", "ciao", "أهلا" };
    public static boolean[] binaries = { false, true, true, true, false, false, false, true, true, true, true, true,
            false, true, false, false, true, false };

    public static void main(String[] args) {
        printNums();
        printGreetings();
        printBinaries();
    }

    public static void printNums() {
        System.out.println("int[] nums = " + Arrays.toString(nums));
    };

    public static void printGreetings() {
        System.out.println("String[] greetings = " + Arrays.toString(greetings));
    };
 
    public static void printBinaries() {
        System.out.println("boolean[] binaries = " +  Arrays.toString(binaries));
    };
}
