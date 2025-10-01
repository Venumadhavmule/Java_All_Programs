package Streams_Lambdas;

import java.util.function.Predicate;

public class Lambda_With_Predicate {
    public static void main(String[] args) {
        Predicate<String> isEmpty =  s -> s.startsWith("V");
        System.out.println(isEmpty.test("Venumadhav"));
        System.out.println(isEmpty.test("Reddy"));
    }
}
