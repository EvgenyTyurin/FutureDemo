import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * Long calculations here
 */

public class FutureCalculator {

    private ExecutorService executorService =
            Executors.newSingleThreadExecutor();

    public Future<Integer> getFactorial(int i) {
        return executorService.submit(() -> {
            int result = 1;
            for (int idx = 1; idx <= i; idx++) {
                result = result  * idx;
            }
            executorService.shutdown();
            return result;
        });
    }

}
