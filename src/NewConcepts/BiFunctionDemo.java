package NewConcepts;

import java.util.function.BiFunction;

public class BiFunctionDemo {
    public static void main(String[] args) {
//        BiFunction<T,U,R>
//                T = first arguments type
//                U = second arguments type
//                R = return type

//        Example 1: Add two integers
        BiFunction<Integer, Integer, Integer> add = (a, b) -> a + b;
        System.out.println("Sum: " + add.apply(22, 28));

//        Example 2: Concatenate two strings
        BiFunction<String, String, String> concat = (s1, s2) -> s1 + " " + s2;
        System.out.println("Concat: " + concat.apply("Venu", "Madhav"));

//        Example 3: Combine integer and String -> formatted String
        BiFunction<String, Integer, String> format = (name, age) -> name + " is " + age + " years old";
        System.out.println(format.apply("Reddy", 25));
    }
}
