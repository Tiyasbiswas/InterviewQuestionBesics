package Easylevel;


public class SearchInsertPosition{

 public static int searchposition(int[] nums,int key){
  //Approach 1
  for ( int i=0;i<nums.length;i++) {
   if (nums[i]==key) {
    return i;
   }else if (nums[i] >key) {
    return i;
   }
  }
  return nums.length;
 }
//  // Approach 2
//  int l = 0 , r = nums.length - 1 , mid , ans = -1;
//  while(l <= r)
//  {
//   mid = l + (r - l) / 2;
//   if(nums[mid] == key)
//    return mid;
//   if(nums[mid] < key)
//   {
//    l = mid + 1;
//    ans = mid + 1;
//   }
//   else
//   {
//    ans = mid;
//    r = mid - 1;
//   }
//  }
//  return ans;
//
//  return nums.length;
 //}
    public static void main(String[] args){

     int[] intArray = {1,3,5,6};
     System.out.println(" Please enter the number to find");
     int key=4;
     int result=searchposition(intArray,key);
     System.out.println(result);

}

}
