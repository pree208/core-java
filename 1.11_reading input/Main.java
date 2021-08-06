import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    // System.out.println("Age:");
    // byte age = scanner.nextByte();
    // System.out.println("You are " + age);
    System.out.print("Name:");
    // String name = scanner.next();// returns only one token
    String name = scanner.nextLine().trim();
    System.out.println("You are " + name);

  }
}