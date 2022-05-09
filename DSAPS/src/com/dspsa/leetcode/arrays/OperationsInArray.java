package com.dspsa.leetcode.arrays;

import java.util.Arrays;

public class OperationsInArray {
	public static void main(String[] args) {
		//Initialization
		int[] a0 = new int[5];
		int[] a1 =  {1,2,3};
		
		//Get length
		System.out.println("Size of array a0: "+a0.length);
		
		System.out.println("Size of array a1: "+a1.length);
		
		//Access element
		
		System.out.println("first element of array a1: "+a1[0]);
		
		//Iterate array elements
		
		System.out.println("[version 1] conent of array a1: ");
		
		for(int i = 0; i <a1.length;i++) {
			System.out.print(" "+a1[i]);
		}
		
		System.out.println();
		
		System.out.println("[version 2] conent of array a1: ");
		for(int item : a1) {
			System.out.print(" "+item);
		}
		System.out.println();
		//modify element of an array
		
		a0[0] = 4;
		
		// sorting of array
		
		Arrays.sort(a1);
	}

}
