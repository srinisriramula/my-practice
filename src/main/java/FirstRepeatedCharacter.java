import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FirstRepeatedCharacter {
    
    public static void main(String[] args) {
        String input = "Java Articles are Awesome";

        // Find the first repeated character
        Character firstRepeated = input.chars()
            .mapToObj(c -> (char) c) // Convert int stream to Character stream
            .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting())) // Collect characters in order with their counts
            .entrySet().stream()
            .filter(entry -> entry.getValue() > 1) // Filter characters that have a count greater than 1
            .map(Map.Entry::getKey) // Extract the character (key)
            .findFirst() // Find the first one
            .orElse(null); // Return null if no repeated character is found

        if (firstRepeated != null) {
            System.out.println("First repeated character: " + firstRepeated);
        } else {
            System.out.println("No repeated characters found.");
        }

        Map<Character, Long> allTheElemsMap = input.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap :: new, Collectors.counting()))
                .entrySet()
                .stream()
                .filter(entry -> entry.getValue() > 1)
                .collect( Collectors.toMap(Map.Entry :: getKey, Map.Entry :: getValue, (e1, e2) -> e1, LinkedHashMap :: new))
                ;

        System.out.println("allTheElemsMap :: "+allTheElemsMap);


    }
}
