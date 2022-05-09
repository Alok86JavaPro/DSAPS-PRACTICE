package com.dsaps.arrays;

import java.util.Arrays;

public class MissingElementArray {
   public static void main(String[] args) {
	 int[] array = {1,2,4,5,6,7};
	 System.out.println(missingNum(array));
   }

	private static int missingNum(int[] array) {
		int n = array.length + 1;
		int sumOfN =  n*((n+1)/2);
		int sum = Arrays.stream(array).sum();
		return sumOfN - sum;
	}
}
