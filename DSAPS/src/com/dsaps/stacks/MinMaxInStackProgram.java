package com.dsaps.stacks;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MinMaxInStackProgram {
       static class MinMaxInStack  {
    	   private List<Map<String,Integer>> minMaxStack = new ArrayList<Map<String,Integer>>();
    	   private List<Integer> stack = new ArrayList<Integer>();
    	   
    	   public int peek() {
    		   return stack.get(stack.size() - 1);
    	   }
    	   
    	   public int pop() {
    		   minMaxStack.remove(minMaxStack.size() - 1);
    		   return stack.remove(stack.size() - 1);
    	   }
    	   
    	   public void push(int number) {
    		   Map<String, Integer> newMinMax = new HashMap<String, Integer>();
    		   newMinMax.put("min", number);
    		   newMinMax.put("max", number);
    		   if(stack.size() > 0) {
    			   Map<String, Integer> lastMinMax = new HashMap<String,Integer>(minMaxStack.get(minMaxStack.size() - 1));
    			   newMinMax.replace("min", Math.min(lastMinMax.get("min"), number));
    			   newMinMax.replace("max", Math.max(lastMinMax.get("max"), number));
    		   }
    		   minMaxStack.add(newMinMax);
    		   stack.add(number);
    		   
    	   }
    	   
    	  public int getMin() {
    		  return minMaxStack.get(minMaxStack.size() -1).get("min");
    	  }
    	  
    	  public int getMax() {
    		  return minMaxStack.get(minMaxStack.size() -1).get("max");
    	  }
    	   
       }
       
       public static void main(String[] args) {
    	   MinMaxInStack minMaxInStack = new MinMaxInStackProgram.MinMaxInStack();
    	   minMaxInStack.push(5);
    	   System.out.println("min:"+minMaxInStack.getMin() +", max:"+minMaxInStack.getMax());
    	   minMaxInStack.push(7);
    	   System.out.println("min:"+minMaxInStack.getMin() +", max:"+minMaxInStack.getMax());
    	   minMaxInStack.push(2);
    	   System.out.println("min:"+minMaxInStack.getMin() +", max:"+minMaxInStack.getMax());
    	   minMaxInStack.pop();
    	   System.out.println("min:"+minMaxInStack.getMin() +", max:"+minMaxInStack.getMax());
    	   
	}
}
