package linkedLIstDemo;

import java.util.List;



public class ReverseLIst {

	public static class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
			next = null;
		}
	}
		
	public static ListNode reverseList(ListNode curr) {
	    if (curr == null || curr.next == null) {
	    	System.out.println(curr.val);
	    	return curr;
	    }
	    ListNode p = reverseList(curr.next);
	    System.out.println("p "+p.val);
	    System.out.println("curr "+curr.val);
	    curr.next.next = curr;
	    curr.next = null;
	    return p;
	}
		
	
	public static ListNode returnBack(ListNode curr) {
	    
	    return curr;
	}
	
		
		
	public static void main(String[] args) {
		ListNode l1head = new ListNode(0);
		ListNode l1node2 = new ListNode(9);
		ListNode l1node3 = new ListNode(1);
		ListNode l1node4 = new ListNode(2);
		l1head.next = l1node2;
		l1node2.next = l1node3;
		l1node3.next=l1node4;
		l1node4.next=null;
		ListNode l=reverseList( l1head);
		//ListNode l=reverseList( null);
		while(l!=null) {
			System.out.println(l.val);
			l=l.next;
		}
		
		

	}

}
