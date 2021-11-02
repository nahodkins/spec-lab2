import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        long start = System.nanoTime();
        EratosthenesSieve.getPrimeNumbers(10000, false);
        long finish = System.nanoTime();
        System.out.printf("Optimised: %.4f%n", (finish - start) / Math.pow(10.0, 9));

        start = System.nanoTime();
        EratosthenesSieve.getPrimeNumbers(10000, true);
        finish = System.nanoTime();
        System.out.printf("Optimised: %.4f%n", (finish - start) / Math.pow(10.0, 9));
    }
}
