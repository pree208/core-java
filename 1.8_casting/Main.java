class Main {
  public static void main(String[] args) {
    // implicit casting//no data loss
    // byte>short>int>long>float>double
    // short x = 1;
    // int y = x + 2;// adding a short and int //automatic casting occurs here
    // System.out.println(y);

    // explicit casting
    // double x = 1.1;
    // int y = (int) x + 2;
    // System.out.println(y);

    // String x = "1";// string to int casting
    // int y = Integer.parseInt(x) + 2;
    // System.out.println(y);

    String x = "1.2";// string to int casting
    Double y = Double.parseDouble(x) + 2;
    System.out.println(y);
  }
}