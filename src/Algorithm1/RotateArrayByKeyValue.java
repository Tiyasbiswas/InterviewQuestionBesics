package Algorithm1;

import java.util.Arrays;

public class RotateArrayByKeyValue {

		/*
		 * int n=arr.length; int temp[]=new int[n];
		 * 
		 * // Copying in array temp for (int i = 0; i < n; i++) { temp[i] = arr[i]; } //
		 * Moving the rest element to index zero to N-d for (int i=key;i<n;i++) {
		 * arr[i-key]=arr[i]; }
		 * 
		 * // Copying the temp array element in origninal array
		 * 
		 * for ( int i=0;i<key;i++) { arr[i+n-key]=temp[i]; }
		 */
	
	public static void rotateArray(int []arr,int key,int n) {

		
		if ( key<=0) 
			return ;
		key=key%n;
			
		  // Reverse the last `k` elements
        reverse(arr, n - key, n - 1);
        System.out.println("after first iteration the Array is::: "+Arrays.toString(arr) );
        // Reverse the first `n-k` elements
        reverse(arr, 0, n - key - 1);
        System.out.println("after second iteration the Array is::: "+Arrays.toString(arr) );

        // Reverse the whole array
        reverse(arr, 0, n - 1);
        System.out.println("after third iteration the Array is::: "+Arrays.toString(arr) );

    }
		
	
	public static void reverse(int[] A, int low, int high)
    {
        for (int i = low, j = high; i < j; i++, j--) {
            swap(A, i, j);
        }
    }
	 public static void swap(int[] A, int i, int j)
	    {
	        int temp = A[i];
	        A[i] = A[j];
	        A[j] = temp;
	    }
	public static void main(String[] args) {
	int arr[]= new int[] {1,2,3,4,5,6,7};
	int key=3;
	int len=arr.length;
	rotateArray(arr,key,len);
	//System.out.println(Arrays.toString(arr));
	
	
	
	}

}
