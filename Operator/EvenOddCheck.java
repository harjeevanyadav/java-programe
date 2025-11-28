//2. Write a program to check if a number is even or odd (using modulus operator).
public class EvenOddCheck {
    public static void main(String[] args) {

        int num = 25;

        if (num % 2 == 0) {
            System.out.println(num + " is Even");
        } else {
            System.out.println(num + " is Odd");
        }
    }
}
