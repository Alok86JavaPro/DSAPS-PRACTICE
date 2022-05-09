package com.dsaps.algoexpert.stings;

//Given a non empty string of lower case letters and a non negative integer representing a key
//Write a function that returns a new string obtained by shifting every letter in the input string 
//by k positions in the alphabet, where k is the key
//Note that letter should wrap around the alphabet; in the other words, the letter z shifted by one returns the letter a
public class CaeserCipherEncryptor {
	public static void main(String[] args) {
		String str = "xyz";
		int key = 2;
		System.out.println(caesarCypherEncryptor(str, key));
	}

//	public static String caesarCypherEncryptor(String str, int key) {
//		char[] strArray = str.toCharArray();
//		String newString = "";
//		int newKey = key % 26;
//		for (int i = 0; i < strArray.length; i++) {
//			int newLetterCode = strArray[i] + newKey;
//			if (newLetterCode <= 122) {
//				newString += (char) newLetterCode;
//			} else {
//				newString += (char) (96 + newLetterCode % 122);
//			}
//		}
//		return newString;
//	}
	
	// O(n) Time | O(n) Space
//	public static String caesarCypherEncryptor(String str, int key) {
//		char[] newLetters = new char[str.length()];
//		int newKey = key % 26;
//		for(int i = 0 ; i < str.length(); i++) {
//			newLetters[i] = getNewLetter(str.charAt(i),newKey);
//		}
//		return new String(newLetters);
//	}
//
//	private static char getNewLetter(char letter , int newKey) {
//		int newLetterCode = letter + newKey;
//		return newLetterCode <= 122 ? (char) newLetterCode : (char) (96 + newLetterCode%122);
//	}
	
	
	// O(n) Time | O(n) Space
		public static String caesarCypherEncryptor(String str, int key) {
			char[] newLetters = new char[str.length()];
			int newKey = key % 26;
			String alphabet = "abcdefghijklmnopqrstuvwxyz";
			for(int i = 0 ; i < str.length(); i++) {
				newLetters[i] = getNewLetter(str.charAt(i),newKey,alphabet);
			}
			return new String(newLetters);
		}

		private static char getNewLetter(char letter , int newKey,String alphabet) {
			int newLetterCode = alphabet.indexOf(letter) + newKey;
			return alphabet.charAt(newLetterCode % 26);
		}
}
