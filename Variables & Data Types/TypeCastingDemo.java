//9. Demonstrate type casting from double → int.
public class TypeCastingDemo {
    public static void main(String[] args) {

        double num = 15.75;

        int castedValue = (int) num;   // Explicit type casting

        System.out.println("Original double value: " + num);
        System.out.println("After casting to int: " + castedValue);
    }
}
