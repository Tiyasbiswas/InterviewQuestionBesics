package Mediumlevel;


import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class IntegerToRoman {
	
	public static String checkInttoRoman(int number) {

		 Map< String,Integer> mapelement = new LinkedHashMap<>();
		 mapelement.put("M", 1000);
		 mapelement.put("CM", 900);
		 mapelement.put("D", 500);
		 mapelement.put("CD", 400);
		 mapelement.put("C", 100);
		 mapelement.put("XC", 90);
		 mapelement.put("L", 50);
		 mapelement.put("XL", 40);
		 mapelement.put("X", 10);
		 mapelement.put("IX", 9);
		 mapelement.put("V", 5);
		 mapelement.put("IV", 4);
		 mapelement.put("I", 1);

    StringBuilder sbobj= new StringBuilder();
    for (Map.Entry<String,Integer> entry :mapelement.entrySet()) // to traverse the loop
    {
    	while ( number >=entry.getValue()) {
    		number=number-entry.getValue();
    		sbobj.append(entry.getKey());
    	}
    	
    }
	return sbobj.toString();
		}
	
	public static void main(String[] args) {
		  Scanner sc = new Scanner(System.in);
		    System.out.println(" Enter the Element you desired to check ::");
		    int number=sc.nextInt();
		    String result=checkInttoRoman(number);
		    sc.close();
		    System.out.println("The Roman Number is: "+number);
		    System.out.println("Its Integer Value is: "+result);

	}

	
	}