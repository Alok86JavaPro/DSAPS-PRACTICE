package com.dsaps.arrays.sorting;

import java.util.Arrays;

public class InsertionSort {
  public static void main(String[] args) {
	  
	   int[] array = {6,5,3,1,8,7,2,4};
	                  
	   
	   System.out.println(Arrays.toString(InsertionSort.Solution.insertionSorting(array)));
  }
  
  static class Solution{
	  //Time: O(n^2)
	  //Space:O(1)
	  public static int[] insertionSorting(int[] array) {
		  for(int i = 1; i < array.length ; i++) {
			  int key = array[i];
			  int j = i;
			  while(j > 0 && array[j-1] > key) {
				  array[j] = array[j-1];
				  j--;
			  }
			  array[j] = key;
		  }
		  return array;
	  }
  }
}
