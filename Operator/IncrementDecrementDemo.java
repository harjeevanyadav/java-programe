// 7. Demonstrate increment and decrement operators.
public class IncrementDecrementDemo {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;

        // Increment operator
        System.out.println("Initial value of a: " + a);
        a++; // Post-increment
        System.out.println("After post-increment, a: " + a);
        ++a; // Pre-increment
        System.out.println("After pre-increment, a: " + a);

        // Decrement operator
        System.out.println("Initial value of b: " + b);
        b--; // Post-decrement
        System.out.println("After post-decrement, b: " + b);
        --b; // Pre-decrement
        System.out.println("After pre-decrement, b: " + b);
    }
}
