package InheritanceOverload;

public class Superclass {

    private String objectVariable;

    // First constructor
    public Superclass() {
        this("No parameters inputted into the constructor");    // this() will call another constructor
    }

    // Second constructor
    public Superclass(String value) {
        this.objectVariable = value;
    }

    public String toString() {
        return this.objectVariable;
    }
}