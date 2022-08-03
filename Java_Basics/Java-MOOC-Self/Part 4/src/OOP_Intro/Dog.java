/**
 * Topics:
 *
 * Instance/private variables
 * Protected variables (formally called access modifiers)
 * Encapsulation
 * Constructor
 * Public/private methods
 * Instance method vs static method
 * Method parameter and return value
 * Override annotation
 *
 * Inheritance (in Cat class)
 *
 */

package OOP_Intro;

public class Dog {

    // These instance variables are encapsulated in the Dog object
    // Private variables can only be accessed from within the Dog class using this.var
    // Protected variables can be accessed by subclasses (inheritance)
    private final String name;  // final keyword: var cannot be modified
    protected int age;

    // Constructor: special method for when object is instantiated
    public Dog(String givenName) {
        this.age = 0;
        this.name = givenName;
    }

    // Public method can be called outside the class
    // Since there is no static keyword, this is an instance method that can only be called with an instance (so it can't act like a typical function call)
    public void growOlder() {
        this.age++;
        printAge();
    }

    // Method with parameter and return value
    public String barkMessage(String message) {
        // Concatenate message with bark at the start and end
        // Showing 2 ways to concatenate
        return "bark" + message.toUpperCase().concat("woof");
    }

    // Private method can only be called within the class
    private void printAge() {
        System.out.println(this.name + " is now " + this.age + " year(s) old");
    }

    // toString method: preferred way, returns string representation of object
    // use annotation to give instructions to the Java compiler (this anootation is a part of Java)
    @Override
    public String toString() {
        return this.name;
    }
}
