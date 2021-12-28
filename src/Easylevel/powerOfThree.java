package Easylevel;

import java.util.Scanner;

/*
a : this parameter is the base
b : this parameter is the exponent.
Return :
This method returns ab.
*/


public class powerOfThree {

	
    public static boolean isPowerOfThree(int number) {

   	 
   	if (number <= 0)
        return false;
   	
   	if ((number % 3)==0) {
		 return isPowerOfThree(number / 3);
	}
	
    if (number == 1)
        return true;
    
    return false;
    	
    	
    }

	public static void main(String[] args) {
     Scanner sc= new Scanner(System.in);
     System.out.println("Enter the desired String ::");
     int number=sc.nextInt();    
     sc.close();
     System.out.println("  Number is power of 3-->"+isPowerOfThree(number));
 
     }
     
	}


