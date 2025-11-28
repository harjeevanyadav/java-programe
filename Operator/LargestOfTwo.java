//3. Find the largest of two numbers using ternary operator.
public class LargestOfTwo {
    public static void main(String[] args) {

        int a = 15;
        int b = 25;

        int largest = (a > b) ? a : b;   // Ternary operator

        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("Largest number = " + largest);
    }
}
