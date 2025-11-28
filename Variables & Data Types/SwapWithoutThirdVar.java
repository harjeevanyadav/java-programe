// 2. Write a program to swap two numbers (without third variable).
public class SwapWithoutThirdVar {
    public static void main(String[] args) {

        int a = 10;
        int b = 20;

        System.out.println("Before swapping:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        // Swapping without third variable
        a = a + b;   // a = 30
        b = a - b;   // b = 10
        a = a - b;   // a = 20

        System.out.println("\nAfter swapping:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
