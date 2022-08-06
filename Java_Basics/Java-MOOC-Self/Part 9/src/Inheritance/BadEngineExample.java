// Redundant, copies most of the Part.java code

package Inheritance;

public class BadEngineExample {

    private String engineType;
    private String identifier;
    private String manufacturer;
    private String description;

    public BadEngineExample(String engineType, String identifier, String manufacturer, String description) {
        this.engineType = engineType;
        this.identifier = identifier;
        this.manufacturer = manufacturer;
        this.description = description;
    }

    public String getEngineType() {
        return engineType;
    }

    public String getIdentifier() {
        return identifier;
    }

    public String getDescription() {
        return description;
    }

    public String getManufacturer() {
        return manufacturer;
    }
}