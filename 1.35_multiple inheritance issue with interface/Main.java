interface Demo {
  void abc();

  default void show() {
    System.out.println("in demo show");
  }
}

interface MyDemo {

  default void show() {
    System.out.println("in mydemo show");
  }
}

class DemoImp implements Demo, MyDemo {
  public void abc() {
    System.out.println("in abc");
  }

  public void show() {
    MyDemo.super.show();// super keyword is used to access the method of interface
  }
}

public class Main {
  public static void main(String[] args) {
    Demo obj = new DemoImp();
    obj.abc();
    obj.show();
  }
}