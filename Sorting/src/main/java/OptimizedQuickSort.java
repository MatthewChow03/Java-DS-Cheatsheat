package main.java;

import java.util.*;

// Algorithm:
// Pick a pivot, ideally a value that is close to the median, a random value will average O(nlogn)
    // The pivot will be used to split the array into two sides: values less than pivot and greater than pivot
    // Move the pivot to the end of the array to get it out of the way
// Sort a pair
    // Starting from the left, find the first value greater than the pivot
    // Starting from the right, find the first value less than the pivot
    // Swap the two values
    // Keep doing this, moving the left pointer and right pointer towards each other until they meet
// Once the left and right pointer are at the same index, swap the pivot for the overlapping index
// Now, to the left and right of the pivot, there are two sub arrays
// Recursively do the above to each sub array

// Example:
// 54832716     // let's make 5 the pivot by switching it with the last value
// 64832715     // first value from the left greater than pivot: 6
                // first value from the right less than pivot: 1
                // swap 6 and 1
// 14832765     // again, left = 8, right = 2, swap
                // note, left pointer is at 8, right pointer is at 2
// 14238765     // left pointer will now look for number greater than pivot
                // left pointer hits right pointer at the value 8
                // since the pointers are at the same index the ordering is over
                // swap 8 with pivot
// 12345768     // split into sub arrays at the pivot, don't include the pivot since it is in the final position
// 1234 5 768   // recursively quicksort the sub arrays (spaces here are just visual concept)
// 1234 5 678   // finished (the spaces were never there)
// 12345678

// Improvements:
// Pick the pivot randomly for better time complexity
    // This minimizes the times that O(n^2) occurs
    // O(n^2) occurs when array is nearly sorted or reverse sorted (pivot is largest or smallest item)
    // Imagine if you pick worst case, it will create a one sided recursive tree
    // Imagine the pivot is the median every time, it will create an evenly split recursive tree for O(nlogn)
// Separates partitioning into another method
// Overload quicksort method: same name, different parameters

public class OptimizedQuickSort {

    public static void main(String[] args) {
        Random rand = new Random();
        int[] numbers = new int[10];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = rand.nextInt(100);
        }

        System.out.println("Before:");
        printArray(numbers);

        quicksort(numbers);

        System.out.println("\nAfter:");
        printArray(numbers);
    }

    private static void quicksort(int[] array) {
        quicksort(array, 0, array.length - 1);
    }

    private static void quicksort(int[] array, int lowIndex, int highIndex) {

        if (lowIndex >= highIndex) {
            return;
        }

        int pivotIndex = new Random().nextInt(highIndex - lowIndex) + lowIndex;
        int pivot = array[pivotIndex];
        swap(array, pivotIndex, highIndex);

        int leftPointer = partition(array, lowIndex, highIndex, pivot);

        quicksort(array, lowIndex, leftPointer - 1);
        quicksort(array, leftPointer + 1, highIndex);

    }

    private static int partition(int[] array, int lowIndex, int highIndex, int pivot) {
        int leftPointer = lowIndex;
        int rightPointer = highIndex - 1;

        while (leftPointer < rightPointer) {

            // Walk from the left until we find a number greater than the pivot, or hit the right pointer.
            while (array[leftPointer] <= pivot && leftPointer < rightPointer) {
                leftPointer++;
            }

            // Walk from the right until we find a number less than the pivot, or hit the left pointer.
            while (array[rightPointer] >= pivot && leftPointer < rightPointer) {
                rightPointer--;
            }

            swap(array, leftPointer, rightPointer);
        }

        // Fixes an issue where the last value could potentially be out of order.
        if (array[leftPointer] > array[highIndex]) {
            swap(array, leftPointer, highIndex);
        } else {
            leftPointer = highIndex;
        }

        return leftPointer;
    }

    private static void swap(int[] array, int index1, int index2) {
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }

    private static void printArray(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
    }
}
