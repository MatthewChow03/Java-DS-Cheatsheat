/**
 *
 * Topics:
 *
 * This example will show how constructor overloading (parameters changing) can be used with inheritance
 *
 *      If super() or new Superclass() is called with a parameter, it will call the constructor that has a parameter
 *      If super() or new Superclass() is called with no parameter, it will default to the constructor that automatically sets the objectVariable
 *
 *      See Superclass.java
 *
 * To call superclass methods, use super.method()
 *
 */

package InheritanceOverload;

public class Main {
    public static void main(String[] args) {
        Superclass sup = new Superclass();
        Subclass sub = new Subclass();

        System.out.println(sup);
        System.out.println(sub);
    }
}
