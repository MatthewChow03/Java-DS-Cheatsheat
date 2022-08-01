package main.java;

import java.util.*;

/**
 * Algorithm:
 *
 * Split the array in half again and again until the sub arrays are of size 1
 * Now, the sub arrays are technically sorted
 * Merge the adjacent sub arrays together (adjacent if you think of the halving as making a tree)
 *      While merging, sort the values of the two adjacent sub arrays
 *      This means that all the following sub arrays after size 1 will still be sorted
 *      Repeat with the next two sub arrays of larger size
 *
 *
 * Example:
 *
 * 54832716             // halve each sub array
 * 5483 2716
 * 54 83 27 16
 * 5 4 8 3 2 7 1 6      // fully sorted sub arrays of size 1
 *
 * 45 38 27 16          // merge back adjacent sub arrays and sort in the process
 * 3458  1267
 * 12345678
 *
 */

public class MergeSort {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] numbers = new int[10];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = rand.nextInt(100);
        }

        System.out.println("Before:");
        printArray(numbers);

        mergeSort(numbers);

        System.out.println("\nAfter:");
        printArray(numbers);
    }

    private static void printArray(int[] numbers) {
        for (int number : numbers) {
            System.out.println(number);
        }
    }

    private static void mergeSort(int[] array) {
        // For recursive calls, once the sub array size is 1, return to stop further calls
        int highIndex = array.length;
        int midIndex = highIndex / 2;
        if (highIndex == 1) {
            return;
        }

        // Split the array into two sub arrays
        int[] leftArray = new int[midIndex];
        int[] rightArray = new int[highIndex - midIndex];    // if the array is odd, split into lengths 4 and 5 left and right sub array
        for (int i = 0; i < midIndex; i++) {
            leftArray[i] = array[i];
        }
        for (int i = midIndex; i < highIndex; i++) {
            rightArray[i - midIndex] = array[i];
        }

        // Recursive call to merge sort each sub array\
        mergeSort(leftArray);
        mergeSort(rightArray);

        // Now the leftArray and rightArray are sorted and the recursive call below has returned
        // Merge the two adjacent sub arrays
        int i = 0, j = 0, k = 0;
        while(i < leftArray.length && j < rightArray.length) {
            // Store the smaller value then re compare
            if (leftArray[i] <= rightArray[j]) {
                array[k++] = leftArray[i++];    // only increment the sub array index if the value is smaller
                                                // if the value is not smaller, it goes back to re compare
            } else {
                array[k++] = rightArray[j++];
            }
        }

        // One of the sub arrays has been looped over before the other
        // Get the remaining elements from the sub array with leftover elements
        // One of the following while loops will be skipped
        while(i < leftArray.length) {
            array[k++] = leftArray[i++];
        }
        while(j < rightArray.length) {
            array[k++] = rightArray[j++];
        }
    }
}
