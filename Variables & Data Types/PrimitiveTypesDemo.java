//1. Declare variables of all primitive types and print them.
public class PrimitiveTypesDemo {
    public static void main(String[] args) {

        // All Primitive Data Types
        byte a = 10;            // 1 byte
        short b = 200;          // 2 bytes
        int c = 5000;           // 4 bytes
        long d = 100000L;       // 8 bytes

        float e = 5.75f;        // 4 bytes
        double f = 19.99;       // 8 bytes

        char g = 'A';           // 2 bytes (Unicode)
        boolean h = true;       // 1 bit (JVM dependent)

        // Printing all variables
        System.out.println("byte: " + a);
        System.out.println("short: " + b);
        System.out.println("int: " + c);
        System.out.println("long: " + d);
        System.out.println("float: " + e);
        System.out.println("double: " + f);
        System.out.println("char: " + g);
        System.out.println("boolean: " + h);
    }
}
