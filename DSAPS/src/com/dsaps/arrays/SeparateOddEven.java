package com.dsaps.arrays;

import java.util.Arrays;

public class SeparateOddEven {
     public static void separateOddEven(int[] array) {
    	 System.out.println(Arrays.toString(array));
    	 int left = 0,right = array.length -1;
    	 while(left < right) {
    		 if(array[left]%2 ==0) {
    			 left++;
    		 }else if(array[right]%2 != 0) {
    			 right--;
    		 }else {
//    			 array[right] = array[right] + array[left];
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
    	 int array[] = {12, 17, 70, 15, 22, 65, 21, 90};
    	 separateOddEven(array);
	}
}
