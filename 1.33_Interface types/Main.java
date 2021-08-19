
//functional interface

interface Abc {// interface with only one method //functional interface
  void show();
}

public class Main {
  public static void main(String[] args) {
    Abc obj = () -> System.out.println("I am best");// lambda expression format

    obj.show();
  }
}