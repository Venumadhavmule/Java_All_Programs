package Streams_Lambdas;


/*
💡 What is Supplier in Java?
-----------------------------
- Supplier<T> is a functional interface (introduced in Java 8).
- Unlike Consumer (which TAKES input and returns nothing),
  Supplier TAKES NO input but RETURNS a value (of type T).
- Think of it like a factory 🏭: it "supplies" or "generates" values when called.

📌 Key Method:
- T get();   // returns a value of type T

📌 Why introduced?
- Before Java 8, generating values (like random numbers, current date, objects)
  often needed boilerplate code.
- Supplier makes it super easy with lambdas and functional programming.
- Plays a key role when you want LAZY value generation
  (e.g., only create the value when needed).
*/
/*
✨ Summary (ELI5):
- Consumer = takes input, gives nothing.
- Supplier = takes nothing, gives output.
- Use Supplier when you want to "generate" or "supply" values (random, date, objects).
- Introduced in Java 8 for functional + cleaner code, and for lazy value creation.
*/

import java.util.Random;
import java.util.function.Supplier;

public class Lambda_With_Supplier {
    public static void main(String[] args) {

        //Supplier For  Greeting
        Supplier<String> greetingSupplier = () -> "Hello Supplier";
        System.out.println(greetingSupplier.get());

        //Supplier For the Random Number Generating
        Supplier<Integer> randomSupplier = () -> new Random().nextInt(100);
        System.out.println(randomSupplier.get());
    }
}
