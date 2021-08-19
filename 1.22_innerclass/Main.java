
class Outer {
  static int a;

  public static void show() {

  }

  static class Inner {// class inside a class is innerclass
    public void display() {
      System.out.println("display");
    }
  }
}

class Main {
  public static void main(String[] args) {
    Outer obj = new Outer();
    // obj.show();

    // Outer.Inner obj1 = obj.new Inner();// inner class obj//member class
    Outer.Inner obj1 = new Outer.Inner();// static class
    obj1.display();
  }
}