// 7. Write a program to calculate compound interest.
public class CompoundInterest {
    public static void main(String[] args) {

        double principal = 10000;   // P
        double rate = 5;            // R (in %)
        double time = 2;            // T (in years)

        double amount = principal * Math.pow((1 + rate / 100), time);
        double compoundInterest = amount - principal;

        System.out.println("Principal: " + principal);
        System.out.println("Rate: " + rate);
        System.out.println("Time: " + time + " years");
        System.out.println("Compound Interest: " + compoundInterest);
        System.out.println("Total Amount: " + amount);
    }
}
