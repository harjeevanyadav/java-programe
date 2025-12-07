//. Write a program to demonstrate logical operators (AND, OR, NOT).
public class LogicalOperatorsDemo {
    public static void main(String[] args) {
        boolean a = true;
        boolean b = false;

        // AND operator
        boolean andResult = a && b;
        System.out.println("AND (true && false): " + andResult);

        // OR operator
        boolean orResult = a || b;
        System.out.println("OR (true || false): " + orResult);

        // NOT operator
        boolean notResultA = !a;
        boolean notResultB = !b;
        System.out.println("NOT (!true): " + notResultA);
        System.out.println("NOT (!false): " + notResultB);
    }
}