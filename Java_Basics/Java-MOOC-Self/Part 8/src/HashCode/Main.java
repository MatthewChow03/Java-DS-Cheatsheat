/**
 *
 * Topics:
 *
 * Overriding hash codes and equals
 *
 *      Rule 1: objects that are equal must return the same hash code
 *      Rule 2: equal hash codes do not mean equal instances (i.e., collisions)
 *
 *      Java has hashCode methods implemented for type String and Integer, but not our user defined classes
 *
 *      We need to do this because we want equality to consider attributes instead of just reference
 *          Further, the hashCode() method will need to be updated based on our equality implementation
 *              If we don't update hashCode(), instances of objects with the same attributes will output different hash codes
 *
 *      Note, most IDEs can generate an equals() and hashCode() method that follow the rules
 *
 */

package HashCode;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        HashMap<overrideBook, String> borrowers = new HashMap<>();

        overrideBook bookObject = new overrideBook("Book Object", 2000, "...");

        // Insert objects into hash map
        borrowers.put(bookObject, "Pekka");
        borrowers.put(new overrideBook("Test Driven Development",1999, "..."), "Arto");

        System.out.println(borrowers.get(bookObject));

        // Create a different instance that has not been put in the hash map
        // Check if the new instances are in the hash map
        // By the implementation of equals(), these new instances should show up in the hash map since they generate the same hash code
        System.out.println(borrowers.get(new overrideBook("Book Object", 2000, "...")));
        System.out.println(borrowers.get(new overrideBook("Test Driven Development", 1999, "...")));

    }
}
