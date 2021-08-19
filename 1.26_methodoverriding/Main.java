/**
 * Main
 */

// child class method overrides the parent class method,this is called method
// overriding
class A {
  int i;

  public void show() {
    System.out.println("in A");
  }
}

class B extends A {

  int i;

  public void show() {
    super.i = 8;// it refers the class A
    super.show();// this calls the method show in class A
    System.out.println("in B");
  }
}

public class Main {

  public static void main(String[] args) {
    B obj = new B();
    obj.show();
  }
}