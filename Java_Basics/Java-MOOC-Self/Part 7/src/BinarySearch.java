/**
 *
 * Topics:
 *
 * Programming Paradigms
 *      Way of structuring a program's functionality
 *      E.g., OOP, procedural programming, functional programming
 *
 *      OOP
 *          logical entities of function and data
 *              abstraction: hiding underlying implementations and showing functional parts (i.e., using a method without ever looking at implementation)
 *
 *              encapsulation: making functionality accessible from within a class rather than from outside (i.e., get and set methods)
 *
 *              inheritance: code re-usability by making subclasses from superclasses (i.e., extending a class)
 *
 *              polymorphism: methods can do different things based on which object they are referring to
 *                            (i.e., array of different objects all from the same class, dog + cat + lion
 *                                   when you use element.talk() each object uses their respective method override)
 *
 *      Procedural
 *          sequential series of tasks without splitting into logical groups
 *
 *      Functional
 *          pass data around parameters to functions
 *
 * Native Sorting
 *      Arrays.sort(myArray) is O(nlogn)
 *          Implemented with two algorithms
 *              If parameter is primitive data types: quicksort
 *              If parameter is objects: Timesorts
 *                  Timesort is a stable (two equal items maintain same order after sorting)
 *      collection.sort(myCollection) turns the collection into an array and then calls Arrays.sort()
 *
 * Binary Search (for sorted data)
 *      Go to middle index (round down if even i.e., [0:3] middle is [1])
 *      Move to left or right half based on whether current is greater or less than desired value
 *      Find middle index of the half and repeat
 *
 *      Time: O(log n) worst and O(1) best
 *      Space: O(log n) recursive and O(1) iterative
 *
 * Ternary operators something = (condition) ? return if true : return false
 *
 * Recursion example
 *
 *
 */

// TODO: handle duplicates
// TODO: implement with a class

import java.util.*;

public class BinarySearch {
    public static void main (String[] args) {
        // Generate random valued sorted arrays
        int firstArrayLength = 20;
        int secondArrayLength = 30;
        int[] firstArray = generateSortedRandomArray(firstArrayLength, 100);
        int[] secondArray = generateSortedRandomArray(secondArrayLength, 100);

        // Display sorted arrays side by side
        int maxIndex = Math.max(firstArrayLength, secondArrayLength);
        for (int i = 0; i < maxIndex; i++) {
            if (i > (firstArrayLength - 1)) {
                System.out.println(" " + "\t|\t" + secondArray[i]);
            } else if (i > (secondArrayLength - 1)){
                System.out.println(firstArray[i] + "\t|\t" + " ");
            } else {
                System.out.println(firstArray[i] + "\t|\t" + secondArray[i]);
            }
        }

        // Get desired value from user
        Scanner scan = new Scanner(System.in);
        System.out.print("Search for an integer below 100: ");
        int searchValue = scan.nextInt();

        // Search arrays for desired value
        int firstSearchValueIndex = iterativeBinarySearch(firstArray, searchValue);
        int secondSearchValueIndex = recursiveBinarySearch(secondArray, searchValue, 0, secondArray.length - 1);

        // Convert index to a string using ternary
        String firstSearchResult = firstSearchValueIndex == -1 ? " is not in array" : " is located at index " + firstSearchValueIndex;
        String secondSearchResult = secondSearchValueIndex == -1 ? " is not in array" : " is located at index " + secondSearchValueIndex;

        // Output index and value
        System.out.println("firstArray: " + searchValue + firstSearchResult);
        System.out.println("secondArray: " + searchValue + secondSearchResult);


    }

    private static int[] generateSortedRandomArray(int size, int upperRandomNumberBound) {
        Random rand = new Random();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = rand.nextInt(upperRandomNumberBound);
        }
        Arrays.sort(array);
        return array;
    }

    private static int iterativeBinarySearch(int[] array, int searchValue) {
        int maxIndex = array.length - 1;
        int minIndex = 0;
        // while(Math.abs(maxIndex - minIndex) >= 0) {
        while(minIndex <= maxIndex) {
            int mid = (maxIndex + minIndex) / 2;
            // Check if midpoint is the search value
            if (array[mid] == searchValue) {
                return mid;
            }
            // Search value is to the right of mid
            else if (searchValue > array[mid]) {
                minIndex = mid + 1;
            }
            // Search value is to the left of mid
            else {
                maxIndex = mid - 1;
            }
        }
        // Search value not found
        return -1;
    }

    private static int recursiveBinarySearch(int[] array, int searchValue, int minIndex, int maxIndex) {
        // Failed all comparisons, the last valid comparison was if minIndex == maxIndex
        if (minIndex > maxIndex) {
            return -1;
        }

        int mid = (minIndex + maxIndex) / 2;
        if (array[mid] == searchValue) {
            return mid;
        }
        // Search value is to the right of mid
        else if (searchValue > array[mid]) {
            minIndex = mid + 1;
            return recursiveBinarySearch(array, searchValue, minIndex, maxIndex);
        }
        // Search value is to the left of mid
        else {
            maxIndex = mid - 1;
            return recursiveBinarySearch(array, searchValue, minIndex, maxIndex);
        }

    }
}
