//6. Convert given days into years, months, and days.
public class DaysConversion {
    public static void main(String[] args) {

        int totalDays = 400;

        int years = totalDays / 365;
        int remainingDays = totalDays % 365;

        int months = remainingDays / 30;
        int days = remainingDays % 30;

        System.out.println("Total Days: " + totalDays);
        System.out.println("Years: " + years);
        System.out.println("Months: " + months);
        System.out.println("Days: " + days);
    }
}
