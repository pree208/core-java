
interface Demo {
  void abc();

  static void show() {
    System.out.println("hii");
  }
}

class Main {
  public static void main(String[] args) {
    Demo.show();// method in interface
  }
}