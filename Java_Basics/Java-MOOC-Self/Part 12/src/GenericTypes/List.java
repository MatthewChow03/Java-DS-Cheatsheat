/**
 *
 * Basic implementation of the List type using generic type parameters
 *      Recall, this is an interface that is implemented by ArrayList etc.
 *
 */

package GenericTypes;

public interface List<T> {
    void add(T value);
    T get(int index);
    T remove(int index);
}

/*
    To implement this interface you could
    1) Use generic types in the class, thus generating at runtime
    2) Define the types of the generic interface in the class

    1)
    public class GeneralList<T> implements List<T> {
        // object variables

        @Override
        public void add(T value) {
        // implementation
        }

        @Override
        public T get(int index) {
        // implementation
        }

        @Override
        public T remove(int index) {
        // implementation
        }
    }

    2)
    public class MovieList implements List<Movie> {
        // object variables

        @Override
        public void add(Movie value) {
        // implementation
        }

        @Override
        public Movie get(int index) {
        // implementation
        }

        @Override
        public Movie remove(int index) {
        // implementation
        }
    }

 */