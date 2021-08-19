
/**
 * Main
 */

// encapsulation-binding data with methods-access the variables inside the
// methods
class Student {
  private int rollno;
  private String name;

  public int getRollno() {
    return rollno;
  }

  public void setRollno(int rollno) {
    this.rollno = rollno;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

}

public class Main {

  public static void main(String[] args) {
    Student s1 = new Student();
    s1.getName();
    s1.setRollno(5);

    System.out.println(s1.getRollno());
  }

}
