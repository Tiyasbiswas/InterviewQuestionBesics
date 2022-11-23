package Easylevel;

import java.util.*;

public class PascalsTriangleI {
  /*  public static void paskaltringle(int n) {
        // An auxiliary array to store generated pascal triangle values
        int[][] arr = new int[n][n];

      // Iterate through every line and print integer(s) in it
        for (int row = 0; row < n; row++) {
            // Every line has number of integers equal to line number
            for (int i = 0; i <= row; i++) {
                // First and last values in every row are 1
                if (row == i || i == 0)
                    arr[row][i] = 1;
                else // Other values are sum of values just above and left of above
                    arr[row][i] = arr[row - 1][i - 1] + arr[row - 1][i];
                System.out.print(arr[row][i]);
            }
            System.out.println("");
        }
    }*/
  public static List<List<Integer>> paskaltringle(int numRows) {

      List<List<Integer>> result= new ArrayList<>();

      if(numRows <= 0)
          return result;

      ArrayList<Integer> previous = new ArrayList<Integer>();
      previous.add(1);
      result.add(previous);
      System.out.println(result);
      for (int i = 2; i <= numRows; i++) {
          ArrayList<Integer> current = new ArrayList<Integer>();
          System.out.println(" added first element");
          current.add(1); //first
          System.out.println("elements are "+current);
          for (int j = 0; j < previous.size() - 1; j++) {
              current.add(previous.get(j) + previous.get(j + 1)); //middle
              System.out.println(" middle elements are calculated here"+current);
          }
          System.out.println(" added last element");
          current.add(1); //last
          System.out.println("elements are "+current);

          result.add(current);
          previous = current;
      }

      return result;
  }

    public static void main(String[] args) {
        List<List<Integer>> result = paskaltringle(5);
        System.out.println(Arrays.toString(result.toArray()));

    }
}
