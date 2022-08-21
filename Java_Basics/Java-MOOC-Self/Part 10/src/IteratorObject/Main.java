/**
 *
 * Topics:
 *
 * Using the iterator object to traverse collections
 *      See Hand.java
 *
 * Enums with objects
 *
 */

package IteratorObject;

public class Main {
    public static void main(String[] args) {
        Hand myHand = new Hand();
        myHand.add(new Card(5, Suit.SPADE));
        myHand.add(new Card(4, Suit.SPADE));
        myHand.add(new Card(10, Suit.HEART));
        myHand.add(new Card(7, Suit.DIAMOND));

        // Show list of cards
        myHand.print();

        System.out.println();

        // Remove the 5 of SPADE
        myHand.removeBelow(6);
        myHand.print();

    }
}
