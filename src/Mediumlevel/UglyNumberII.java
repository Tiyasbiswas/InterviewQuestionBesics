package Mediumlevel;


import java.util.Scanner;
import java.util.TreeSet;

public class UglyNumberII {
    public static int nthUglyNumber(int n) {

        TreeSet<Long> t = new TreeSet<>();
        // Ugly number sequence starts with 1
        t.add(1L);
        int i = 1;
        // when i==n we have the nth ugly number
        while (i < n) {
            // remove the ith ugly number and add back its
            // multiples of 2,3 and 5 back to the set
            long temp = t.pollFirst();
            t.add(temp * 2);
            t.add(temp * 3);
            t.add(temp * 5);
            i++;
            // the first element of set is always the ith
            // ugly number
        }

        return Math.toIntExact(t.pollFirst());
    }


    public static void main(String[] args) {
      Scanner sc= new Scanner(System.in);
      int num= sc.nextInt();
      System.out.println(nthUglyNumber(num));
    }
}
