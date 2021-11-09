public enum TrafficLightsColor {

    RED("red"),
    YELLOW("yellow"),
    GREEN("green");

    private static final String WRONG_COLOR_NUM_MSG_TEMPLATE = "There is no color with color number %d";
    private static final String TO_STRING_MSG_TEMPLATE = "TrafficLightsColor:{colorName='%s'}";

    private final String colorName;

    TrafficLightsColor(String colorName) {
        this.colorName = colorName;
    }

    public static TrafficLightsColor getColorByColorNum(int colorNum) {
        switch (colorNum) {
            case 1: return RED;
            case 2: return YELLOW;
            case 3: return GREEN;
            default: throw new IllegalArgumentException(String.format(WRONG_COLOR_NUM_MSG_TEMPLATE, colorNum));
        }
    }

    public String getColorName() {
        return colorName;
    }

    @Override
    public String toString() {
        return String.format(TO_STRING_MSG_TEMPLATE, colorName);
    }
}
