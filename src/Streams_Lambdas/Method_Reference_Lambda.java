package Streams_Lambdas;

import java.util.Arrays;
import java.util.List;

public class Method_Reference_Lambda {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Java", "Python", "Kotlin", "Spring Boot");
        list.forEach(System.out::println);

    }
}
