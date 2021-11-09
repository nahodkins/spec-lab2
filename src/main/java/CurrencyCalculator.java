public class CurrencyCalculator {

    private static final double UAH_CURRENCY_VALUE = 26.33;
    private static final double RUB_CURRENCY_VALUE = 71.81;
    private static final double EUR_CURRENCY_VALUE = 0.86;

    public static double calculateUah(double usdValue) {
        return usdValue * UAH_CURRENCY_VALUE;
    }

    public static double calculateRub(double usdValue) {
        return usdValue * RUB_CURRENCY_VALUE;
    }

    public static double calculateEur(double usdValue) {
        return usdValue * EUR_CURRENCY_VALUE;
    }
}
