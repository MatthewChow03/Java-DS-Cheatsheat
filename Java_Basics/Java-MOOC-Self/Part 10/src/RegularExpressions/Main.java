/**
 *
 * Topics:
 *
 * Regular expression is parameter for matches(String regex) which verified format of a string
 *      Alternation: optional equals (not contains)
 *          e.g., matches("00|111|0000")
 *              00 TRUE
 *              1111 FALSE
 *              111 TRUE
 *
 *      Affect parts: use parentheses
 *          e.g., car(|s|) is valid for car and cars
 *
 *      Quantifiers: number of repeats
 *          * is 0 or more repeats
 *          + is 1 or more repeats
 *          ? is 0 or 1 repeat
 *          {n} is n repeats
 *          {a,b} is from a to b repeats
 *          {a,} is from a to inf repeats
 *
 *          e.g., string.matches("tro(lo)+")
 *              tro FALSE
 *              trolo TRUE (1 repeat)
 *              trololololo TRUE
 *
 *       Character classes: square brackets
 *          [2-36-9] means from 2 to 3, from 6 to 9
 *              Valid: 2,3,6,7,8,9
 *          [a-c] means chars a,b,c
 *
 *
 *
 */

package RegularExpressions;

public class Main {
    public static void main(String[] args) {
        String string = "tro";

        if (string.matches("tro(lo)+")) {
            System.out.println("Correct form.");
        } else {
            System.out.println("Incorrect form.");
        }
    }
}
