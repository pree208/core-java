class Calc {
  int num1;
  int num2;
  int result;

  public Calc() {// constructor
    num1 = 5;
    num2 = 5;
  }

  public Calc(int n) {
    num1 = n;
    num2 = n;
  }

  public Calc(double d) {
    num1 = (int) d;

  }

}

class Main {
  public static void main(String[] args) {
    Calc obj = new Calc(7.5);// constructor

    System.out.println(obj.num1);

  }
}