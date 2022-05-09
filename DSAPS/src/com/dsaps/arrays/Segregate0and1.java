package com.dsaps.arrays;

import java.util.Arrays;

public class Segregate0and1 {
	
	public static void segregate0and1(int[] array) {
		System.out.println(Arrays.toString(array));
		int left = 0,right = array.length -1;
		while(left < right) {
			if(array[left] == 0) {
				left++;
			}else if(array[right] == 1) {
				right--;
			}else {
//				 array[right] = array[right] + array[left];
//				 array[left] = array[right]  - array[left];
//				 array[right] = array[right] - array[left];
				 int temp = array[left];
				 array[left] = array[right];
				 array[right] = temp;
				 left++;
				 right--;
			}
		}
		System.out.println(Arrays.toString(array));
	}
   public static void main(String[] args) {
	   int arr[] = {0,1,1,0,1,0,1,0,1};
	   segregate0and1(arr);
  }
}
