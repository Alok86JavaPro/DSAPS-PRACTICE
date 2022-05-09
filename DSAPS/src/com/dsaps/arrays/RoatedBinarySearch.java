package com.dsaps.arrays;
/*
 * search-an-element-in-a-sorted-and-pivoted-array
 * sorted-and-rotated-array-search
 */
public class RoatedBinarySearch {
   public static void main(String[] args) {
	   int arr[] = { 4, 5, 6, 7, 8, 9, 1, 2, 3 };
       int key = 6 ;
       int i = search(arr,key);
       System.out.println(" index "+ i);
       System.out.println(" index elecment "+ arr[i]);
}

private static int search(int[] arr, int key) {
	 int l = 0;
	 int r = arr.length -1;
	 while (l <= r) {
		 int m =  l + (r -l)/2;
		 if(arr[m] == key) {
			 return m;
					 
		 }else if(arr[m] < key ) {
			 if(arr[l] > arr[m] &&  arr[l] <= key) {
				 r = m - 1;
			 }else {
				 l = m +1;
			 }
		 }else {
			 if(arr[r] <  arr[m] && arr[r] >= key) {
				 l  = m+1;
			 }else {
				 r = m -1;
			 }
		 }
				 
	 }
	return -1;
}
}
