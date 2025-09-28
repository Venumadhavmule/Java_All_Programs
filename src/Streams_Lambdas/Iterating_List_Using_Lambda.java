package Streams_Lambdas;

import java.util.Arrays;
import java.util.List;

public class Iterating_List_Using_Lambda {
    public static void main(String[] args) {
        String[] towns = {"Ongole", "Vijayawada", "Guntur", "Kandukur"};
        List<String> names = Arrays.asList("Venu", "Manoj", "Reddy", "Mule");
        List<String> town_List = Arrays.asList(towns);

        names.forEach(System.out::println);
        town_List.forEach(it -> System.out.print(it+" "));
    }
}
