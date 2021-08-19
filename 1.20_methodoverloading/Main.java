
class Casio {// multiple methods with same name but different parameter in a class is method
             // overloading

  public void add(int i, int j) {
    System.out.println(i + j);
  }

  public void add(int i, int j, int k) {
    System.out.println(i + j + k);
  }

  public void add(double i, double j) {
    System.out.println(i + j);
  }
  // int num1;
  // int num2;
  // String operation;

  // public Casio() {//constructor with same name and different parameters is
  // constructor overloading
  // num1 = 0;
  // num2 = 0;
  // operation = "hii";
  // }

  // public Casio(int i) {
  // num1 = i;
  // num2 = 0;
  // operation = "hii";
  // }

  // public Casio(int i, int j) {
  // num1 = i;
  // num2 = j;
  // operation = "hii";
  // }
}

public class Main {
  public static void main(String[] args) {
    Casio obj = new Casio();
    obj.add(1, 2);
    obj.add(1, 2, 3);
    obj.add(1.1, 2.3);
  }

}
