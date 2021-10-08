public class Main {

    static int a;

    public static void declarePrimitivesWithoutInit() {
        int i;
        byte b;
        char c;
        double d;
        float f;
        long l;
        boolean bl;
        short s;
    }

    private static void printPrimitives(int i, byte b, char c, double d, float f, long l, boolean bl, short s) {
        System.out.println("Print, using println");
        System.out.println("int (decimal): " + i);
        System.out.println("int (hex): " + Integer.toHexString(i));
        System.out.println("byte: " + b);
        System.out.println("char: " + c);
        System.out.println("double: " + d);
        System.out.println("float: " + f);
        System.out.println("long: " + l);
        System.out.println("boolean: " + bl);
        System.out.println("short: " + s);

        System.out.println("\nPrint, using printf");
        System.out.printf("int (decimal): %d%n", i);
        System.out.printf("int (hex): %s%n", Integer.toHexString(i));
        System.out.printf("byte: %b%n", b);
        System.out.printf("char: %c%n", c);
        System.out.printf("double: %f%n", d);
        System.out.printf("float: %f%n", f);
        System.out.printf("long: %d%n", l);
        System.out.printf("boolean: %b%n", bl);
        System.out.printf("short: %d%n", s);
    }

    public static void printPrimitivesWithInit() {
        int i = 20;
        byte b = 2;
        char c = 'a';
        double d = 1.0;
        float f = 1.0f;
        long l = 12345678987654321L;
        boolean bl = true;
        short s = 1;

        printPrimitives(i, b, c, d, f, l, bl, s);
    }

    public static void printCalculatedPrimitives() {
        int i = 10 + 20;
        byte b = 1 + 1;
        char c = 'a';
        double d = 1.0 + 2.3;
        float f = 1.0f + 3.5f;
        long l = 12345678987654321L + 3434141L;
        boolean bl = 5 > 3;
        short s = 1 + 3;

        printPrimitives(i, b, c, d, f, l, bl, s);
    }

    public static void main(String[] args) {
        declarePrimitivesWithoutInit();
        printPrimitivesWithInit();
        printCalculatedPrimitives();
    }
}
