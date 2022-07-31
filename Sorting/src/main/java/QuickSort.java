package main.java;
import java.util.*;

public class QuickSort {

    public static void swap(int[] arr, int lp, int rp) {
        int temp = arr[lp];
        arr[lp] = arr[rp];
        arr[rp] = temp;
    }
    public static void quickSort(int[] arr, int lowIndex, int highIndex) {

        // Recursive calls done because sub array is of length 1
        if (lowIndex >= highIndex) {
            return;
        }

        int pivot = arr[highIndex];
        int lp = lowIndex; // left pointer: first number greater than pivot
        int rp = highIndex; // right pointer: first number less than pivot

        // Make all number to left of pivot less than pivot and all number to right of pivot are greater than pivot
        while (lp < rp) {

            // Find lp and rp
            while (arr[lp] <= pivot && lp < rp) {
                lp++;
            }
            while (arr[rp] >= pivot && rp > lp) {
                rp--;
            }

            // Swap lp and rp
            swap(arr, lp, rp);
        }
        // Place pivot where lp and rp meet
        swap(arr, highIndex, lp);

        // Recursively call quickSort() on left  of pivot sub array and right of pivot sub array
        quickSort(arr, lowIndex, lp - 1);
        quickSort(arr, lp + 1, highIndex);
    }

    public static void main(String[] args) {

        // Generate array of random numbers
        Random rand = new Random();
        int[] nums = new int[10];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = rand.nextInt(100);
        }

        System.out.print("Before: ");
        for(int num: nums) {
            System.out.print(num + " ");
        }

        quickSort(nums, 0, nums.length - 1);

        System.out.print("\nAfter: ");
        for(int num: nums) {
            System.out.print(num + " ");
        }
    }
}