package HashCode;

import java.util.Objects;

public class overrideBook {
    private String name;
    private String content;
    private int published;

    public overrideBook(String name, int published, String content) {
        this.name = name;
        this.published = published;
        this.content = content;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPublished() {
        return this.published;
    }

    public void setPublished(int published) {
        this.published = published;
    }

    public String getContent() {
        return this.content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    // Here we define equals to mean
    // If the instances are the same reference, equal
    // If the instances have all same data, equal
    @Override
    public boolean equals(Object comparedObject) {
        // comparing to itself, true
        if (this == comparedObject) return true;

        // comparing to a different class or null, false
        if (!(comparedObject instanceof overrideBook) || comparedObject == null) return false;

        // let's cast the object to a Book-object to compare attributes
        overrideBook comparedBook = (overrideBook) comparedObject;

        // check if the object attributes are all equal
        if (this.name.equals(comparedBook.getName()) &&
                this.published == comparedBook.getPublished() &&
                this.content.equals(comparedBook.getContent())) {
            return true;
        }

        // otherwise, the objects aren't the same
        return false;
    }

    // Hash based on all attributes of object
    // This is consistent with the equals() method implementation
    @Override
    public int hashCode() {
        return Objects.hash(name, content, published);
    }

}
