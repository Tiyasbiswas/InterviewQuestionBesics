package Easylevel;

import java.util.Scanner;
//You are given a positive integer num consisting only of digits 6 and 9.
//
//        Return the maximum number you can get by changing at most one digit (6 becomes 9, and 9 becomes 6).
//        https://leetcode.com/problems/maximum-69-number/

public class Maximum69Number {

    public static int checkMaximum69Number(int num){
        char[] charNum = String.valueOf(num).toCharArray();
        for(int i=0;i<charNum.length;i++){
            if(charNum[i] =='6'){
                charNum[i] ='9';
             break;
            }
        }
        return Integer.valueOf(String.valueOf(charNum));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The number");
        int num= sc.nextInt();
         System.out.println(checkMaximum69Number(num));
    }
}
