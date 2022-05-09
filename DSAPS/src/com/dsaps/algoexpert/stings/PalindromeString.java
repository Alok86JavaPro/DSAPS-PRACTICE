package com.dsaps.algoexpert.stings;

public class PalindromeString {
    public static void main(String[] args) {
		String str = "abcdcba";
		//System.out.println(isPalindrome(str));
		//System.out.println(isPalindromeUsingConcat(str));
		//System.out.println(isPalindromeWithoutConcat(str));
		System.out.println(isPalindromeRecurrsion(str));
	}
  //Time O(n), Space O(1)
	private static boolean isPalindrome(String str) {
		int l = 0;
		int r = str.length() -1;
		while(l < r) {
			if(str.charAt(l) != str.charAt(r)) {
				return false;
			}
			l++;
			r--;
		}
		return true;
	}
	
	//Time O(n^2), Space O(n)
	private static boolean isPalindromeUsingConcat(String str) {
		String reversedString = "";
		for(int i = str.length() -1 ; i >=0; i--) {
			reversedString += str.charAt(i);
		}
		return str.equals(reversedString);
	}
	//Time O(n), Space O(n)
	private static boolean isPalindromeWithoutConcat(String str) {
		StringBuilder reversedString = new StringBuilder();
		for(int i = str.length() -1 ; i >=0; i--) {
			reversedString.append(str.charAt(i));
		}
		return str.equals(reversedString.toString());
	}
	
	//Time O(n), Space O(n)
	private static boolean isPalindromeRecurrsion(String str) {
		return isPalindromeRecurrsion(str,0);
	}
	private static boolean isPalindromeRecurrsion(String str, int i) {
		int j = str.length() -1 -i;
		return i >=j ? true: str.charAt(i) == str.charAt(j) && isPalindromeRecurrsion(str,i+1);
	}
    
    
    
}
