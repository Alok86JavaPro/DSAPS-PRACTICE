package com.dsaps.stacks;

import java.util.Stack;

public class MinInStackProgram {
	
	static class MinInStack{
		private Stack<Integer> minStack = new Stack<Integer>();
		private Stack<Integer> stack = new Stack<Integer>();
		
		public int peek() {
			return stack.peek();
		}
		
		public int pop() {
			if(stack.empty())
				return -1;
			minStack.pop();
			return stack.pop();
		}
		
		public void push(int number) {
			int min = number;
			if(!stack.empty()) {
				int lastMin = minStack.peek();
				min = Math.min(number, lastMin);
			}
			minStack.push(min);
			stack.push(number);
		}
		public int getMin() {
			return minStack.peek();
		}
		
 	}
    
	public static void main(String[] args) {
		MinInStack minInStack = new MinInStackProgram.MinInStack();
		minInStack.push(20);
		minInStack.push(5);
		minInStack.peek();
		System.out.println(minInStack.getMin());
		minInStack.push(2);
		System.out.println(minInStack.getMin());
		minInStack.pop();
		System.out.println(minInStack.getMin());
	}
}
