import java.util.Arrays;

/**
 * Main
 */
public class Main {
  public static void main(String[] args) {
    // int[] numbers = new int[5];// array is ref datatype
    // numbers[0] = 1;
    // numbers[1] = 2;

    // System.out.println(Arrays.toString(numbers));
    // int[] numbers = { 2, 3, 4, 6, 5 };
    // Arrays.sort(numbers);// sort the number array
    // System.out.println(numbers.length);// gives the length of the array
    // System.out.println(Arrays.toString(numbers));

    // **multi dimensional arrays */
    // two dimensional array

    // int[][] numbers = new int[2][3];// two row and 3 column matrix
    // numbers[0][0] = 2;
    // System.out.println(Arrays.deepToString(numbers));// for multidimension array
    // use deepToString

    // matrix using curly braces
    int[][] numbers = { { 1, 2, 3 }, { 4, 5, 6 } };
    System.out.println(Arrays.deepToString(numbers));
  }
}
