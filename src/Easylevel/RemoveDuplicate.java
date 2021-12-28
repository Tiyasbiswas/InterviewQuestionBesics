package Easylevel;

import java.util.Arrays;

public class RemoveDuplicate {
	public static int returnDuplicate(int arr[],int n) {

		 // accessing the elements of the specified array
		 int [] temp= new int[n];// creating one temporary array
		 int count=0;// for number of duplicate element
		  if (n==0) {
			return 0;  
		  }
		 
		 
		for (int i = 0; i < arr.length-1; i++) {
		 // System.out.println("Element at index " + i +  " : "+ arr[i]);
			if (arr[i] != arr[i+1]) {
				temp[count++]=arr[i];
			}
		}
		temp[count++]=arr[n-1];
		System.out.println(Arrays.toString(temp)); 
		
		for ( int k=0;k<count;k++) {
			arr[k]=temp[k];
		}
		
		
		//return 	Arrays.stream(arr).distinct().toArray();	
		return count;
	}

	public static void main(String[] args) {
		
	int[] arr = new int[] {};
	int len=arr.length;
	//int res[]=returnDuplicate(arr,len);
	int res=returnDuplicate(arr,len);
	//System.out.println(" Duplicated removed array"+Arrays.toString(res));
      System.out.println(" Duplicated removed array"+res);
		
	}

}
