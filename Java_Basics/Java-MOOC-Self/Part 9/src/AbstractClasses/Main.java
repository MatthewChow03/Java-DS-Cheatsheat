/**
 *
 * Topics:
 *
 * Abstract classes
 *      Classes that can't have instances
 *          They serve as a superclass base to inherit from
 *          They have regular public methods but also abstract methods which are just the method definition
 *              This allows for a dynamic template that can be used by subclasses
 *
 * This example
 *      Operation: abstract class template for other classes
 *      PlusOperation: subclass of Operation which modifies the abstract method execute() to perform it's adding function
 *      UserInterface: a class that holds objects built off of the Operation abstract class
 *                     each subclass of Operation is added to an ArrayList in main
 *                     userInterface.start() initiates a loop through the subclasses of Operation
 *                     since each subclass of Operation has the abstract method execute(), polymorphism will call the respective execute() methods
 *
 *
 */

package AbstractClasses;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        UserInterface userInterface = new UserInterface(new Scanner(System.in));
        userInterface.addOperation(new PlusOperation());

        userInterface.start();
    }
}
