import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter the number");
    int n = scanner.nextInt();

    if (n % 3 == 0 && n % 5 == 0) {
      System.out.println("fizzBuzz");
    } else if (n % 5 == 0) {
      System.out.println("fizz");
    } else if (n % 3 == 0) {
      System.out.println("Buzz");
    } else {
      System.out.println(n);
    }

  }
}