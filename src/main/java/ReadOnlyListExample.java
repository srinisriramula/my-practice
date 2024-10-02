import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ReadOnlyListExample {
    public static void main(String[] args) {
        // Create a mutable list
        List<String> mutableList = new ArrayList<>();
        mutableList.add("Apple");
        mutableList.add("Banana");
        mutableList.add("Cherry");

        // Wrap the mutable list in an unmodifiable view
        List<String> readOnlyList = Collections.unmodifiableList(mutableList);

        // Display the read-only list
        System.out.println("Read-Only List: " + readOnlyList);

        // Attempting to modify the read-only list will throw UnsupportedOperationException
        try {
            readOnlyList.add("Durian");
        } catch (UnsupportedOperationException e) {
            System.out.println("Exception: Cannot modify a read-only list.");
        }

        // However, the original mutable list can still be modified
        mutableList.add("Durian");
        System.out.println("Modified Mutable List: " + mutableList);
        System.out.println("Read-Only List after modifying the original list: " + readOnlyList);
    }
}
