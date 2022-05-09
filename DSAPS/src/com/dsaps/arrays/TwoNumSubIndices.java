package com.dsaps.arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/*
 * Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
   You may assume that each input would have exactly one solution, and you may not use the same element twice.
   You can return the answer in any order.
 */
public class TwoNumSubIndices {
   public static void main(String[] args) {
	int[] nums =  new int[] {2,7,11,15};
	int target = 9;
//	System.out.println(Arrays.toString(TwoNumSubIndices.Solution1.twoNumberSum(nums, target)));
//	System.out.println(Arrays.toString(TwoNumSubIndices.Solution2.twoNumberSum(nums, target)));
	System.out.println(Arrays.toString(TwoNumSubIndices.Solution3.twoNumberSum(nums, target)));
  }
   static class Solution1{
	   //Time: O(n2)
	   //Space:O(1)
	   public static int[] twoNumberSum(int[] nums, int target) {
		   for(int i = 0; i<nums.length;i++) {
			   for(int j = i+ 1; j< nums.length; j++) {
				   if(nums[i] + nums[j] == target) {
					   return new int[] {i,j};
				   }
			   }
		   }
		   return null;
	   }
   }
   
   static class Solution2{
	   //Time: O(n)
	   //Space:O(n)
	   public static int[] twoNumberSum(int[] nums, int target) {
		   Map<Integer,Integer> track = new HashMap<Integer, Integer>();
		   for(int i = 0 ; i<nums.length; i++) {
			   int curr = nums[i];
			   //curr + x = target
			   // x = target - curr;
			   int x = target - curr;
			   if(track.containsKey(x)) {
				   return new int[] {track.get(x),i};
			   }
			   track.put(curr, i);
		   }
		   return null;
	   }
   }
   /*
    * This solution provide two number which sum equals to target in O(n) time complexity and O(1) space complexity. 
    * But we have to sort input array in non decreasing order.
    */
   static class Solution3{
	   //Time: O(n)
	   //Space:O(1)
	   public static int[] twoNumberSum(int[] nums, int target) {
		   Arrays.sort(nums);
		   int l = 0;
		   int r = nums.length -1;
		   while(l < r) {
			   int currSum = nums[l] + nums[r];
			   if(currSum == target) {
				   return new int[] {l,r};
			   }else if(currSum < target) {
				   l++;
			   }else if(currSum > target) {
				   r--;
			   }
		   }
		   return null;
	   }
   }
   
   
}
