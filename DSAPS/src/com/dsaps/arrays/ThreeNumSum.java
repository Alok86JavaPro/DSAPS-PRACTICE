package com.dsaps.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 * Given an integer array nums, return all the triplets [nums[i], nums[j], nums[k]] 
 * such that i != j, i != k, and j != k, and nums[i] + nums[j] + nums[k] == 0.
 * Notice that the solution set must not contain duplicate triplets.
 */
public class ThreeNumSum {
    public static void main(String[] args) {
		int[] nums = new int[] {-1,0,1,2,-1,-4};
		int target = 0;
		System.out.println(ThreeNumSum.Solution.threeSum(nums));
		int[][] output = new int[][] {{-1,-1,2},{-1,0,1}};
		
	}
    
    static class Solution{
    	
    	public static List<List<Integer>> threeSum(int[] nums){
    		Arrays.sort(nums);
    		List<List<Integer>> res = new ArrayList<>();
    		for(int i = 0; i<nums.length && nums[i] <= 0; i++) {
    			 if(i == 0 || nums[i-1] != nums[i]) {
    				 twoSumII(nums,i,res);
    			 }
    		}
    		
    		return res;
    	}

		private static void twoSumII(int[] nums, int i, List<List<Integer>> res) {
			 int left = i + 1;
			 int right = nums.length -1;
			 while(left < right) {
				 int sum = nums[i] + nums[left] + nums[right];
				 if(sum < 0) {
					 left++;
				 }else if(sum > 0) {
					 right--;
				 }else {
					 res.add(Arrays.asList(nums[i],nums[left],nums[right]));
					 left++;
					 right--;
					 while(left < right && nums[left] == nums[left- 1]) {
						 left++;
					 }
				 }
			 }
		}
    }
}
