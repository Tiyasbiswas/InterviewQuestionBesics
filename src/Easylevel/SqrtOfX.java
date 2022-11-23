package Easylevel;

import java.util.Scanner;

//Given a non-negative integer x, return the square root of x rounded down to the nearest integer. The returned integer should be non-negative as well.
//
//        You must not use any built-in exponent function or operator.
//        https://leetcode.com/problems/sqrtx/
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
