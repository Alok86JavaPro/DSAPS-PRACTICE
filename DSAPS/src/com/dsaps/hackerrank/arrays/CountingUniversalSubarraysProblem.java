package com.dsaps.hackerrank.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 * You will be given an array comprised of '2's or '4's. 
 * A subarray  (A subarray is a group of contiguous elements in an array and cannot be empty)  
 * of such an array is called "universal" if it matches the following conditions:
 * 1. The 2's and 4's are grouped consecutively (eg, [4, 2],[2, 4],[4, 4, 2, 2],[2, 2, 4, 4],[4, 4, 4, 2 , 2, 2], etc.).
 * 2. The number of 4's in the subarray is equal to the number of 2's in the subarray.
 * 3. Subarrays with the same element but different positions are treated differently. 
 * For example, there are two [4, 2] subarrays in array[4, 2, 4, 2].
 * You need to return an integer value, the number of "universal" subarrays in a given array.
 * 
 * https://blog.csdn.net/roufoo/article/details/106871656
 */
public class CountingUniversalSubarraysProblem {
    public static void main(String[] args) {
		int[] array = new int[] {4, 4, 2, 2, 4, 2};

		
//		int noOfSubArrays = countingUniversalSubarrays(Arrays.asList(4, 4, 2, 2, 4, 2));
//		System.out.println("noOfSubArrays: "+noOfSubArrays);
		
		int noOfSubArrays = countingUniversalSubarrays(Arrays.asList(4, 4));
		System.out.println("noOfSubArrays: "+noOfSubArrays);
		
		 noOfSubArrays = countingUniversalSubarrays(array);
		System.out.println("noOfSubArrays: "+noOfSubArrays);
	}

	private static int countingUniversalSubarrays(List<Integer> array) {
		if(array.size() <= 1) return 0;
		int result = 0;
		List<Integer> freqes = new ArrayList<Integer>();
		int count = 1;
		for(int i = 1;i< array.size();i++) {
			if(array.get(i) == array.get(i-1)) {
				count++;
			}else {
				freqes.add(count);
				count = 1;
			}
		}
		freqes.add(count);
		System.out.println(freqes);
		for(int i =0 ;i < freqes.size()-1;i++) {
			result += Math.min(freqes.get(i), freqes.get(i+1));
		}
		return result;
	}
	
	private static int countingUniversalSubarrays(int[] array) {
		int n = array.length;
		if(n <= 1) return 0;
		int result = 0;
		List<Integer> freqes = new ArrayList<Integer>();
		int count = 1;
		for(int i = 1;i< n ;i++) {
			if(array[i] == array[i-1]) {
				count++;
			}else {
				freqes.add(count);
				count = 1;
			}
		}
		freqes.add(count);
		System.out.println(freqes);
		for(int i =0 ;i < freqes.size()-1;i++) {
			result += Math.min(freqes.get(i), freqes.get(i+1));
		}
		return result;
	}
}
