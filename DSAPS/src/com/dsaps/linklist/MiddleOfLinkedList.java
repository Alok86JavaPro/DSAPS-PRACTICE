package com.dsaps.linklist;
/*
 * https://leetcode.com/problems/middle-of-the-linked-list/solution/
 * https://practice.geeksforgeeks.org/problems/finding-middle-element-in-a-linked-list/1
 */
public class MiddleOfLinkedList {
     static class Node{
    	 int data;
    	 Node next;
    	 public Node(int data) {
    		 this.data = data;
    		 this.next = null;
    	 }
     }
     
     public static void main(String[] args) {
		 Node head = new Node(1);
		 head.next = new Node(2);
		 head.next.next = new Node(3);
		 head.next.next.next = new Node(4);
		 head.next.next.next.next = new Node(5);
		 head.next.next.next.next.next = new Node(6);
		 head.next.next.next.next.next.next = new Node(7);
		 print(head);
		 System.out.println();
		 System.out.println(middleNode1(head).data);
		 System.out.println();
		 System.out.println(middleNode2(head).data);
	}
     //Time O(N)
     //Space O(N)
     private static Node middleNode1(Node head) {
    	 Node[] arrays = new Node[100];
    	 int i = 0;
    	 while(head != null) {
    		 arrays[i++] = head;
    		 head = head.next;
    	 }
    	 return arrays[i/2];
    	 
     }
     //Time O(N)
     //Space O(1)
     private static Node middleNode2(Node head) {
    	 Node slow = head;
    	 Node fast = head;
    	 while(fast != null && fast.next != null) {
    		 slow = slow.next;
    		 fast = fast.next.next;
    	 }
    	 return slow;
    	 
     }
     
     
     
     private static void print(Node list) {
    	 while(list != null) {
    		 System.out.print(list.data);
    		 list = list.next;
    	 }
     }
     
     
}
