import java.text.NumberFormat;
import java.util.Scanner;

/**
 * Main
 */
public class Main {

  public static void main(String[] args) {
    final byte Month_In_Year = 12;
    final byte Percentage = 100;

    int principal = 0;
    float Monthly_Interest = 0;
    float Monthly_Interest_Rate = 0;
    int number_Of_Payment = 0;

    Scanner scanner = new Scanner(System.in);

    while (true) {
      System.out.println("Principal:");
      principal = scanner.nextInt();
      if (principal >= 1000 && principal <= 1_000_000)
        break;

      System.out.println("Enter a value between 1000 and 1_000_000");
    }

    while (true) {
      System.out.println("Annual interest rate:");
      Float Annual_Interest_Rate = scanner.nextFloat();
      if (Annual_Interest_Rate >= 1 && Annual_Interest_Rate <= 30) {
        Monthly_Interest = Annual_Interest_Rate / Percentage;
        Monthly_Interest_Rate = Monthly_Interest / Month_In_Year;
        break;
      }
      System.out.println("enter value between 1 and 30");
    }

    // System.out.println(Monthly_Interest_Rate);

    while (true) {
      System.out.println("Period:");
      byte number_Of_Years = scanner.nextByte();
      if (number_Of_Years >= 1 && number_Of_Years <= 30) {
        number_Of_Payment = number_Of_Years * 12;
        break;
      }
      System.out.println("Enter the value between 1 and 30");

    }
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