import java.text.NumberFormat;
import java.util.Scanner;

/**
 * Main
 */
public class Main {

  public static void main(String[] args) {
    final byte Month_In_Year = 12;
    final byte Percentage = 100;

    Scanner scanner = new Scanner(System.in);
    System.out.println("Principal:");
    int principal = scanner.nextInt();

    System.out.println("Annual interest rate:");
    Float Annual_Interest_Rate = scanner.nextFloat();

    System.out.println("Period:");
    byte number_Of_Years = scanner.nextByte();

    Float Monthly_Interest = Annual_Interest_Rate / Percentage;
    Float Monthly_Interest_Rate = Monthly_Interest / Month_In_Year;
    // System.out.println(Monthly_Interest_Rate);

    int number_Of_Payment = number_Of_Years * 12;

    Double power_Interest = Math.pow(1 + Monthly_Interest_Rate, number_Of_Payment);
    // System.out.println(power_Interest);
    Double Mortage = principal * Monthly_Interest_Rate * power_Interest;
    Double Mortage_Result = Mortage / power_Interest - 1;

    // System.out.println(Mortage);
    // System.out.println(Mortage_Result);
    String mortgageFormatted = NumberFormat.getCurrencyInstance().format(Mortage_Result);
    System.out.println("Mortgage:" + mortgageFormatted);
  }
}