
class Calc {
  int num1;
  int num2;
  int result;

  public void perform() {
    result = num1 + num2;

  }
}

class Main {
  public static void main(String[] args) {
    Calc obj = new Calc();// ref
    obj.num1 = 3;
    obj.num2 = 4;
    obj.perform();

    System.out.println(obj.result);

  }
}