package HardLevel;

import java.util.Scanner;

public class IntegerToEnglish {
	
	 
		 
		    public final static  String unitNumberWords[]= new String[] {"","One","Two","Three","Four","Five","Six","Seven","Eight","Nine"};
			public final static  String tenplaceWords[]= new String[] {"Ten","Eleven","Twelve","Thirteen","Fourteen","Fifteen","Sixteen","Seventeen","Eighteen","Nineteen"};	
		    public final static  String[] belowHundred = new String[] {"", "Ten", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"};
		
		    public static String numberToWords(int number) {
		        if (number == 0) return "Zero";
		        return calculateNumber(number); 
		    }
		    
		    public static String calculateNumber(int number) { 
		      
	        String result = new String();	      
	         if (number < 10) result = unitNumberWords[number];
	        else if (number < 20) result = tenplaceWords[number -10];
	        else if (number < 100) result = belowHundred[number/10] + " " + calculateNumber(number % 10);
	        else if (number < 1000) result = calculateNumber(number/100) + " Hundred " +  calculateNumber(number % 100);
	        else if (number < 1000000) result = calculateNumber(number/1000) + " Thousand " +  calculateNumber(number % 1000);
	        else if (number < 1000000000) result = calculateNumber(number/1000000) + " Million " +  calculateNumber(number % 1000000);
	        else result = calculateNumber(number/1000000000) + " Billion " + calculateNumber(number % 1000000000);
	        return result.trim();
	    }

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int number= sc.nextInt(); 
		String result=numberToWords(number);
		sc.close();
		 System.out.println(" The result  Converted English is--"+result);
		 
		
		
	}

}
