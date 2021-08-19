
/**
 * Main
 */
class A {
  public void show() {
    System.out.println("in A");
  }
}

class B extends A {
  public void show() {
    System.out.println("in B");
  }
}

class C extends A {
  public void show() {
    System.out.println("in C");
  }
}

public class Main {
  public static void main(String[] args) {
    A obj = new B();// reference of super class and object of sub class//runtime polymorphism
    obj.show();

    obj = new C();// calling other obj is dynamic method dispatch
    obj.show();
  }

}
