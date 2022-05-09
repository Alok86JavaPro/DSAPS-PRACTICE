package com.dspsa.sandeepbeingzero.context1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/*
 * Given N numbers Xi's and a specific digit D. You need to tell how many numbers have second last digit that matches D.
  Input Format
  Line 1: Two space separated Integers D N - Digit and Count of Numbers.
  Next N lines contain single number Xi per line.
  
Constraints
1 <= N <= 107
0 <= D <= 9
10 <= Xi <= 109
Output Format
Print single integer as output, that signifies count of numbers whose second last digit is D.

Sample Input 0

9 5
491
113
89
999
1293
Sample Output 0

3
Explanation 0

Total N=5 Numbers are given and we need to count numbers with second last digit (from left to right) as 9 (D=9).

Following 3 numbers meet that criteria. 491
999
1293

 */
public class Solution {
	public static void main(String[] args) throws IOException {
		BufferedReader reader =  new BufferedReader(new InputStreamReader(System.in));
		String input = reader.readLine();
		int digit = Integer.valueOf(input.split(" ")[0]);
		long number = Long.valueOf(input.split(" ")[1]);
		long count = 0;
		int numDigit = 0;
		for(long i = 0; i<number;i++) {
			String inputNumber = reader.readLine();
			if(inputNumber.length() >= 2){
			   numDigit = Character.getNumericValue(inputNumber.charAt(inputNumber.length() -2));
			   if(numDigit == digit) count += 1;
			}
			
			
		}
		System.out.println(count);
	}
	
//	public static void main(String[] args) throws IOException {
//		BufferedReader reader =  new BufferedReader(new InputStreamReader(System.in));
//		String input = reader.readLine();
//		int digit = Integer.valueOf(input.split(" ")[0]);
//		long number = Long.valueOf(input.split(" ")[1]);
//		long count = 0;
//		for(long i = 0; i<number;i++) {
//			String inputNumber = reader.readLine();
//			int numDigit = Character.getNumericValue(inputNumber.charAt(inputNumber.length() -2));
//			if(numDigit == digit) count += 1;
//		}
//		System.out.println(count);
//	}
}
