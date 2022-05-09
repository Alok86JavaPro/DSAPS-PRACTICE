package com.dspsa.sandeepbeingzero.dailycontext1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution2 {
	public static void main(String[] args) throws IOException {
		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		 String number = br.readLine();
		 long num = Long.valueOf(number);
		 long fn = 0;
		 if( num % 2 == 0) {
			 fn = num/2;
			 System.out.println(fn);
		 }else {
			 fn = (num+1)/2 * -1 ;
			 System.out.println(fn);
		 }	 
		 
	  }
}
