package com.dsaps.arrays;

import java.util.Arrays;

/*
 * Given a 1-indexed array of integers numbers that is already sorted in non-decreasing order, 
 * find two numbers such that they add up to a specific target number. 
 * Let these two numbers be numbers[index1] and numbers[index2] where 1 <= index1 < index2 <= numbers.length.
   Return the indices of the two numbers, index1 and index2, added by one as an integer array [index1, index2] of length 2.
   The tests are generated such that there is exactly one solution. You may not use the same element twice.
 */
public class TwoNumSumType2 {
    
    public static void main(String[] args) {
    	int[] nums = new int[] {2,3,4};
        int target = 6;
        System.out.println(Arrays.toString(TwoNumSumType2.Solution.twoSum(nums, target)));
	}
    
    static class Solution{
    	//Time: O(n)
    	//Space: O(1)
    	public static int[] twoSum(int[] numbers, int target) {
    		int left = 0;
    		int right = numbers.length -1;
    		while(left < right) {
    			int currentSum = numbers[left] + numbers[right];
    			if(currentSum == target) {
    				return new int[] {left+1, right+1};
    			}else if(currentSum < target) {
    				left++;
    			}else {
    				right--;
    			}
    		}
    		return null;
        }
    }
    
}
