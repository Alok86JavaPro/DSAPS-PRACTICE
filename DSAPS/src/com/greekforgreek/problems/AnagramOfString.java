package com.greekforgreek.problems;
/*
 * Given two strings S1 and S2 in lower case, the task is to make them anagram. 
 * The only allowed operation is to remove a character from any string. 
 * Find the minimum number of characters to be deleted to make both the strings anagram. 
 * Two strings are called anagram of each other if one of them can be converted into another by rearranging its letters.
 * Example 1:
 * Input:
	S1 = bcadeh
	S2 = hea
	Output: 3
	Explanation: We need to remove b, c
	and d from S1.
	Example 2:
	Input:
	S1 = cddgk
	S2 = gcd
	Output: 2
	Explanation: We need to remove d and
	k from S1.
  Your Task:
Complete the function remAnagram() which takes two strings S1, S2 as input parameter, and returns minimum characters needs to be deleted.
Expected Time Complexity: O(max(|S1|, |S2|)), where |S| = length of string S.
Expected Auxiliary Space: O(26)

Constraints:
1 <= |S1|, |S2| <= 105
 */
public class AnagramOfString {
	
	public static void main(String[] args) {
	  AnagramOfString ofString = new AnagramOfString();
//       String s1 = "bcadeh";
//       String s2 = "hea";
		 String s1 = "cddgk";
	     String s2 = "gcd";
       
       int count = ofString.remAnagrams(s1,s2);
       System.out.println(count);
	}

	public int remAnagrams(String s1, String s2) {
		char[] chars = new char[26];
		int count = 0;
		
        for(int i = 0; i < s1.length();i++) {
        	char c = s1.charAt(i);
        	chars[c-'a'] += 1;
        }
        
        for(int j = 0; j < s2.length();j++) {
        	char c = s2.charAt(j);
        	chars[c-'a'] -= 1;
        }
		
        for(int i = 0; i < chars.length; i++) {
        	if(chars[i] > 0) {
        		count += 1;
        	}
        }
       return count;
	}
}
