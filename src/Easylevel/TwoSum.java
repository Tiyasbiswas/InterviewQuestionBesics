package Easylevel;

import java.util.Scanner;

public class TwoSum {

	public static int[]twosumcheck(int nums[],int target){
	for (int j=0;j<nums.length-1;j++) {
		
		for ( int k=j+1;k<nums.length;k++) {
			
            if (nums[j]+nums[k]==target) {
            	
            	return new int[] { j, k };
          }
		   }
		}	
	 return new int[]{-1 , -1};			
	 
}

public static void main(String[] args) {  
	Scanner userInput= new Scanner(System.in);
	
	int numele = userInput.nextInt();
	
	System.out.println(" Enter the desired input");
	
    int[] arr = new int[numele];

    for(int i = 0; i < numele; i++) {
        arr[i] = userInput.nextInt();
    }
    System.out.println("The Elements Are" +arr);
    int target = userInput.nextInt();

    userInput.close();
 
    for(int x : twosumcheck(arr,target))
        System.out.print(x + " ");
}

}
