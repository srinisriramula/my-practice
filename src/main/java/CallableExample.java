import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class CallableExample {

    public static void main(String[] args) {
        // Create an ExecutorService with a fixed thread pool size
        ExecutorService executor = Executors.newFixedThreadPool(3);

        // Create a list to hold the Future objects
        List<Future<Integer>> futureList = new ArrayList<>();

        // Submit Callable tasks to the executor
        for (int i = 1; i <= 5; i++) {
            Callable<Integer> task = new NumberCallable(i);
            Future<Integer> future = executor.submit(task);
            futureList.add(future);
        }

        // Retrieve results from the Future objects
        for (Future<Integer> future : futureList) {
            try {
                System.out.println("future :: "+future.toString());
                int result = future.get();
                System.out.println("Result: " + result);
            } catch (InterruptedException | ExecutionException e) {
                e.printStackTrace();
            }
        }

        // Shutdown the executor
        executor.shutdown();
    }
}

class NumberCallable implements Callable<Integer> {
    private int number;

    public NumberCallable(int number) {
        this.number = number;
    }

    @Override
    public Integer call() throws Exception {
        // Perform some computation or task here
        Thread.sleep(1000);
        return number * number;
    }
}
