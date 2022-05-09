package com.dsaps.arrays.sorting;

import java.util.Arrays;

public class MergeSort {
	
	public static void main(String[] args) {
		int[] array = new int[] {12, 11, 13, 5, 6, 7};
		int l = 0;
		int r = array.length -1;
//		System.out.println(Arrays.toString(MergeSort.Solution.sort(array, l, r)));
		System.out.println(Arrays.toString(MergeSort.Solution2.sort(array, l, r)));
		
	}
	
	static class Solution{
		// Main function that sorts arr[l..r] using
	    // merge()
		public static int[] sort(int[] array, int l, int r) {
			
			if(l < r) {
				 // Find the middle point
				int m = l + (r-l)/2;
				// Sort first and second halves
				sort(array,l,m);
				sort(array,m+1,r);
				
				// Merge the sorted halves
				merge(array,l, m, r);
			}
			
			return array;
		}
		
		// Merges two subarrays of arr[].
	    // First subarray is arr[l..m]
	    // Second subarray is arr[m+1..r]
		private static void merge(int[] array, int l, int m, int r) {
			
			// Find sizes of two subarrays to be merged
            int n1 = m - l + 1;
            int n2 = r - m;
            /* Create temp arrays */
            int[] L = new int[n1];
            int[] R = new int[n2];
            
            /*Copy data to temp arrays*/
            
            for(int i = 0; i< n1;i++) {
            	L[i] = array[l+i];
            }
            for(int j = 0; j< n2;j++) {
            	R[j] = array[m+1 + j];
            }
            /* Merge the temp arrays */
         // Initial indexes of first and second subarrays
            int i = 0, j = 0;
         // Initial index of merged subarray array
            int k = l;
            		
            while(i<n1 && j < n2) {
            	if(L[i] < R[j]) {
            		array[k] = L[i];
            		i++;
            	}else {
            		array[k] = R[j];
            		j++;
            	}
            	k++;
            }
            /* Copy remaining elements of L[] if any */
            while(i< n1) {
            	array[k] = L[i];
            	i++;
            	k++;
            }
            /* Copy remaining elements of R[] if any */
            while(j< n2) {
            	array[k] = R[j];
            	j++;
            	k++;
            }
			
		}
		
		
	}
	
	static class Solution2{
		// Main function that sorts arr[l..r] using
	    // merge()
		public static int[] sort(int[] array, int i, int j) {
			
			if(i != j) {
				 // Find the middle point
				int m = i + (j-i)/2;
				// Sort first and second halves
				sort(array,i,m);
				sort(array,m+1,j);
				
				// Merge the sorted halves
				merge(array,i, m, m+1, j);
			}
			
			return array;
		}

		private static void merge(int[] array, int l1, int r1, int l2 , int r2) {
			
			int n1 = l2 -l1;
			
			int n2 = r2 -r1;
			
			int[] L =  new int[n1];
			int[] R = new int[n2];
			
			for(int i = 0; i < n1;i++) {
				L[i] = array[l1+i];
			}
			
			for(int j = 0; j < n2;j++) {
				R[j] = array[l2 + j];
			}
			
			int k = l1;
			int i =0 , j = 0;
			while( i<n1 && j<n2) {
				if(L[i] < R[j]) {
					array[k] = L[i];
					i++;
					k++;
				}else {
					array[k] = R[j];
					j++;
					k++;
				}
			}
			
			/* Copy remaining elements of L[] if any */
            while(i< n1) {
            	array[k] = L[i];
            	i++;
            	k++;
            }
            /* Copy remaining elements of R[] if any */
            while(j< n2) {
            	array[k] = R[j];
            	j++;
            	k++;
            }
			
		}
		
		
		
		
	}

}
