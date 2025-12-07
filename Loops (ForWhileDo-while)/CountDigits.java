//Count digits of a number.
import java.util.Scanner;
public class CountDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        int count = 0;

        // Handle the case when the number is 0
        if (number == 0) {
            count = 1;
        } else {
            // Count digits for non-zero numbers
            while (number != 0) {
                number /= 10;
                count++;
            }
        }

        System.out.println("Number of digits: " + count);
        scanner.close();
    }
}
