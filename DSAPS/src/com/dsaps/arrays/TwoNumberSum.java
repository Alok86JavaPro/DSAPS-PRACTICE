package com.dsaps.arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.IntStream;

public class TwoNumberSum {
	 public static void main(String[] args) {
		int arrays[] = IntStream.of(3, 5, -4, 8, 11, 1, -1, 6).toArray();
		int target = 10;
//		System.out.println(Arrays.toString(TwoNumberSum.Solution1.findTwoNumSum(arrays, target)));
//		System.out.println(Arrays.toString(TwoNumberSum.Solution2.findTwoNumSum(arrays, target)));
		System.out.println(Arrays.toString(TwoNumberSum.Solution3.findTwoNumSum(arrays, target)));
	}
	 
	 static class Solution1{
		 //Time complexicity = O(n2)
		 //Space complexicity = O(1)
		 
		 public static int[] findTwoNumSum(int inputArrays[], int target) {
			 for(int i =0 ; i < inputArrays.length -1; i++) {
				 for(int j = i +1; j < inputArrays.length; j++) {
					 if(inputArrays[i] + inputArrays[j] == target) {
						 return new int[] {inputArrays[i],inputArrays[j]};
					 }
				 }
			 }
			 return new int[2];
		 }
	 }
     
	 static class Solution2{
		 //Time complexicity = O(n)
		 //Space complexicity = O(n)
		 public static int[] findTwoNumSum(int array[], int target) {
			 Map<Integer,Integer> map = new  HashMap<Integer, Integer> ();
			 for(int i = 0; i<array.length; i ++) {
				 int secondNum = target - array[i];
				 if(map.containsKey(secondNum)) {
					 return new int [] {array[i],secondNum};
				 }else {
					 map.put(array[i], secondNum);
				 }
			 }
			 return new int[2];
		 }
	 }
	 
	 static class Solution3{
		 //Time complexicity = O(n)
		 //Space complexicity = O(1)
		 public static int[] findTwoNumSum(int array[], int target) {
			 Arrays.sort(array);
			 int left = 0;
			 int right = array.length -1;
			 while(left < right) {
				 int cureentSum = array[left] + array[right];
				 if( cureentSum == target) {
					 return new int[] {array[left],array[right]};
				 }else if(cureentSum < target) {
					 left++;
				 }else if(cureentSum > target) {
					 right--;
				 }
			 }
			 return new int[2];
		 }
	 }
}
