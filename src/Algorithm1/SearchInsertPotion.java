package Algorithm1;

public class SearchInsertPotion {
	
	
	public static int searchInsert(int [] num,int key) {
		  
	    // Traverse the array
		for ( int i=0;i<num.length;i++) {
	        // If K is found

			if (num[i]==key) {
				return i;

		        // If current array element exceeds K
			}else if (num[i] >key) {
				return i;
			}
		}
		
		
		return -1;
		
	}
	
	

	public static void main(String[] args) {
    int arr[]= new int [] {1,2,4,5,6};
    int key=3;
    int res= searchInsert(arr,key);
     System.out.println(" the index is:::"+res);
	}

}
