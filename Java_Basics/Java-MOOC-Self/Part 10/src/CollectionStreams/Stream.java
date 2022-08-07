/**
 *
 * Topics:
 *
 * Stream concept
 *      Pipelining is when a chain of processes has its outputs arranged as the following inputs
 *      Streams are used on a collection where a sequence of events (pipeline) are executed for each value of the colleciton
 *      Stream methods are either intermediate (have following methods) or terminal (end the stream)
 * Lambda expressions
 *      s
 *
 */

package CollectionStreams;

import java.util.*;

public class Stream {
    public static void main(String[] args) {
        // We initialise the scanner and the list into which the input is read
        Scanner scanner = new Scanner(System.in);
        List<String> inputs = new ArrayList<>();

        // reading inputs
        while (true) {
            String row = scanner.nextLine();
            if (row.equals("end")) {
                break;
            }

            inputs.add(row);
        }

        // counting the number of values divisible by three
        long numbersDivisibleByThree = inputs.stream()
                .mapToInt(s -> Integer.valueOf(s))
                .filter(number -> number % 3 == 0)
                .count();

        // working out the average
        double average = inputs.stream()
                .mapToInt(s -> Integer.valueOf(s))
                .average()
                .getAsDouble();

        // printing out the statistics
        System.out.println("Divisible by three " + numbersDivisibleByThree);
        System.out.println("Average number: " + average);
    }
}
