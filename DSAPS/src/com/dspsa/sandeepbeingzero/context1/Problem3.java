package com.dspsa.sandeepbeingzero.context1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.stream.Stream;

/*
 * Uncle Scrooge has been given a list of Triplets. For each Triplet he needs to calculate the sum. Since the list is huge, 
 * doing it manually will take multiple days for him. 
 * He needs help from your coding skills to get the job done. Can you finish the task for him?
 * Input Format
   Line 1: Integer N - Number of triplets.
   Next N-lines contain 3 space separated integers A B C per line.
Constraints
1 <= N <= 105
0 <= A, B, C <= 109

Output Format
For each Triplet print a new line of output containing sum value of three numbers.

Sample Input 0

7
1 2 3
9 9 9
38 69 82
34 57 39
1 87 97
43 91 41
88 31 30
Sample Output 0

6
27
189
130
185
175
149
Explanation 0

Self Explanatory.

 */
public class Problem3 {
     public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		String numberOfTriplets = bufferedReader.readLine();
		long n = Long.valueOf(numberOfTriplets);
		long sum =0 ;
		while(n-- > 0) {
			String triplet = bufferedReader.readLine();
			String[] inputs = triplet.split(" ");
			for(String str : inputs) {
    			sum += Long.valueOf(str);
    		}
			System.out.println(sum);
		}
	}
     
    static class Solution{
    	
    	static long calculateSum(String[] triplets) {
    		long sum = 0;
    		for(String str : triplets) {
    			sum += Long.valueOf(str);
    		}
    		
    		return sum;
    	}
    }
     
}
