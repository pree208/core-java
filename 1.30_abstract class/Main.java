abstract class Human {// abs class//can create ref of abstract class and obj of sub class
  public abstract void eat();// abs method//to declare methods

  public void walk() {
    System.out.println("walk");
  }
}

class Man extends Human {
  public void eat() {
    System.out.println("eat");
  }
}

public class Main {
  public static void main(String[] args) {
    Human obj = new Man();
  }
}


//abstract class example

abstract class Writer {
  abstract public void write();

}

class Pen extends Writer {
  public void write() {
    System.out.println("I am pen");
  }
}

class Pencil extends Writer {
  public void write() {
    System.out.println("I am pencil");
  }
}

class Kit {
  public void doSomething(Writer p) {
    p.write();
  }
}

class Main {
  public static void main(String[] args) {
    Kit k = new Kit();
    Writer p = new Pen();
    Writer pc = new Pencil();
    k.doSomething(pc);
  }
}