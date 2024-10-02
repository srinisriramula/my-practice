import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

enum Color {
    RED("RED", "red desc"),
    GREEN("GREEN", "GREEN desc"),
    BLUE ("BLUE", "BLUE desc"),
    YELLOW ("YELLOW", "YELLOW desc"),
    ORANGE("ORANGE", "ORANGE desc"),
    PURPLE("PURPLE", "PURPLE desc"),
    BLACK ("BLACK", "BLACK desc"),
    WHITE("WHITE", "WHITE desc");

    private String name;
    private String desc;

    Color(String name, String desc) {
        this.name = name;
        this.desc = desc;
    }

    public String getName() {
        return name;
    }

    public String getDesc() {
        return desc;
    }
}

public class Main {
    public static void main(String[] args) {
        // List of Color enums
       List<Color> colors = Arrays.asList(Color.values());

        // List of strings to filter by
        List<String> filterStrings = Arrays.asList("RED", "BLUE", "BLACK");

        // Filter the list of Color enums based on the list of strings
        List<Color> filteredColors = colors.stream()
                .filter(color -> filterStrings.contains(color.getName()))
                .collect(Collectors.toList());

        String filteredVal = colors.stream()
                .filter(color -> filterStrings.contains(color.getName()))
                .map(Color::getDesc)
                .collect(Collectors.joining(", "));
        // Print the filtered list of Color enums
        filteredColors.forEach(color ->
                System.out.println("Name: " + color.getName() + ", Desc: " + color.getDesc()) );
        System.out.println(filteredVal);
    // List of strings to filter by
        //List<String> filterStrings = Arrays.asList("RED", "BLUE", "BLACK");

//        // Filter the list of Color enums based on the list of strings
//        List<Color> filteredColors = colors.stream()
//                .filter(color -> filterStrings.contains(color.name()))
//                .collect(Collectors.toList());
//
//        // Print the filtered list of Color enums
//        filteredColors.forEach(System.out::println);
    }
}
