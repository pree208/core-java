import java.util.Scanner;

/**
 * Main
 */
public class Main {

  public static void main(String[] args) {

    // for loop
    // for (int i = 0; i < 5; i++) {
    // System.out.println("Hello world");
    // }

    // while loop
    // int i = 0;
    // while (i < 5) {
    // System.out.println("Hello world");
    // i++;
    // }

    // break and continue
    // Scanner scanner = new Scanner(System.in);
    // String input = "";
    // while (true) {
    // System.out.println("enter string");
    // input = scanner.next().toLowerCase();
    // if (input.equals("pass"))
    // continue;// moves to beginning of loop
    // if (input.equals("quit"))
    // break;// if input is quit the program breaks//break statement terminates the
    // loop
    // System.out.println(input);
    // }

    // do while loops

    // do {// in do while even if the condition is false the block of code is
    // executed
    // // atleast once
    // System.out.println("enter string");
    // input = scanner.next().toLowerCase();
    // System.out.println(input);
    // } while (!input.equals("quit"));
    String[] fruits = { "Apple", "Mango", "Orange" };
    // for (int i = 0; i < fruits.length; i++) {
    // System.out.println(fruits[i]);
    // }

    // for each loop
    for (String fruit : fruits) {// print each fruits one by one in an array
      System.out.println(fruit);
    }
  }
}