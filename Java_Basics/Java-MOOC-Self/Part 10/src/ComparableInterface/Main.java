/**
 *
 * Topics:
 *
 * Comparable interface
 *      Allows for objects to use sorted() method
 *      Must override compareTo() method (see Member.java)
 *          Compare "this" object and some object
 *              if "this" object before some object: return negative (before in terms of sorting order)
 *              if "this" object after some object: return positive
 *              if "this object" same as some object: return 0
 *              This now the natural ordering
 *
 * Sorting collection vs stream
 *      In example below, sorting a stream does not affect the original list
 *
 *
 */

package ComparableInterface;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Create list of objects
        List<Member> member = new ArrayList<>();
        member.add(new Member("mikael", 111));
        member.add(new Member("matti", 333));
        member.add(new Member("ada", 222));

        // Display unsorted list
        System.out.println("Unsorted");
        member.stream().forEach(System.out::println);
        System.out.println();

        // Sort the objects since Member implements Comparable
        System.out.println("Sorted stream");
        member.stream().sorted().forEach(System.out::println);
        System.out.println();

        // Notice how stream().sorted() sorts the stream but doesn't sort the original list
        System.out.println("Original list is not sorted");
        member.stream().forEach(System.out::println);
        System.out.println();

        // Lists can use Collections.sort() instead
        // Sort the list itself instead of the stream
        System.out.println("Sorted list");
        Collections.sort(member);
        member.stream().forEach(System.out::println);
    }
}
