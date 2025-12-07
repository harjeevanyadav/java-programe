//Take input for name and age, then print them.
public class UserInfo {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        // Taking input for name
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        // Taking input for age
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        // Printing the name and age
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);

        scanner.close();
    }
}