/**
 *
 * Topics:
 *
 * Unit test wit JUnit 5 and Intellij IDE
 *
 * Test driven development
 *      Write test (make sure test fails and then move on)
 *      Implement functionality
 *      Run test
 *      Pass tests
 *      Refactor (cleanup without changing functionality)
 *
 * Advantages of test driven development
 *      Requires programmer to think of the functionality before writing the code
 *      Small manageable parts
 *      Further development is easier, existing functionality works
 *      Increase speed by mitigating issues from the start
 */

package UnitTesting;

public class Calculator {

    private int value;

    public Calculator() {
        this.value = 0;
    }

    public void add(int number) {
        this.value = this.value + number;
    }

    public void subtract(int number) {
        this.value = this.value + number;
    }

    public int getValue() {
        return this.value;
    }
}