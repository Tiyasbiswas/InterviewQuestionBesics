package Easylevel;

//An ugly number is a positive integer whose prime factors are limited to 2, 3, and 5.
//        Given an integer n, return true if n is an ugly number.
//https://leetcode.com/problems/ugly-number/
public class UglyNumber {
    public static boolean isUgly(int n) {
        if(n==0) return false;
        if(n==1) return true;

        if(n%2==0){
            n/=2;
            return isUgly(n);
        }

        if(n%3==0){
            n/=3;
            return isUgly(n);
        }

        if(n%5==0){
            n/=5;
            return isUgly(n);
        }

        return false;
    }
   /* public static boolean isUgly(int n) {

        while (n != 1)
        {
            if (n % 5 == 0)
            {
                n /= 5;
            }
            else if (n % 3 == 0)
            {
                n /= 3;
            }
            else if (n % 2 == 0)
            {
                n /= 2;
            }
            else
            {
               return false;
            }
        }
        return true;
    }*/
    public static void main(String[] args) {
        int num=14;
        System.out.println(isUgly(num));
    }
}

