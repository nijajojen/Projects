package linkedLIstDemo;

import linkedLIstDemo.DeletingANode.ListNode;

public class RemoveNnode {

	
	public static class ListNode {
		      int val;
		      ListNode next;
		      ListNode() {}
		      ListNode(int val) 
		      	{ this.val = val; }
		      ListNode(int val, ListNode next)
		      	{ this.val = val; this.next = next; }
		  }
		 
	public static ListNode removeNthFromEnd(ListNode head, int n) {
		ListNode curr;
		curr=head;
		int count =1;
		while(curr.next!=null) {
			curr= curr.next;
			count++;
		}
		System.out.println("count: "+count);
		int limit= count-n;
		
		ListNode curr1;
		curr1=head;
		for(int i=1;i<=limit-1;i++) {
			curr1=curr1.next;
		}
		ListNode del= curr1.next;
		curr1.next= del.next;
		while(head!=null) {
			System.out.println(head.val);
			head=head.next;
		}
		return head;
	        
	    }

	public static void main(String[] args) {
		ListNode l1head =  new ListNode(1);
		ListNode l1node2 = new ListNode(2);
		ListNode l1node3 = new ListNode(3);
		ListNode l1node4 = new ListNode(4);
		ListNode l1node5 = new ListNode(5);
		l1head.next=l1node2;
		l1node2.next=l1node3;
		l1node3.next=l1node4;
		l1node4.next=l1node5;
		l1node5.next=null;
		
		removeNthFromEnd(l1head, 2) ;
	}

}
