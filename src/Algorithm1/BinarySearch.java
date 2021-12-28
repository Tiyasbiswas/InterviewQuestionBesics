package Algorithm1;

public class BinarySearch {
	
	/*
	 * public static int checkSearchElemnt(int []num,int key,int low,int high) { int
	 * mid = low + ((high - low) / 2);
	 * 
	 * if (high < low) { return -1; }
	 * 
	 * if (key == num[mid]) { return mid; } else if (key < num[mid]) { return
	 * checkSearchElemnt( num, key, low, mid - 1); } else { return
	 * checkSearchElemnt( num, key, mid + 1, high); }
	 */	
	  
	 public static int checkSearchElemnt(int []nums,int key) { 
	  int low = 0, high = nums.length -1, mid;
      while(low <= high){
          mid = (low + high)/2;
          if (nums[mid] == key)
              return mid;
          if(key < nums[mid]){
              high = mid-1;
          }else
              low = mid+1;
      }
      return -1;
	}
	

	public static void main(String[] args) {
	int num[] =new int [] {-1,0,3,5,9,12};
	int key=9;
	int low=0;
	int high=num.length-1;
	//System.out.println(checkSearchElemnt(num,key,low,high));
	System.out.println(checkSearchElemnt(num,key));

	}

}
