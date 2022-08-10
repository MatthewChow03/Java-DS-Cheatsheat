/**
 *
 * Topics:
 *
 * Sorting without implementing the Comparable interface in each class
 *      Collections.sort() and stream().sorted() accept a second parameter for a lambda expression that defines the sorting criteria
 *      Here, the sorting is the same as the example in ComparableInterface/Member.java
 *          Return a neg, pos, or 0 number to the sorted() method
 *
 */

package LambdaSorting;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        ArrayList<Person> persons = new ArrayList<>();
        persons.add(new Person("Ada Lovelace", 1));
        persons.add(new Person("Irma Wyman", 3));
        persons.add(new Person("Grace Hopper", 2));
        persons.add(new Person("Mary Coombs", 4));

        // Print sorted order based on birth year
        persons.stream().sorted((p1, p2) -> {
            return p1.getBirthYear() - p2.getBirthYear();
        }).forEach(p -> System.out.println(p.getName() + " " + p.getBirthYear()));

        System.out.println();

        // Sorting the stream did not affect the original list
        persons.stream().forEach(p -> System.out.println(p.getName() + " " + p.getBirthYear()));

        System.out.println();

        // Same thing, use lambda expression as parameter of Collections.sort()
        // Except here, the actual list gets sorted, not a stream
        Collections.sort(persons, (p1, p2) -> p1.getBirthYear() - p2.getBirthYear());
        // Print the sorted list
        persons.stream().forEach(p -> System.out.println(p.getName() + " " + p.getBirthYear()));
    }
}
