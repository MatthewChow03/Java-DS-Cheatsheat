/**
 *
 * Topics:
 *
 * This is an example of using streams to parse through objects that contain other objects as properties
 * Here the Book object uses the Person class as a part of the Book's author property
 *
 */

package ObjectsAndStreams;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Book> books = new ArrayList<>();

        // Create example book objects and put into list
        books.add(new Book(new Person("Carl", 1990), "CarlCooking", 100));
        books.add(new Book(new Person("JK", 1970), "HarryPotter", 1000));
        books.add(new Book(new Person("Albert", 1960), "AlbertAssassin", 5000));

        // Print the average age of all authors in the books list
        double average = books.stream()
                .map(book -> book.getAuthor())
                .mapToInt(author -> author.getBirthYear())
                .average()
                .getAsDouble();

        System.out.println("Average of the authors' birth years: " + average);

        // Print all birthdays before 1980
        // Notice this has no return value, it's just performing a pipeline operation
        books.stream()
                .map(book -> book.getAuthor())
                .mapToInt(author -> author.getBirthYear())
                .filter(value -> value < 1980)
                // .sorted()    // sorts stream into natural order
                .forEach(name -> System.out.println(name));

    }
}
