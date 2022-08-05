/**
 *
 * Topics:
 *
 * HashMaps are KV pair with no duplicates
 *
 * Auto-boxing
 *      HashMaps only contain reference-variables not primitive variables
 *          Use Integer, Double, Character instead of int, double, char
 *          Java automatically converts back and forth
 *
 *          int key = 2;
 *          HashMap<Integer, Integer> hashmap = new HashMap<>();
 *          hashmap.put(key, 10);
 *          int value = hashmap.get(key);
 *          System.out.println(value);
 *
 *          Here, int key is converted to reference when put() and converted to primitive with get()
 *
 * hash.getOrDefault(K, V)
 *      Auto-boxing (conversion) will throw an error if attempting to convert null
 *          We need to check for null first
 *              Instead of using an if statement, use the method getOrDefault(K, V)
 *
 * User input: strings
 *      When getting strings, it requires less precision to use the following
 *          string.toLowerCase()
 *          string.trim()
 *              removes white space
 *
 * In EfficientMain.java there is user input and HashMap looping
 *
 * Checking equality of objects in Book.java
 *      Override the original equals method which checks if two references point to the same address
 *
 */

package HashMaps;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        HashMap<String, String> numbers = new HashMap<>();
        numbers.put("Uno", "One");
        numbers.put("Dos", "Zwei");
        numbers.put("Uno", "Ein");      // example of duplicate key having it's value overridden

        String translation = numbers.get("Uno");
        System.out.println(translation);

        System.out.println(numbers.get("Dos"));
        System.out.println(numbers.get("Tres"));    // returns null since there is no key
        System.out.println(numbers.get("Uno"));
        System.out.println();

        // Create HashMap that uses an instance variable as a key
        HashMap<String, Book> directory = new HashMap<>();

        Book senseAndSensibility = new Book("Sense and Sensibility", 1811, "...");
        Book prideAndPrejudice = new Book("Pride and Prejudice", 1813, "....");

        directory.put(senseAndSensibility.getName(), senseAndSensibility);
        directory.put(prideAndPrejudice.getName(), prideAndPrejudice);

        Book book = directory.get("Persuasion");
        System.out.println(book);
        System.out.println();
        book = directory.get("Pride and Prejudice");
        System.out.println(book);
    }
}
