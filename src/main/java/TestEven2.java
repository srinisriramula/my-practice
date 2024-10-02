import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TestEven2 {
    public static void main(String[] args) {
        List<Integer> inputList = Arrays.asList(10,15,8,49,25,98,32);
        List<Integer> results= inputList.stream()
                .filter(e -> e%2 == 0)
                .collect(Collectors.toList());
        //System.out.println(" results :: "+results);

        String testInput = "Java Articles are Awesome";



    }
}
