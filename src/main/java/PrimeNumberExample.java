import java.util.stream.IntStream;

public class PrimeNumberExample {
    
    public static void main(String[] args) {
        int number = 17;
        boolean isPrime = isPrimeNumber(number);
        
        System.out.println(number + " is prime? " + isPrime);
    }
    
    public static boolean isPrimeNumber(int number) {
        if (number <= 1) {
            return false;
        }
        
        return IntStream.rangeClosed(2, (int) Math.sqrt(number))
                .noneMatch(i -> number % i == 0);
    }
}