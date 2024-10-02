import java.util.Random;

public class RandomTest {
    public static void main(String[] args) {
        Random random = new Random();
        // Generate a random 9-digit number
        int uniqueID = 100000000 + random.nextInt(900000000); // Ensure 9 digits
        System.out.println("Unique ID: " + uniqueID);
    }
}