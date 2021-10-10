public class CurrencyCalculator {

    private static final double UAH_CURRENCY_VALUE = 26.33;
    private static final double RUB_CURRENCY_VALUE = 71.81;
    private static final double EUR_CURRENCY_VALUE = 0.86;

    private double usdValue;

    public CurrencyCalculator(double usdValue) {
        this.usdValue = usdValue;
    }

    public double getUsdValue() {
        return usdValue;
    }

    public void setUsdValue(double usdValue) {
        this.usdValue = usdValue;
    }

    public double getUahValue() {
        return usdValue * UAH_CURRENCY_VALUE;
    }

    public double getRubValue() {
        return usdValue * RUB_CURRENCY_VALUE;
    }

    public double getEurValue() {
        return usdValue * EUR_CURRENCY_VALUE;
    }
}
