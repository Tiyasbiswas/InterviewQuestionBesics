package Algorithm1;

public class FirstBad {

	
	
	/*
	 * we have a function isBadVersion(version_id), this will return whether the
	 * version is bad or not. For an example, suppose n = 5, and version = 4 is
	 * first bad version. So if the isBadVersion(3) returns false isBadVersion(5)
	 * returns true, and isBadVersion(4) also returns true, then the first bad
	 * version is 4
	 * 
	 * To solve this, we will follow these steps −
	 * 
	 * When n < 2, then return n Perform binary search approach to detect bad
	 * version using the given function.
	 */
	static boolean isBadVersion(int version) {
		return false;
		
	}
	
	 public static  int firstBadVersion(int n) {
		 
		int low=1,high =n,mid=0;
		while(low<high) {
			mid=low+(high-low)/2;
			if (isBadVersion(mid))
				high=mid;
			else
				low=mid+1;
		}
		 
		return low;
		 
	 }
	public static void main(String[] args) {
		
		int n=5;
	System.out.println(	firstBadVersion(n));
		

	}

}
