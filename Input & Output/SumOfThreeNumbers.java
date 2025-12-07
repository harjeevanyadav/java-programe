// Input three numbers and find their sum.
import java.util.Scanner;
public class SumOfThreeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();

        System.out.print("Enter third number: ");
        int num3 = scanner.nextInt();

        int sum = num1 + num2 + num3;

        System.out.println("The sum of the three numbers is: " + sum);

        scanner.close();
    }
}