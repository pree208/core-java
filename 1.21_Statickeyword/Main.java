/**
 * Main
 */

// class Emp {
// int eid;
// int salary;
// static String ceo;// when we use static method every object with this
// variable has same value

// public void show() {
// System.out.println(eid + ":" + salary + ":" + ceo);
// }
// }

// public class Main {

// public static void main(String[] args) {
// Emp preethi = new Emp();
// preethi.eid = 1;
// preethi.salary = 100000;
// preethi.ceo = "sam";

// Emp subi = new Emp();
// subi.eid = 2;
// subi.salary = 20000;
// subi.ceo = "sam";

// subi.ceo = "san";

// preethi.show();
// subi.show();
// }
// }

class Emp {
  int eid;
  int salary;
  static String ceo;

  static {// static//when you load the class
    ceo = "priya";
  }

  public Emp() {// when you create object
    eid = 1;
    salary = 10000;
  }

  public void show() {
    System.out.println(eid + ":" + salary + ":" + ceo);
  }
}

public class Main {

  public static void main(String[] args) {
    Emp preethi = new Emp();

    Emp subi = new Emp();

    preethi.show();
    subi.show();
  }
}