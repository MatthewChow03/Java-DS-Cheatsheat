package OOP_Intro;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Dog tate = new Dog("tate");

        // Example of private method being called from within growOlder()
        tate.growOlder();

        // Example of return value and parameter to a public method
        String tateMessage = tate.barkMessage("hello");
        System.out.println(tateMessage);

        // Use the toString method which implicitly calls here
        System.out.println(tate);

        // Generate an ArrayList of dogs and print those with ages lower than 10
        ArrayList<Cat> cats = new ArrayList<>();
        Random rand = new Random();
        cats.add(new Cat("beck", rand.nextInt(20)));
        cats.add(new Cat("karl", rand.nextInt(20)));
        cats.add(new Cat("don", rand.nextInt(10)));

        for(Cat cat: cats) {
            if (cat.catBelowTenYears()) {
                System.out.println(cat + " is less than 10 years old");
            }
        }
    }

}
