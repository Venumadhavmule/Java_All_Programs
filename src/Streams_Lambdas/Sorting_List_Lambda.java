package Streams_Lambdas;

import java.util.Arrays;
import java.util.List;

public class Sorting_List_Lambda {
    public static void main(String[] args) {
        int[] numbers = {10, 80, 256, 8, 56};
        List<Integer> numbersList = Arrays.stream(numbers).boxed().toList();

        numbersList.sort(Integer::compareTo);
        List<Integer> sortedNumbers = numbersList.stream().sorted((a, b) -> b.compareTo(a)).toList();
        sortedNumbers.forEach(System.out::println);
    }
}
