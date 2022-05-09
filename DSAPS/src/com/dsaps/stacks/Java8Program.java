package com.dsaps.stacks;

import java.util.Stack;

public class Java8Program {
	public static void main(String[] args) {
		//Remove duplicates from an array of numbers
		
		
//		int[] intArray = new int[] {1,2,3,4,2,1,5,6,7};
//		int[] nonDuplicateArray = Arrays.stream(intArray).distinct().toArray();
//		Arrays.stream(nonDuplicateArray).forEach(i -> System.out.print( " " + i));
		
//		IntStream.of(1,2,3,4,2,1,5,6,7).distinct().forEach(i -> System.out.print(" " +i));
		
		
		//Given a string containing only brackets, like {[]}(), check if it is balanced
//		
//		String str = "{[]}()";
//		boolean	isBalanced = isBalancedString(str);
//		System.out.println("isBalanced :"+ isBalanced);
//		
		
		
		String str1 = "helloword";
		String reverseString = reverse( str1);
		System.out.println("reverseString: "+reverseString);
		
	}
//    public static boolean isBalancedString(String str) {
//		      int i = 0; int j = str.length() -1;
//				boolean isBalanced = false;
//				while(j>i) {
//					char a = str.charAt(i);
//					char b = str.charAt(j);
//					i++;
//					j--;
//					if(a == b) 
//						isBalanced = true;
//				}
//				return isBalanced;
//		    }
    
	public static boolean isBalancedString(String str) {
    	Stack<Character> stack = new Stack<Character>();
		for(char c : str.toCharArray()) {
				if(c == '{' || c == '[' || c == '(') {
					stack.add(c);
					continue;
					
			    }
			
			if(stack.isEmpty()) {
				return false;
			
			}
			char check ;
			switch(c) {
			case '}' :
			   
				check = stack.pop();
				if(check == '[' || check == '(') {
					return false;
				}
			   break;
			
			case ')' :	
				
				check = stack.pop();
				if(check == '[' || check == '{') {
					return false;
				}
			   break;
			   
           case ']' :	
				
				check = stack.pop();
				if(check == '(' || check == '{') {
					return false;
				}
			   break;	   
			   
			   
			}
		    
	    }
		
		return (stack.isEmpty());
    }

    
    //Reverse a string using recursion
    
//    public static String reverse(String str1) {
//    	String revs = "";
//    	while(str1.length() > 0) {
//    		revs = revs + str1.charAt(str1.length()-1);
//    		str1 = str1.substring(0,str1.length()-1);
//    		reverse(str1);
//    	}
//    	return revs;
//    }
    
    public static String reverse(String str) {
    	if(str == null || str.length() <= 1) 
    		return str;
    	//helloword
//    	StringBuilder sb = new StringBuilder();
//    	sb.reverse();
    	return reverse(str.substring(1)) + str.charAt(0);
    	       
    }
}
