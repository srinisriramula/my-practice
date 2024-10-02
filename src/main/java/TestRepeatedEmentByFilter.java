import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class TestRepeatedEmentByFilter {
    public static void main(String[] args) {
        List<Integer> inputList = new ArrayList<>(0);
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the how many n of elements to check with ::");
        int listInputSize = scanner.nextInt();

        System.out.println("Please enter the elements ::");
        for (int i=0; i < listInputSize; i++){
            inputList.add(scanner.nextInt());
        }

        System.out.println("Please enter max of repeated elements ::");
        Integer limitElementSize = scanner.nextInt();

        List filteredMap = inputList
                .stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet()
                .stream()
                .sorted(Map.Entry.<Integer, Long>comparingByValue().reversed())
                .collect(Collectors.toMap(Map.Entry :: getKey, Map.Entry :: getValue, (e1, e2) -> e1, LinkedHashMap::new))
                .keySet()
                .stream()
                .limit(limitElementSize)
                .collect(Collectors.toList());

        System.out.println("filteredMap :: "+filteredMap);
    }
}
