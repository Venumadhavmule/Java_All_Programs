package Streams_Lambdas;

// Consumer is a functional interface from java.util.function package
// It takes an input (of type T) and returns nothing (void).
// Useful when you want to perform some action (like printing, logging, updating, etc.).

/*
💡 Why Consumer was introduced?
--------------------------------
- Before Java 8, we had to write anonymous classes for small tasks (like printing, logging).
- Java 8 added functional interfaces + lambda expressions to make code shorter & more readable.
- Consumer<T> is one of those functional interfaces.
- It’s useful when you want to perform an action on a value but don’t need to return anything.

📌 Where do we use Consumer?
1. Iterating over collections (e.g., forEach).
2. Logging or debugging.
3. Event handling / Callbacks.
4. Chaining multiple actions using andThen().
*/

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Lambda_With_Consumer {
    public static void main(String[] args) {

        // Example 1: Using Consumer in forEach (Collection processing)
        List<String> names = Arrays.asList("Joy", "Venu", "Madhav", "Reddy");
        Consumer<String> printName = (name) -> System.out.println("name: " + name);

        // forEach takes a Consumer as input
        names.forEach(printName);

        //Example 2: Logging actions (no return needed)
        Consumer<String> logger = (msg) -> System.out.println("[LOG] " + msg);
        logger.accept("Application started: ");
        logger.accept("User logged in");

        //Example 3: Event Handling(simulate button click)
        Consumer<String> onClick = (button) -> System.out.println(button + " was clicked");
        onClick.accept("Submit Button");


    }
}
