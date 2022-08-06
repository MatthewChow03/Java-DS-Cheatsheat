/**
 *
 * Topics:
 *
 * Interface concept
 *      Like an agreement that implement the interface must have the method of set names, parameters, and return values
 *
 * Interface as type
 *      All classes that implement an interface can use the interface as their type (just like how they can use their object as a type)
 *      For example, in a collection ArrayList<interfaceType>
 *
 * Interfaces work as method parameter and return types
 *      This is helpful because you can input different objects of the same type (since they all implement an interface, same type)
 *
 *  Built in interfaces
 *      Example, List
 *          The interface abstracts the add(), contains(), get(), etc. methods
 *          ArrayList and LinkedList function similar since they have the same methods, but their implementations are completely different
 *              ArrayList: needs to be resized to add (slow), can index to search (fast)
 *              LinkedList: can add onto end of node (fast), needs to loop through nodes to search (slow)
 *          This is why using the type List instead of ArrayList works
 *              List<> name = new ArrayList<>();
 *                  Here we can't create an instance of the interface
 *                  We need to create an instance of a class that implements the interface
 *
 *      List (ArrayList, LinkedList, Stack, ...): ordered (as added), indexed, allow duplicates
 *      Map (HashMap, Hashtable, ...: KV pairs, no duplicate keys,
 *      Set (HashSet): unordered (not as added), no duplicates
 *
 *
 *
 *
 */

package Interface;

public class InterfaceNotes {
}
