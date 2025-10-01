package Streams_Lambdas;

import java.util.Optional;

public class Lambda_With_Optional {
    public static void main(String[] args) {
        Optional<String> optional = Optional.of("Java");
        optional.ifPresent(s -> System.out.println("Value is present: " + s));
    }
}
