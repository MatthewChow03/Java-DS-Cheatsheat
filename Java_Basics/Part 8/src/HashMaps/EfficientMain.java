/**
 *
 * Topics:
 *
 * Case and white space insensitive string input comparison
 *
 * Loop through keys of a HashMap (not any more efficient than other data structures)
 *
 */

package HashMaps;

import java.util.*;

public class EfficientMain {
    public static void main(String[] args) {
        Book senseAndSensibility = new Book("Sense and Sensibility", 1811, "...");
        Book prideAndPrejudice = new Book("Pride and Prejudice", 1813, "....");
        Book prideInTheWorkplace = new Book("Pride in the Workplace", 2001, "....");

        Library library = new Library();
        library.addBook(senseAndSensibility);
        library.addBook(prideAndPrejudice);
        library.addBook(prideInTheWorkplace);

        // Try different capitalization of user input
        System.out.println(library.getBook("pride and prejudice"));
        System.out.println();

        System.out.println(library.getBook("PRIDE AND PREJUDICE"));
        System.out.println();

        // Non existent key
        System.out.println(library.getBook("SENSE"));

        // Loop through HashMap (go into the method)
        ArrayList<Book> prideBooks = new ArrayList<>();
        prideBooks = library.getBookByPart("pRiDe");
        System.out.println(prideBooks);

    }

}
