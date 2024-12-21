package com.arrays;

public class LongestContinuousIncreasingSubsequence {
    public int findLengthOfLCIS(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        int maxl = 1;
        int currentl= 1;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > nums[i - 1]) {
                currentl++;
                maxl = Math.max(maxl, currentl);
            } else {
                currentl = 1;
            }
        }
        return maxl;

    }

    public static void main(String[] args) {
        int[] nums = {1, 3, 5, 4, 7};
        LongestContinuousIncreasingSubsequence solution = new LongestContinuousIncreasingSubsequence();
        int length = solution.findLengthOfLCIS(nums);
        System.out.println("Length of the longest continuous increasing subsequence: " + length);
    }
}
