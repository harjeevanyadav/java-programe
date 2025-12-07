// Write a program to calculate remainder without using modulus operator.
public class RemainderCalculator {
    public static void main(String[] args) {
        int dividend = 29;
        int divisor = 5;

        int remainder = calculateRemainder(dividend, divisor);
        System.out.println("The remainder of " + dividend + " divided by " + divisor + " is: " + remainder);
    }

    public static int calculateRemainder(int dividend, int divisor) {
        int quotient = dividend / divisor;
        int product = quotient * divisor;
        return dividend - product;
    }
}