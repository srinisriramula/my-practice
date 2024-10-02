import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SecondHighestExample {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(3, 6, 2, 8, 7, 5, 10, 9);

        // Sort and get the second highest element
        Integer secondHighest = numbers.stream()
                .distinct()
                .sorted(Comparator.reverseOrder())
                //.limit(2)                          // Limit the stream to the top 2 elements
                .skip(1)                           // Skip the first element
                .findFirst()
                .orElse(null);
                //.orElse(null);                     // Handle cases where there might not be a second highest element

        System.out.println("Second highest: " + secondHighest);
    }
}
