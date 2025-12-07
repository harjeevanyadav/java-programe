//Input marks of 5 subjects and calculate percentage.
import java.util.Scanner;

public class PercentageCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalMarks = 0;
        int numberOfSubjects = 5;

        for (int i = 1; i <= numberOfSubjects; i++) {
            System.out.print("Enter marks for subject " + i + ": ");
            int marks = scanner.nextInt();
            totalMarks += marks;
        }

        double percentage = (totalMarks / (numberOfSubjects * 100.0)) * 100;
        System.out.printf("The percentage is: %.2f%%\n", percentage);
        
        scanner.close();
    }
}