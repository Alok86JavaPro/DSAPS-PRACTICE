package com.dsaps.arrays.sorting;

import java.util.Arrays;

public class BubbleSort {
  
  public static void main(String[] args) {
	  int[] array =  new int[] {6,5,3,1,8,7,2,4};
	  System.out.println(Arrays.toString(BubbleSort.Solution.sort(array)));
  }
  
	static class Solution {
		//Time: O(n^2)
		//Space: O(1)
		public static int[] sort(int[] array) {
			boolean done = false;
			while(!done) {
				done = true;
				int i = 0;
				int n = array.length;
				while (i < n-1) {
					if (array[i] > array[i + 1]) {
						int temp = array[i + 1];
						array[i + 1] = array[i];
						array[i] = temp;
						done=false;
					}
					i++;
				}
				
				
			}
			return array;
		}
	}
}
