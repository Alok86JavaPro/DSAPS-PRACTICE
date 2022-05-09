package com.dsaps.stacks;

import java.util.Stack;

public class MaxInSatckProgram {
	
	static class MaxInSatck{
		
		private Stack<Integer> stack = new Stack<Integer>();
		private Stack<Integer> maxStack =  new Stack<Integer>();
		
		public int peek() {
			return stack.peek();
		}
		
		public int pop() {
			maxStack.pop();
			return stack.pop();
		}
		public void push(int number) {
			int max = number;
			if(!stack.isEmpty()) {
				int lastMax = maxStack.peek();
				if(lastMax > number) 
					max = lastMax;
			}
			maxStack.push(max);
			stack.push(number);
		}
		
		public int getMax() {
			return maxStack.peek();
		}
		
	}
	
	public static void main(String[] args) {
		MaxInSatck StackWithMax = new MaxInSatckProgram.MaxInSatck();
		StackWithMax.push(25);
        StackWithMax.push(100);
        StackWithMax.push(5);
        System.out.println(StackWithMax.getMax()); //100
        System.out.println(StackWithMax.pop()); 
        System.out.println(StackWithMax.getMax());
        StackWithMax.pop();
        System.out.println(StackWithMax.getMax());
        StackWithMax.push(65);
        System.out.println(StackWithMax.getMax());
//        StackWithMax.push(15);
//        System.out.println(StackWithMax.getMax());
//        StackWithMax.push(75);
//        StackWithMax.push(15);
//        System.out.println(StackWithMax.getMax());

	}
    
}
