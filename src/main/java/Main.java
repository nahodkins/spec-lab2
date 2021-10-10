public class Main {

    public static void doIntegerCast() {
        long l = 65L;
        int i = (int) l;
        short s = (short) i;
        byte b = (byte) s;
        char c = (char) b;

        System.out.println("long: " + l);
        System.out.println("integer: " + i);
        System.out.println("short: " + s);
        System.out.println("byte: " + b);
        System.out.println("char: " + c);
    }

    public static void doDecimalCast() {
        // The maximum value of float is 224*(10^104)
        double d = 225.0 * Math.pow(10.0, 104);
        float f = (float) d;
        int i = (int) f;

        System.out.println("Double: " + d);
        System.out.println("Float: " + f);
        System.out.println("Integer: " + i);
    }

    public static void main(String[] args) {
        doIntegerCast();
        System.out.println();
        doDecimalCast();
    }
}
