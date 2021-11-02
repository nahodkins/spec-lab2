import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class Main {

    private static int getListElementsMultiply(List<Integer> array) {
        return array.stream()
                .reduce((a, b) -> a * b)
                .orElse(0);
    }

    public static void main(String[] args) {
        int multiply = 0;
        List<Integer> integers = new ArrayList<>();
        while (multiply <= 10000) {
            integers.add(integers.size() + 1);
            multiply = getListElementsMultiply(integers);
        }
        System.out.println(integers);
    }
}
