/**
 *
 * Topics:
 *
 * Exceptions are thrown and dealt with using try and catch
 *
 *
 */

package Exceptions;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = readNumber(sc);
    }

    public static int readNumber(Scanner reader) {
        while (true) {
            System.out.print("Give a number: ");

            try {
                int readNumber = Integer.parseInt(reader.nextLine());
                // The line below will only run if there is no exception
                // If there is an exception before, it will jump to the catch statement
                System.out.println("Good job!");
                return readNumber;
            } catch (Exception e) {
                System.out.println("User input was not a number.");
            }
        }
    }
}
