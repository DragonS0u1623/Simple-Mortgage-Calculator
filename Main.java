import java.text.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double monthlyRate, mortgage;
        int principle, periodInYears;

        System.out.print("Principle: ");
        principle = sc.nextInt();
        System.out.print("Annual Rate: ");
        monthlyRate = sc.nextDouble() / 100 / 12;
        System.out.print("Period (Years): ");
        periodInYears = sc.nextInt();
        sc.close();

       int periodInMonths = periodInYears * 12;

        mortgage = principle * 
                (monthlyRate * Math.pow(1 + monthlyRate, periodInMonths)) / 
                (Math.pow(1 + monthlyRate, periodInMonths) - 1);
        System.out.println("Mortgage: " + NumberFormat.getCurrencyInstance().format(mortgage));
    }
}
/**
 * Asks for Principle, Annual Interest Rate, Period in Years
 * Outputs: Mortgage in Monthly payments formatted with currency format
 */