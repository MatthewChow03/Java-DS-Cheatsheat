/**
 * Topic:
 *
 * This example shows how you can create multiple constructors within a class
 * Here, there are two constructors, each with a different number of parameters
 *
 * There is also method overloading with the growOlder() method
 *
 */

package OOP_Intro2;

public class Person {

    private String name;
    private int age;
    private int height;
    private int weight;

    public Person(String name) {
        /*
        this.name = name;
        this.age = 0;
        this.weight = 0;
        this.height = 0;
         */
        this(name, 0);  // remove redundancy by calling the other constructor if only 1 parameter
    }

    // If two parameters, automatically use this constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        this.weight = 0;
        this.height = 0;
    }

    // Method overloading
    public void growOlder() {
        this.age = this.age + 1;
    }

    public void growOlder(int years) {
        this.age = this.age + years;
    }

    @Override
    public String toString() {
        return this.name + " is " + this.age + " years old";
    }
}
