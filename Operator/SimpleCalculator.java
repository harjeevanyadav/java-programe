//6. Write a program for simple calculator (+, -, *, /).
public class SimpleCalculator {
    public static void main(String[] args) {
        double num1 = 10.0;
        double num2 = 5.0;
        char operator = '+'; // Change this to '-', '*', '/' for different operations
        double result;
        switch (operator) {
            case '+':
                result = num1 + num2;
                System.out.println("Addition of two num =" + num1 + " + " + num2 + " = " + result);
                break;
            case '-':
                result = num1 - num2;
                System.out.println("subtration of two num =" + num1 + " - " + num2 + " = " + result);
                break;
            case '*':
                result = num1 * num2;
                System.out.println("multiplition of two num =" + num1 + " * " + num2 + " = " + result);
                break;
            case '/':
                if (num2 != 0) {
                    result = num1 / num2;
                    System.out.println("divide of two num =" + num1 + " / " + num2 + " = " + result);
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                }
                break;
            default:
                System.out.println("Error: Invalid operator.");
                break;
        }
    }
}

    