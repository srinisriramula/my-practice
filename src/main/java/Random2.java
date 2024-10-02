
import java.util.UUID;

public class Random2 {
    public static void main(String[] args) {
        // Generate a UUID and take the first 9 characters
        String uniqueID = UUID.randomUUID().toString().replace("-", "").substring(0, 9);
        System.out.println("Unique ID: " + uniqueID);
    }
}