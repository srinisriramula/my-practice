import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class RepeatedElementsWithCount {

    public static void main(String[] args) {
        List<String> list = Arrays.asList("apple", "banana", "apple", "orange", "banana", "grape", "apple");

        // Get the repeated elements with their counts
        Map<String, Long> repeatedElementsWithCount = list.stream()
            .collect(Collectors.groupingBy(Function.identity(), Collectors.counting())) // Group by element and count
            .entrySet()
            .stream()
            .filter(entry -> entry.getValue() > 1) // Keep only elements that appear more than once
            .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue)); // Collect them to a map

        System.out.println("Repeated elements with counts: " + repeatedElementsWithCount);
    }
}
