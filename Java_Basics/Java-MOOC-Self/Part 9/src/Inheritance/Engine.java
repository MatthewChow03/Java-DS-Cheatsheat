/**
 *
 * Topics:
 *
 * super() calls the constructor of super class
 *
 * Access modifiers for a subclass
 *      Private variables are only accessible to the methods of the superclass
 *          This works fine, just make getter and setter methods from the super class
 *          Then, the subclass can access the private variables through the public methods
 *      Protected variables and public variables can be accessed by the subclass
 *
 */

package Inheritance;

// Engine has all variables and methods of the Part class
public class Engine extends Part {

    private String engineType;

    public Engine(String engineType, String identifier, String manufacturer, String description) {
        // Call the superclass constructor
        super(identifier, manufacturer, description);
        this.engineType = engineType;
    }

    public String getEngineType() {
        return engineType;
    }
}