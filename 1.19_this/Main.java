class Calc {
  int num1;
  int num2;
  int result;

  public Calc(int num1,int num2) {// constructor
   this.num1 = num1;
    this.num2 = num2;
  }

}

class Main {
  public static void main(String[] args) {
    Calc obj = new Calc(7,8);// constructor

    System.out.println(obj.num1);
    System.out.println(obj.num2);

  }
}