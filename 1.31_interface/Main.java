// interface Writer {
// void write();//by default abstract

// }

// class Pen implements Writer {
// public void write() {
// System.out.println("I am pen");
// }
// }

// class Pencil implements Writer {
// public void write() {
// System.out.println("I am pencil");
// }
// }

// class Kit {
// public void doSomething(Writer p) {
// p.write();
// }
// }

// class Main {
// public static void main(String[] args) {
// Kit k = new Kit();
// Writer p = new Pen();
// Writer pc = new Pencil();
// k.doSomething(pc);
// }
// }

/**
 * Main
 */

interface Abc {
  void show();
}

class Implementor implements Abc {
  public void show() {
    System.out.println("Anything");
  }
}

public class Main {

  public static void main(String[] args) {
    Abc obj = new Implementor();
    obj.show();
  }
}