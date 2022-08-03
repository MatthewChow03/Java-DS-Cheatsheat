package OOP_Intro2;

public class Overloading {
    public static void main(String[] args) {
        // Constructor overloading
        Person paul = new Person("Paul", 24);
        Person ada = new Person("Ada");

        System.out.println(paul);
        System.out.println(ada);

        // Method overloading
        paul.growOlder();
        System.out.println(paul);

        paul.growOlder(10);
        System.out.println(paul);

        // Object as parameter
        System.out.println("Paul is older than Ada: " + paul.olderThan(ada));
    }
}
