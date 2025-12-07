//Take a string input and print its first character.
import java.util.Scanner;
public class FirstCharacter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        
        if (input.length() > 0) {
            char firstChar = input.charAt(0);
            System.out.println("The first character is: " + firstChar);
        } else {
            System.out.println("The string is empty.");
        }
        
        scanner.close();
    }
}