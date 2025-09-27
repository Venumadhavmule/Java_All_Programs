package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Filtering_List_with_Lambda {
    public static void main(String[] args) {
        String names[] = {"ajay", "Banu", "Chinni", "Dolly", "Eagle"};
        String villages[] = new String[6];
        villages[0] = "Thimmapalem";
        villages[1] = "Agraharam";
        villages[2] = "Ongole";
        villages[3] = "China";
        villages[4] = "Mexico";
        villages[5] = "thimmapalem";

        List<String> filteredList = Arrays.stream(villages).filter(it -> it.toLowerCase().startsWith("t")).toList();
        filteredList.forEach(System.out::println);

    }
}
