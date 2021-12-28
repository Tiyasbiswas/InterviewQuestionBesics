package Easylevel;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class RomanToInteger {
	
	public static int checkRomanToInteger(String value) {
		Map <Character,Integer> numMap= new HashMap<>();
		numMap.put('I',1);
	    numMap.put('V',5);
	    numMap.put('X',10);
	    numMap.put('L',50);
	    numMap.put('C',100);   
	    numMap.put('D',500);   
	    numMap.put('M',1000);  

        int result=0;
        for (int i=0;i<value.length();i++) {
        	char ch=value.charAt(i);// current Roman char
        	
        	//Case 1 --(Value(charAt(i)) >Value(charAt(i-1))
            if(i>0 && numMap.get(ch) > numMap.get(value.charAt(i-1)))
            {
            	//Value(charAt(i)) - 2* Value(charAt(i-1))
              result += numMap.get(ch) - 2*numMap.get(value.charAt(i-1));
            }
            
            // Case 2: just add the corresponding number to result.
            else
              result += numMap.get(ch);
          }
              
          return result;
	}

	public static void main(String[] args) {
	
    Scanner sc = new Scanner(System.in);
    System.out.println(" Enter the Element you desired to check ::");
    String romanNumber=sc.nextLine();
    int result=checkRomanToInteger(romanNumber);
    sc.close();
    System.out.println("The Roman Number is: "+romanNumber);
    System.out.println("Its Integer Value is: "+result);
    
	}

}
