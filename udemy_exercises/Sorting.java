package udemy_exercises;

import java.util.*;

class Sorting {
    public static void main(String[] args) {
        int[] userIntegers = new int[5];
        getNums(5, userIntegers);
        printNums(userIntegers);
        sortIntegers(userIntegers);
        reverse(userIntegers);
        System.out.println("This is the Sorting Class");
    }

    public static int[] getNums(int numbers, int[] userIntegers) {
        System.out.println("Enter " + numbers + " integers:\r");
        for (int i = 0; i < userIntegers.length; i++) {
            Scanner sc = new Scanner(System.in);
            userIntegers[i] = sc.nextInt();
        }
        return userIntegers;
    }

    public static void sortIntegers(int[] userIntegers) {
        Arrays.sort(userIntegers);
        System.out.println(Arrays.toString(userIntegers));
    }

    public static void printNums(int[] userIntegers) {
        System.out.println("userIntegers Array = " + Arrays.toString(userIntegers));
    }

    public static void reverse(int[] userIntegers) {
        for (int i = 0; i < userIntegers.length / 2; i++) {
            int temp = userIntegers[i];
            userIntegers[i] = userIntegers[(userIntegers.length - 1) - i];
            userIntegers[(userIntegers.length - 1) - i] = temp;
        }
        System.out.println(Arrays.toString(userIntegers));
    }

}