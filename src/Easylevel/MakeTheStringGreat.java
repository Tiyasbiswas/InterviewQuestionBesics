package Easylevel;

import java.util.Scanner;
import java.util.Stack;

public class MakeTheStringGreat {

     public static String convertMakeTheStringGreat(String str){

         Stack<Character> stack= new Stack<>();
         for(int i=0;i<str.length();i++)
         {
             if((!stack.isEmpty()) && Math.abs(stack.peek()-str.charAt(i))==32 )
                 stack.pop();
             else
                 stack.push(str.charAt(i));
         }
         char res[]= new char[stack.size()];

         for(int i=res.length-1;i>=0;i--)
             res[i]= stack.pop();
         return new String(res);

     }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The String :");
        String str= sc.nextLine();
        System.out.println(convertMakeTheStringGreat(str));
    }
}
