package InheritanceOverload;

public class Superclass {

    private String objectVariable;

    public Superclass() {
        this("No parameters inputted into the constructor");
    }

    public Superclass(String value) {
        this.objectVariable = value;
    }

    public String toString() {
        return this.objectVariable;
    }
}