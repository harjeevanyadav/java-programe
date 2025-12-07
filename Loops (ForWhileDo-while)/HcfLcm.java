
import java.util.Scanner;

public class HcfLcm {

    public static void main(String[] args) {    

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");

        int num1 = scanner.nextInt();

        System.out.print("Enter second number: ");

        int num2 = scanner.nextInt();

        scanner.close();

        

        int hcf = 1;

        for(int i = 1; i <= Math.min(num1, num2); i++) {

            if(num1 % i == 0 && num2 % i == 0) {

                hcf = i;

            }

        }

        

        int lcm = (num1 * num2) / hcf;

        

        System.out.println("HCF: " + hcf);

        System.out.println("LCM: " + lcm);

    }

}