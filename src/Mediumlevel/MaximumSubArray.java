package Easylevel;

/*Given an integer array nums, find the subarray which has the largest sum and return its sum.

   https://leetcode.com/problems/maximum-subarray/?envType=study-plan&id=data-structure-i*/
public class MaximumSubArray {

    public int maxSubArray(int[] arr) {

        int size = arr.length;
        int start = 0;
        int end = 0;

        int maxSoFar = arr[0], maxEndingHere = arr[0];

        for (int i = 1; i < size; i++) {
            if (arr[i] > maxEndingHere + arr[i]) {
                start = i;
                maxEndingHere = arr[i];
            } else
                maxEndingHere = maxEndingHere + arr[i];

            if (maxSoFar < maxEndingHere) {
                maxSoFar = maxEndingHere;
                end = i;
            }
        }
        // logger.info("Found Maximum Subarray between {} and {}", Math.min(start, end), end);
        return maxSoFar;

    }
    public static void main(String[] args) {
    /*    int n = arr.length;
        int maxSum = Integer.MIN_VALUE;

        for (int i = 0; i <= n - 1; i++) {
            int currSum = 0;
            for (int j = i; j <= n - 1; j++) {
                currSum += arr[j];
                if (currSum > maxSum) {
                    maxSum = currSum;
                }
            }
        }

        return maxSum;*/
    }
}
