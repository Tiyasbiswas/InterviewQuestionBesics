package Easylevel;

public class RemoveElement {
    public static int removeElement(int[] nums, int val) {
        // Counter for keeping track of elements other than val
        int count = 0;
        // Loop through all the elements of the array
        for (int i = 0; i < nums.length; i++) {
            // If the element is not val
            if (nums[i] != val) {
                nums[count++] = nums[i];
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int num[] = {3, 2, 2, 3};
        int key=3;
       System.out.println(removeElement(num,key));
    }
}
