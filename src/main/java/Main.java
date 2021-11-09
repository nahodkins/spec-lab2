import java.util.Scanner;

public class Main {

    private static final String GET_USD_VALUE_MSG = "USD value: ";
    private static final String UAH_VALUE_MSG_TEMPLATE = "UAH: %.3ff₴";
    private static final String RUB_VALUE_MSG_TEMPLATE = "RUB: %.3ff₽";
    private static final String EUR_VALUE_MSG_TEMPLATE = "EUR: %.3f€";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(GET_USD_VALUE_MSG);
        double usdValue = scanner.nextDouble();
        System.out.printf((UAH_VALUE_MSG_TEMPLATE) + "%n", CurrencyCalculator.calculateUah(usdValue));
        System.out.printf((RUB_VALUE_MSG_TEMPLATE) + "%n", CurrencyCalculator.calculateRub(usdValue));
        System.out.printf((EUR_VALUE_MSG_TEMPLATE) + "%n", CurrencyCalculator.calculateEur(usdValue));
    }
}
