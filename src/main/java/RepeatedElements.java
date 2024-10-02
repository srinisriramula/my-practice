import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class RepeatedElements {

    public static void main(String[] args) {
        List<String> list = Arrays.asList("apple", "banana", "apple", "orange", "banana", "grape", "apple");

        // Get the repeated elements
        List<String> repeatedElements = list.stream()
            .collect(Collectors.groupingBy(Function.identity(), Collectors.counting())) // Group by element and count
            .entrySet()
            .stream()
            .filter(entry -> entry.getValue() > 1) // Keep only elements that appear more than once
            .map(Map.Entry::getKey) // Extract the keys (the elements)
            .collect(Collectors.toList()); // Collect them to a list

        System.out.println("Repeated elements: " + repeatedElements);
    }
}
