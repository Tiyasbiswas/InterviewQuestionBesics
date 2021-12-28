package Easylevel;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {
	
	public static boolean checkDuplicate(int arr[]) {
		/*
		 * for (int i=0;i<n-1;i++) { for (int j=i+1;j<n;j++) { if (arr[i]==arr[j])
		 * return true;
		 * 
		 * } }
		 */
		/*
		 * Long distinctCount = Stream.of(arr).distinct().count(); return arr.length !=
		 * distinctCount;
		 */
		
		
		Set<Integer> item = new HashSet<Integer>();
        
        for(int i = 0; i < arr.length ; i++) 
        {
            //If same integer is already present then add method will return FALSE 

            if(item.add(arr[i]) == false) 
            {
            	return true;
            }
        }
		return false;
	}
	public static void main(String[] args) {
		int arr[]= new int [] {1,3,1,2,3,2,4};
		System.out.println(checkDuplicate(arr));

	}

}
