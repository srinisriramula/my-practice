import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class NumberCountExample {
    
    public static void main(String[] args) {
        int[] numbers = { 1, 2, 3, 2, 1, 3, 4, 5, 4, 4 };
        
        Map<Integer, Integer> numberCountMap = new HashMap<>();
        
        for (int number : numbers) {
            numberCountMap.merge(number, 1, Integer::sum);
        }
        
        // Print the count of each number
        for (Map.Entry<Integer, Integer> entry : numberCountMap.entrySet()) {
           // System.out.println("Number: " + entry.getKey() + ", Count: " + entry.getValue());
        }
        Map<Integer, Long>  numberMap = Arrays.stream(numbers)
                .boxed()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        numberCountMap.forEach((key, value) ->
                System.out.println("Number: " + key + ", Count: " + value));

    }
}
