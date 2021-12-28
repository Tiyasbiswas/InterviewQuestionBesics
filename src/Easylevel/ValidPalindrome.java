package Easylevel;

import java.util.Scanner;

public class ValidPalindrome {
	
	
	public static boolean checkPalindrome(String element) {
		
	
		String newStr=element.toLowerCase().replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(" original  String "+newStr);

		
		StringBuilder sb= new StringBuilder();
		sb.append(newStr);
		sb=sb.reverse();
		System.out.println("Reverse String :::"+sb.toString());
		
		 if ( newStr.equals(sb.toString()))
			 return true;
		
		  
		return false;
		
	}
	
	

	public static void main(String[] args) {
      Scanner sc= new Scanner(System.in);	
      System.out.println(" the String to check");
      String item=sc.nextLine();
            
      System.out.println("the entered string is ::"+item);
     
      System.out.println(" the checked String is-"+ checkPalindrome(item));
      
      
      
	}

}
