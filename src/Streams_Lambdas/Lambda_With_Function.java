package Streams_Lambdas;

import java.util.function.Function;


/*✨ Summary (ELI5): Functional = Consumer + Supplier
        - Lambda = mini function without a name.
        - Works mainly with functional interfaces (like Function, Consumer, Supplier).
        - Function<T,R> is used when you TAKE input and RETURN something.
        - Example: (x) -> x * x is a lambda for squaring numbers.
*/

public class Lambda_With_Function {
    public static void main(String[] args) {
        Function<Integer, Integer> square = (n) -> n * n;
        System.out.println("Square of 2: " + square.apply(2));
        System.out.println("Square of 5: " + square.apply(5));

        //Length Finder
        Function<String, Integer> lengthFinder = (str) -> str.length();
        System.out.println(lengthFinder.apply("Venu Madhav"));
        System.out.println(lengthFinder.apply("Reddy"));
    }
}
