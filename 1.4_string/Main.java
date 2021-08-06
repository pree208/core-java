public class Main {
  public static void main(String[] args) {
    // String message = " Hello world" + "*!!"; // string are ref type in java +
    // concatenation

    // System.out.println(message.endsWith("!!"));// method ends with return a
    // boolean value
    // System.out.println(message.indexOf("world"));// gives the index of character
    // or word
    // System.out.println(message.replace("!", "."));// replace the target ! to
    // destination .
    // System.out.println(message.toLowerCase());// convert to lowercase
    // System.out.println(message.trim());// removes all the white space
    // System.out.println(message);// "Hello world*!!" //strings are immutable in
    // java

    // add special characters to string
    String message = "hello \"Pree\"";
    message = "c:\\windows\\...";// c:\Windows\...
    message = "c:\n windows\\...";// c: // inserts new line
    // windows\...
    message = "c:\t windows\\...";// inserts a tab
    System.out.println(message);

  }
}