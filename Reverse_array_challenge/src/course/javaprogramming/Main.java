package course.javaprogramming;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int[] myArray = {1,2,3,4,5,6,7,8,9,10};
        reverse(myArray);
    }

    public static void reverse(int[] array){
        int[] secondArray = new int[array.length];
        int count = 0;
        for (int i = array.length - 1; i > 0  ; i--) {
            secondArray[count++] = array[i];
        }
        String stringArrayOriginal = Arrays.toString(array);
        String stringArrayReversed = Arrays.toString(secondArray);

        System.out.print("Original Array "+stringArrayOriginal + "\n");
        System.out.print("Reversed Array "+stringArrayReversed + "\n");

    }
}
