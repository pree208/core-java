
class A {
  public A() {
    System.out.println("A");
  }

  public A(int i) {
    System.out.println("A int");
  }
}

class B extends A {
  public B() {
    System.out.println("B");
  }

  public B(int i) {
    super(i);
    System.out.println("B int");
  }
}

class Main {
  public static void main(String[] args) {
    B obj = new B(5);// if we use parameters then it will call default constructor of parent class.so
                     // use super keyword in sub class constructor to specify the parameters
  }
}