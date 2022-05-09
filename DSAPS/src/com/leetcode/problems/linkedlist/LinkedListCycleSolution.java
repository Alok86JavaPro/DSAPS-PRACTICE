package com.leetcode.problems.linkedlist;

import java.util.HashSet;
import java.util.Set;

/*
 * https://leetcode.com/problems/linked-list-cycle/
 * Given head, the head of a linked list, determine if the linked list has a cycle in it.
   There is a cycle in a linked list if there is some node in the list 
   that can be reached again by continuously following the next pointer. 
   Internally, pos is used to denote the index of the node that tail's next pointer is connected to. 
   Note that pos is not passed as a parameter.
   Return true if there is a cycle in the linked list. Otherwise, return false
 */
public class LinkedListCycleSolution {
	public static void main(String[] args) {
		ListNode node = new ListNode(3);
		node.next = new ListNode(2);
		node.next.next = new ListNode(0);
		node.next.next.next = new ListNode(-4);
		node.next.next.next.next = node.next;
		Solution1 solution1 =  new Solution1();
//		System.out.println(solution1.hasCycle(node));
		
		Solution2 solution2 =  new Solution2();
//		System.out.println(solution2.hasCycle(node));
		
		ListNode head = new ListNode(1);
		head.next = new ListNode(2);
		head.next.next = head;
		
//		System.out.println(solution1.hasCycle(head));
//		
//		System.out.println(solution2.hasCycle(head));
		
		ListNode head1 = new ListNode(1);
		
		
		System.out.println(solution1.hasCycle(head1));
		
		System.out.println(solution2.hasCycle(head1));
	}
	
}
/**
 * Definition for singly-linked list.
 */
  class ListNode {
     int val;
     ListNode next;
     ListNode(int x) {
         val = x;
         next = null;
     }
  }
  
  class Solution1{
	  public boolean hasCycle(ListNode head) {
	        Set<ListNode> visted = new HashSet<ListNode>();
	        while(head != null){
	            if(visted.contains(head)) return true;
	            visted.add(head);
	            head = head.next;
	        }
	        return false;
	    }
  }
  
  class Solution2{
	  public boolean hasCycle(ListNode head) {
		       ListNode slow = head;
		       ListNode fast = head;
	        while(fast != null  && fast.next != null){
	             slow = slow.next;
	             fast = fast.next.next;
	             if(slow == fast) return true;
	        }
	        return false;
	    }
  }
