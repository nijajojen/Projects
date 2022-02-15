package linkedLIstDemo;

import java.util.Stack;


public class Palindrome {
	
	public static class Node{
		Node next=null;
		int data;
		public Node(int data) {
			this.data=data;
		}
	}
	/*
	 * Initialize 2 pointers to head;
	 * speed fast pointer 2x; slow pointer 1x.
	 * when fast reaches the end point ,slow reaches middle point.
	 * store the slow until mid point in stack.
	 * Now, the first half reversal stored in stack, should be equal to
	 * next half, from mid slow to end.
	 */
	private static boolean isPalindrome(Node head) {
		Node fast=head;
		Node slow=head;
		Stack<Integer> stack= new Stack<Integer>();
		
		while(fast!=null && fast.next!=null) {
			stack.push(slow.data);
			slow=slow.next;
			fast=fast.next.next;
			
		}
		
		/*
		 * to find mid ,if the number of elements is odd.
		 */
		if(fast!=null) {			
			stack.push(slow.data);
		}
		
		while(slow!=null) {
			if(stack.pop()!=slow.data) {
				return false;
			}
			slow=slow.next;
		}
		return true;		
	}

	public static void main(String[] args) {
		Node node1= new Node(3);
		Node node2= new Node(2);
		Node node3= new Node(1);
		Node node4= new Node(2);
		Node node5= new Node(3);
		node1.next=node2;
		node2.next=node3;
		node3.next=node4;
		node4.next=node5;
		node5.next=null;
		
		
		System.out.println(isPalindrome(node1));

	}

}
