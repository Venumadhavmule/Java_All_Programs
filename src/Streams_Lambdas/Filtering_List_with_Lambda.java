package Streams_Lambdas;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Filtering_List_with_Lambda {

    public static void main(String args[]){

        String movies[] = new String[8];
        movies[0] = "Mirchi";
        movies[1] = "Rebel";
        movies[2] = "Bunny";
        movies[3] = "Maharshi";
        movies[4] = "Dhruva";
        movies[5] = "KGF";
        movies[6] = "Salar";
        movies[7] = "Agent";

        int ages[] = new int[3];
        ages[0] = 55;
        ages[1] = 01;
        ages[2] = 22;

//        List<String> filteredMovies = Arrays.stream(movies).filter(movie -> movie!= null).sorted().toList();
//        filteredMovies.forEach(System.out::println);

//        Arrays.stream(movies).sorted().map(it -> it.toUpperCase()).toList().forEach(System.out::println);

        List<String> filteredMovies = Arrays.stream(movies).map(String::toLowerCase).filter(it -> it.contains("s")).toList();
        filteredMovies.forEach(System.out::println);
//        Stream.of(movies).filter(movie -> movie != null).sorted().forEach(System.out::println);
//        Arrays.stream(ages).boxed().sorted((a, b) ->b-a ).forEach(System.out::println);

    }
}
