public class Main {

    public static void main(String[] args) {
        int positive = 23;
        int negative = -20;
        System.out.println("Positive >>: " + (positive>>1));
        System.out.println("Positive <<: " + (positive>>1));
        System.out.println("Positive >>>: " + (positive>>>1));
        System.out.println();
        System.out.println("Negative >>: " + (negative>>1));
        System.out.println("Negative >>: " + (negative<<1));
        System.out.println("Negative >>>: " + (negative>>>1));
    }
}
