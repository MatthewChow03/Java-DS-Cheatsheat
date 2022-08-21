/**
 *
 * Topics:
 *
 * Using the Comparator class
 *      Collections.sort() accepts a second parameter where we can pass a Comparator object
 *          Use comparing() for first criteria and thenComparing() for everything after
 *
 */

package CompareMultipleCriteria;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Film> films = new ArrayList<>();
        films.add(new Film("A", 2000));
        films.add(new Film("B", 1999));
        films.add(new Film("C", 2001));
        films.add(new Film("D", 2000));

        for (Film e : films) {
            System.out.println(e);
        }

        Comparator<Film> comparator = Comparator
                .comparing(Film::getReleaseYear)
                .thenComparing(Film::getName);

        Collections.sort(films, comparator);

        // Or shorter version
        //films.sort(Comparator.comparing(Film::getReleaseYear).thenComparing(Film::getName));

        for (Film e: films) {
            System.out.println(e);
        }
    }
}
