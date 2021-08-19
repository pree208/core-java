//single level inheritance  //is-a =when a class extends another class it is IS-a
class Calculator {// parent or super or base
  public int add(int i, int j) {
    return i + j;
  }
}

class CalcAdv extends Calculator {// child or sub class or derived
  public int sub(int i, int j) {
    return i - j;
  }
}

class Main {
  public static void main(String[] args) {
    CalcAdv c1 = new CalcAdv();
    int result1 = c1.add(1, 2);
    int result2 = c1.sub(9, 6);
    System.out.println(result1);
    System.out.println(result2);
  }
}