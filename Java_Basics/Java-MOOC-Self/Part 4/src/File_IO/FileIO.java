/**
 * Topics:
 *
 * Read file and print lines
 *
*/

package File_IO;
import java.util.Scanner;
import java.nio.file.Paths;

public class FileIO {
    public static void main(String[] args) {
        // Path is from the project root and Java-MOOC-Self is the project
        try (Scanner scanner = new Scanner(Paths.get("Part 4/src/File_IO/data.txt"))) {

            // we read the file until all lines have been read
            while (scanner.hasNextLine()) {
                // we read one line
                String row = scanner.nextLine();
                // ignore empty lines
                if (row.isEmpty()) {
                    continue;   // jumps to beginning of loop
                }
                // we print the line that we read
                System.out.println(row);
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
