import java.text.NumberFormat;

/**
 * Main
 */
public class Main {

  public static void main(String[] args) {// numberformat is abstract class
    // NumberFormat currency = NumberFormat.getCurrencyInstance();
    // String result = currency.format(1234567.891);
    // System.out.println(result);

    String result = NumberFormat.getPercentInstance().format(0.1);// method chaining
    System.out.println(result);
  }
}