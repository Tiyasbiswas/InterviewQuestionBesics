package Mediumlevel;

import java.util.Scanner;

public class ReverseInteger {
     public static int checkReverseInteger(int num){
         boolean isNegative = num < 0 ? true : false; if(isNegative){ num = num * -1; }
          int rim,reversesum=0;
          int top_limit = Integer.MAX_VALUE/10;
          int bottom_limit = Integer.MIN_VALUE/10;

         while(num > 0){
             if(reversesum>top_limit ||reversesum<bottom_limit) return  0;
               rim=num%10;
               num=num/10;
               reversesum=reversesum*10+rim;
           }
        // return reversesum;
         return isNegative == true? reversesum*-1 : reversesum;
     }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The number");
        int num= sc.nextInt();
        System.out.println(checkReverseInteger(num));

    }
}
