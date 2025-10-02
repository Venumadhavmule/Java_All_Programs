package NewConcepts;

/*
 * Predicate in Java:
 * ------------------
 * A Predicate is a functional interface in java.util.function
 * that represents a single argument function which returns a boolean (true/false).
 *
 * Method inside Predicate:
 *   boolean test(T t);
 *
 * Why it's helpful:
 * - Lets you pass conditions (tests) as objects.
 * - Makes code cleaner with lambdas.
 * - Works great with Streams for filtering.
 * - Supports composition (and, or, negate).
 */


import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateDemo {
    public static void main(String[] args) {
        Predicate<Integer> isEven = n -> n % 2 == 0;
        Predicate<String> isNotEmpty = String::isEmpty;

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        System.out.println("Even Numbers");
        numbers.stream()
                .filter(isEven)
                .forEach(System.out::println);

        String test = "Hello";
        if (isNotEmpty.test(test)) {
            System.out.println(test + " is not Empty");
        } else {
            System.out.println(test + " is Empty");
        }

    }
}
