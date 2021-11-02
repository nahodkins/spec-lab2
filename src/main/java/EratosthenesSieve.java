import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class EratosthenesSieve {

    public static int[] getPrimeNumbers(int end, boolean isOptimised) {
        int[] numbers = IntStream.rangeClosed(0, end)
                .toArray();
        for (int i = 2; (isOptimised ? (i * i) : i) < numbers.length; i++) {
            if (numbers[i] > 0) {
                for (int j = i * i; j < numbers.length; j += i) {
                    numbers[j] = 0;
                }
            }
        }
        return Arrays.stream(numbers)
                .filter(i -> i != 0)
                .toArray();
    }
}
