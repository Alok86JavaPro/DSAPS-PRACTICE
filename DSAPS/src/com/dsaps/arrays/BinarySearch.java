package com.dsaps.arrays;

import java.util.Arrays;

/*
 *  Given a sorted array arr[] of n elements, write a function to search a given element x in arr[].
 */
public class BinarySearch {
  public static void main(String[] args) {
	int arr[] = {10, 20, 80, 30, 60, 50, 110, 100, 130, 170};
	int target = 50;
	Arrays.sort(arr);
	int index = binarSearch(arr, target);
	System.out.println(index);
	System.out.println(arr[index]);
  }

private static int binarSearch(int[] arr, int target) {
	 int l = 0 ;
	 int r =  arr.length -1;
	 while(l <= r) {
		 int m = l + (r - l )/2;
		 if(arr[m] == target) {
			 return m;
		 }
		 if(arr[m] < target) {
			 l = m +1;
		 }
		 if(arr[m] > target) {
			 r = m -1;
		 }
	 }
	return -1;
}
}
