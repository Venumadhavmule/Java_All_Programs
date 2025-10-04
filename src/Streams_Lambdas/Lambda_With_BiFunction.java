package Streams_Lambdas;

import java.util.function.BiFunction;


/*
 * BiFunction<T, U, R> in Java:
 * ----------------------------
 * A functional interface that takes two arguments (T and U)
 * and produces a result (R).
 *
 * Abstract method:
 *     R apply(T t, U u);
 *
 * Package: java.util.function
 */


public class Lambda_With_BiFunction {
    public static void main(String[] args) {
        BiFunction<Integer, Integer, Integer> add = Integer::sum;
//        BiFunction<Integer, Integer, Integer> add = (a, b) -> a + b;

        System.out.println(add.apply(2, 3));
    }
}
