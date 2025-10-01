package Streams_Lambdas;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Lambda_Comparator {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Java", "Python", "C", "C++");
        list.sort(Comparator.comparingInt(String::length));
        list.forEach(System.out::println);
    }
}
