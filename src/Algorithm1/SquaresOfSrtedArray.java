package Algorithm1;

import java.util.Arrays;

public class SquaresOfSrtedArray {
	
	
	public static int[] squareArray(int [] arr) {
		/*
		 * // using build sort function int n=arr.length; for (int i = 0; i < n; i++)
		 * arr[i] = arr[i] * arr[i]; Arrays.sort(arr);
		 */
		int len=arr.length;
		int left=0,right=len-1;
		
		int temp[]= new int [len];
		for ( int i=len-1;i>=0;i--) {
			if (Math.abs(arr[left])>arr[right]) {
				temp[i]=arr[left]*arr[left];
				left++;
			}else {
				temp[i]=arr[right] *arr[right];
				right--;
			}
		}
		 for(int i = 0; i < len; i++)
		        arr[i] = temp[i];
		return arr;
	}

	public static void main(String[] args) {
	
		int arr[]= new int [] {-4,-1,0,3,10};
		System.out.println("Before sort ");
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
       int res[]= squareArray(arr);
        System.out.println("After Sort ");
		/*
		 * for (int i = 0; i < arr.length; i++) System.out.print(arr[i] + " ");
		 */
        System.out.println(Arrays.toString(res));
	}

}
