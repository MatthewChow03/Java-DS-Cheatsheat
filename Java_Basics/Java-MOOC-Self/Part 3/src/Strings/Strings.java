/**
 * Topics:
 *
 * Scanner object
 * String splitting
 * String comparison
 *
 */

package Strings;

import java.util.Scanner;

public class Strings {

    public static void main(String[] args) {
        // Program to take input for two words and check if they are the same word
        Scanner scanner = new Scanner(System.in);
        System.out.print("Type two of the same words: ");
        java.lang.String input = scanner.nextLine();    // other data types are scanner.nextXYZ, XYZ = Int etc.
        java.lang.String[] words = input.split(" ");      // split input string into array of strings
        if (words.length > 2) {
            System.out.println("Input contains more than 2 words");
        } else {
            boolean sameWord = words[0].equalsIgnoreCase(words[1]);     // not case sensitive
            System.out.print("The words are equal: " + sameWord);
        }
    }

}
