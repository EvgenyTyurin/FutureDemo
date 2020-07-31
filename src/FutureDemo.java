import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/**
 * Future mechanism demo
 */

public class FutureDemo {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        // Call for long calculations
        Future<Integer> future = new FutureCalculator().getFactorial(10);
        // Wait when calculations done
        while (!future.isDone()) {
            System.out.println("Calculating...");
        }
        // Print calculations results
        System.out.println("Result: " + future.get().toString());
    }

}
