package Easylevel;

import java.util.Scanner;

public class SqrtOfX {
    public static void main(String[] args) {
        int num;
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a number: ");
        num = sc.nextInt();
        int squareroot = (int) Math.pow(num, 0.5);
        System.out.println("The Square of a Given Number  " + num + "  =  " + squareroot);
    }
}
