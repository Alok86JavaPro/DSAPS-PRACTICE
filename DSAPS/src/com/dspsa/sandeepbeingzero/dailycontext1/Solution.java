package com.dspsa.sandeepbeingzero.dailycontext1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
  public static void main(String[] args) throws IOException {
	 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	 String weight = br.readLine();
	 int w = Integer.valueOf(weight);
	 if( w != 2 && w % 2 == 0) {
		 System.out.println("YES");
	 }else {
		 System.out.println("NO");
	 }	 
	 
  }
}
