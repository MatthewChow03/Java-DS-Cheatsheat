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
        Superclass sup = new Superclass();  // will call super() and since there is no param it will use the first constructor (see Superclass.java)
        Subclass sub = new Subclass();      // will call super(param) and since there is a param it will use the second constructor (see Superclass.java)

        System.out.println(sup);
        System.out.println(sub);
    }
}
