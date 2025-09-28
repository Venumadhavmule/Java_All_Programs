package Streams_Lambdas;

import java.util.HashMap;
import java.util.Map;

public class Lambda_With_Map_Iteration {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("Java", 8);
        map.put("Spring", 5);
        map.put("Lambda", 1);
        map.forEach((a, b) -> System.out.println("Key: " + a + " ---> Value: " + b));
//        map.entrySet().stream().forEach((a) -> System.out.println("Key: " + a.getKey() + " ---> value: " + a.getValue()));
    }
}
