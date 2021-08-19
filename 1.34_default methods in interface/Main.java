//abstract class->define and declare methods
//interface->declare->1.7
//1.8 can define methods in interface

interface Demo {

  void abc();

  default void show() {// to define methods in interface the method should be default
    System.out.println("in show");
  }
}

class DemoImp implements Demo {
  public void abc() {
    System.out.println("in abc");
  }
}

/**
 * InnerMain
 */
public class Main {
  public static void main(String[] args) {
    Demo obj = new DemoImp();
    obj.show();
    obj.abc();
  }

}