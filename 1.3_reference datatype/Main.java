
// import java.util.Date;//adding date class to package

import java.awt.*;

class Main {
  // reference datatypes
  public static void main(String[] args) {
    // Date now = new Date();// new keyword allocate memory for date since it is ref
    // datatype
    // System.out.println(now);
    // }

    // diff between primitive and reference datatype
    // primitive type //x and y are independent since value is stored in memory
    // location
    // byte x = 1;
    // byte y = x;
    // x = 2;
    // System.out.println(y);

    // reference datatype //point1 and point2 are dependent since only adress of the object is stored in memory location
    Point point1 = new Point( x : 1, y : 2);
    Point point2 = point1;
    point1.x = 3;
    System.out.println(point2);
  }
}