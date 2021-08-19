// Anonymous class

// class A {
//   void show() {
//     System.out.println("I'm A");
//   }
// }

// public class Main {

//   public static void main(String[] args) {
//     A obj = new A() {
//       void show() {// anonymous class//if the purpose is only method overriding it is used
//         System.out.println("Im best");
//       }
//     };
//     obj.show();
//   }
// }

//Anonymous class with interface
interface Abc {
  void show();
}

public class Main {

  public static void main(String[] args) {
    Abc obj = new Abc() {
      public void show() {// anonymous class
        System.out.println("Anything");
      }
    };
    obj.show();
  }
}