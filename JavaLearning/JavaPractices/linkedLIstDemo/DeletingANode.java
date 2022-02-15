package linkedLIstDemo;

import linkedLIstDemo.reorderList.ListNode;

public class DeletingANode {
	static ListNode l1head=null;
	public static class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
			next = null;
		}
	}
	
	public static void deleteNode(ListNode node) {
		ListNode prev=null;
		ListNode curr=l1head;
       while(curr!=node) {
    	   prev=curr;
    	   curr=curr.next;
    	   if(curr==node) {
    		   prev.next=node.next;
    	   }
    	   
       }
       printList(l1head);
    }
	
	public static ListNode printList(ListNode patternHead) {
		while(patternHead!=null) {
			System.out.println(patternHead.val);
			patternHead=patternHead.next;
		}
		return patternHead;
	}

	public static void main(String[] args) {
		 l1head = new ListNode(1);
		ListNode l1node2 = new ListNode(2);
		ListNode l1node3 = new ListNode(3);
		ListNode l1node4 = new ListNode(4);
		ListNode l1node5 = new ListNode(5);
		ListNode l1node6 = new ListNode(6);
		l1head.next = l1node2;
		l1node2.next = l1node3;
		l1node3.next=l1node4;
		l1node4.next=l1node5;
		l1node5.next=l1node6;
		l1node6.next=null;
		deleteNode(l1node3);
	}

}
