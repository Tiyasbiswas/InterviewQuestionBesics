package Mediumlevel;

import java.util.Arrays;

public class RemoveDuplicateSorted {
	public static int checkDuplicate( int nums[]) {
		 int n=nums.length;
	      int i,numCount=0;
	      // if an empty array then return 0
         if (n==0) {
			return 0;  
		  }
         // traverse every element
         for ( i=0;i<n;i++) {

        	 // validation
             if(i<n-2 && (nums[i]==nums[i+1]) && (nums[i]==nums[i+2])) {
            	 continue;
             }
             else {
                 nums[numCount++] = nums[i];        		 
        	 }
         }
         System.out.println(Arrays.toString(nums));
         
       
       return numCount;
	}

	public static void main(String[] numsrgs) {
		
		int num[]=new int [] {0,0,1,1,1,1,2,3,3};
		int res=checkDuplicate(num);
		System.out.println(""+res);
		
	}

}
