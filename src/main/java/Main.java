import java.util.Arrays;
import java.util.stream.Collectors;

public class Main {

    private static final String ARRAY_TO_STRING_DELIMITER = ", ";

    public static int[] getIntegerArray() {
        return new int[] {1, 2, 3, 4, 5, 6};
    }

    public static String[] getStringArray() {
        return new String[]{"str1", "str2", "str3", "str4"};
    }

    public static void main(String[] args) {
        int[] integerArray = getIntegerArray();
        String[] stringArray = getStringArray();

        System.out.println(Arrays.toString(integerArray));
        System.out.println(Arrays.toString(stringArray));
        System.out.println();

        String integerToString = Arrays.stream(integerArray)
                .boxed()
                .map(String::valueOf)
                .collect(Collectors.joining(ARRAY_TO_STRING_DELIMITER));
        String stringArrayToString = String.join(ARRAY_TO_STRING_DELIMITER, stringArray);
        System.out.println(integerToString);
        System.out.println(stringArrayToString);
        System.out.println();

        Arrays.stream(integerArray)
                .forEach(System.out::println);
        System.out.println();
        Arrays.stream(stringArray)
                .forEach(System.out::println);
    }
}
