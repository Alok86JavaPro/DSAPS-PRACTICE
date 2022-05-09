package com.dsaps.arrays;

public class SecondLargestElement {
   public static void main(String[] args) {
	   int [] ar = {7,5,6,1,4,2};
	   int max = 0;
	   int secondmax = 0;
	   for(int i =0; i<ar.length -1; i++) {
		   if(ar[i] > max) {
			   secondmax = max;
			   max = ar[i];
			  
		   }else if(ar[i] > secondmax && ar[i] != max) {
			   secondmax = ar[i];
		   }
	   }
	   System.out.println("max: " +  max + ", secondMax: "+secondmax);
  }
}
