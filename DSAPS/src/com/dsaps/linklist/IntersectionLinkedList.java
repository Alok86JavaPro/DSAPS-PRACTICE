package com.dsaps.linklist;

import java.util.HashSet;
import java.util.Set;
/*
 * https://leetcode.com/problems/intersection-of-two-linked-lists/solution/
 * https://www.geeksforgeeks.org/write-a-function-to-get-the-intersection-point-of-two-linked-lists/
 * https://www.geeksforgeeks.org/union-and-intersection-of-two-linked-lists/
 */
public class IntersectionLinkedList {
     static class Node{
    	 private int data;
    	 private Node next;
		public Node(int data) {
			super();
			this.data = data;
			this.next = null;
		}
    	 
     }
     
     public static void main(String[] args) {
    	 Node headA = new Node(1);
    	 headA.next = new Node(2);
    	 headA.next.next = new Node(3);
    	 headA.next.next.next = new Node(4);
    	 headA.next.next.next.next = new Node(5);
    	 headA.next.next.next.next.next = new Node(6);
    	 headA.next.next.next.next.next.next = new Node(7);
    	 
    	 Node headB = new Node(10);
    	 headB.next = new Node(9);
    	 headB.next.next = new Node(8);
    	 headB.next.next.next = headA.next.next.next;
    	 printList(headA);
    	 System.out.println();
    	 printList(headB);
    	 System.out.println();
    	System.out.println(getIntersectionNode(headA, headB).data);
    	System.out.println(getIntersectionNode2(headA, headB).data);
	}
     
     private static void printList(Node list) {
    	 while(list != null) {
    		 System.out.print(list.data +" ");
    		 list = list.next;
    	 }
     }
     //Time Complexity = O(N + M)
     //Space Complexity (N)
     private static Node getIntersectionNode(Node headA, Node headB) {
    	 Set<IntersectionLinkedList.Node> visited = new HashSet<IntersectionLinkedList.Node>();
    	 while(headA != null) {
    		 visited.add(headA);
    		 headA = headA.next;
    		 
    	 }
    	 while(headB != null) {
    		 if(visited.contains(headB)) return headB;
    		 headB = headB.next;
    	 }
    	 
    	 return null;
     }
     //Time Complexity = O(N + M)
     //Space Complexity O(1)
     private static Node getIntersectionNode2(Node headA, Node headB) {
    	 Node pA = headA;
    	 Node pB = headB;
    	 while(pA != pB) {
    		 pA = pA == null ? headB : pA.next;
    		 pB = pB == null ? headA : pB.next;
    		 
    	 }
    	 return pA;
     }
     
     
}
