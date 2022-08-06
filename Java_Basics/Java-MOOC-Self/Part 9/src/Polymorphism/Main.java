/**
 *
 * Topic:
 *
 * Polymorphism is the concept of how objects call methods based on their class
 *      If an object belonging to a subclass cannot find the method, it will search for the method in the superclass
 *          Take a look at toString() in Point3D.java
 *              There is no toString() method, so it checks the superclass (Point.java)
 *                  Inside of toString(), location() is called, which exists in the subclass Point3D.java so the subclass method is called for location() but not toString()
 *
 *      Example in main where the for loop runs methods based on their respective object type
 *
 */

package Polymorphism;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Point> points = new ArrayList<>();
        points.add(new Point(4, 8));
        points.add(new ColorPoint(1, 1, "green"));
        points.add(new ColorPoint(2, 5, "blue"));
        points.add(new Point(0, 0));

        // Uses polymorphism to call the respective methods of each object type
        for (Point p: points) {
            System.out.println(p);
        }
    }
}
