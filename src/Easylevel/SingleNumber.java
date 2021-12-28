package Easylevel;

import java.util.Arrays;
//import java.util.Scanner;

public class SingleNumber {
//every element appears twice except for one. Find that single one.
//You must implement a solution with a linear runtime complexity and use only constant extra space.
	
	
	public static int checkNumberOccurOnce( int [] arr ,int n){
		// [12321]	
		int res = arr[0];

		for ( int i=1;i<n;i++) {
			res = res ^ arr[i];			
		}
	
		return res;
	}
	
	public static void main(String[] args) {
	
    //Scanner sc= new Scanner(System.in);
    System.out.println("enter the number of element you wish to enter");
		/*
		 * int n=sc.nextInt(); int arr[]= new int [n]; for (int i=0;i<n;i++) {
		 * arr[i]=sc.nextInt(); }
		 */
	int[] arr = new int[] {12, 4, 36, 10, 12, 36, 4};
    int len=arr.length;
    System.out.println(" the entered array is" +Arrays. toString(arr));
	 int res=checkNumberOccurOnce(arr,len);
	System.out.println(" The Single occurance is-->"+ res);	
}
}