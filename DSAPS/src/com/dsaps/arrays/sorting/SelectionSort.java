package com.dsaps.arrays.sorting;

import java.util.Arrays;

public class SelectionSort {
      public static void main(String[] args) {
		int[] array = new int[] {64,25,12,22,11};
		System.out.println(Arrays.toString(SelectionSort.Solution.sort(array)));
	}
      
      static class Solution{
    	  //Time: O(n^2)
    	  //Space: O(1)
    	  public static int[] sort(int[] array) {
    		  int min_index;
    		  for(int i = 0 ; i< array.length -1;i++) {
    			  min_index = i;
    			  for(int j = i +1; j < array.length; j++) {
    				  if(array[j] < array[min_index]) {
    					  min_index = j;
    				  }
    			  }
    			  if(min_index != i) {
    				  int temp = array[min_index];
    				  array[min_index] = array[i];
    				  array[i] = temp;
    			  }
    		  }
    		  
    		  return array;
    	  }
      }
}
