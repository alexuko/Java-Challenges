package course.javaprogramming;

import java.util.Random;
import java.util.Scanner;

public class Main {
    static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
    	// write your code here
        System.out.println("Type the size of array");
        int sizeTyped = sc.nextInt();
        int[] myArray = readIntegers(sizeTyped);
        findMin(myArray);
    }

    private static int findMin(int[] myArray) {
        int min = myArray[0];
        for (int i = 0; i < myArray.length ; i++) {

            if(myArray[i] < min){
                min = myArray[i];
            }
        }
        System.out.println("minimum value is--> " + min);
        return min;
    }

    public static int[] readIntegers(int count){
        System.out.println("type " + count + " integers");
        int[] array = new int[count];
        for (int i = 0; i < array.length; i++) {
            System.out.println("Enter a number:");
            array[i] = sc.nextInt();
        }
        System.out.println("thanks");
        return array;
    }
}
