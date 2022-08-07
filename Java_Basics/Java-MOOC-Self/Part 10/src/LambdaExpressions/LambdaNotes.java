/**
 *
 * Topics:
 *
 * Functional interface
 *      Interface with 1 abstract method only (could have more
 *      Annotation is just for best practice
 *          Compiler will enforce it to have 1 abstract method
 *
 * Lambda expressions
 *      Short block that takes in parameters and returns a value
 *
 *      Method implementations that can be saved as variables or passed into methods as parameters
 *      It is used as a shortcut to implementing a functional interface
 *      You are treating code as a parameter
 *
 *      Most basic example is (param1, param2) -> {expression};
 *          () on param are not necessary for 1 parameter (if no param or >1 param, need parentheses)
 *          {} on expression are not necessary for single operation
 *          You can also expand the {} and put a return statement
 *
 * This example
 *      interface StringFunction: unimplemented run() function
 *          This run() function will be implemented by the lambda expression
 *      void printFormatted(): uses the run() method from the interface
 *      lambda expression: defines the run() method which gets passed into printFormatted()
 *
 *      What does the interface want to implement -> lambda expression implements it -> function uses implementation
 *
 *
 *
 */

package LambdaExpressions;

// The StringFunciton interface requires that classes implementing it have the method run()
// Interface with 1 abstract method is called a functional interface
@FunctionalInterface
interface StringFunction {
    String run(String str);
}

public class LambdaNotes {
    public static void main(String[] args) {
        StringFunction exclaim = (s) -> s + "!";
        StringFunction ask = (s) -> s + "?";
        printFormatted("Hello", exclaim);
        printFormatted("Hello", ask);
    }
    public static void printFormatted(String str, StringFunction format) {
        String result = format.run(str);    // Since format is type StringFunction which is an interface
                                            // the StringFunction can use its method run()
        System.out.println(result);
    }
}
