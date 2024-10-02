import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ThreadExample {

    // Method that returns a value
    public static int computeSum(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        // Create a Callable that calls the computeSum method
        Callable<Integer> task = () -> {
            // Simulating some computation
            return computeSum(5, 10);
        };

        // Create a thread pool with a single thread
        ExecutorService executor = Executors.newSingleThreadExecutor();

        // Submit the task to the executor and get a Future object
        Future<Integer> future = executor.submit(task);

        try {
            // Get the result of the computation
            int result = future.get();
            System.out.println("The sum is: " + result);
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        } finally {
            // Shutdown the executor
            executor.shutdown();
        }
    }
}
