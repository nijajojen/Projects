package linkedLIstDemo;

import linkedLIstDemo.LinkedListDemoCorrectWay.ListNode;

public class Merge2SortedList {
	
	
	public static class ListNode {
		     int val;
		     ListNode next;
		     ListNode(int x) { val = x; }
		  }
	
	 public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
		//does this l1 and l2 &&&& lhead n l2head have same address?
		 ListNode dummyHead= new ListNode(0);
		 ListNode p=l1, q=l2, currentNode=dummyHead;
		 while(p!= null || q!=null){
			 
			 if(p==null) {
				 currentNode.next=new ListNode(q.val);
				 currentNode=currentNode.next;
			 }
			 if (q==null) {
				 currentNode.next=new ListNode(p.val);
				 currentNode=currentNode.next;
			 }
			 
			 if(p.val<=q.val) {
				 currentNode.next=new ListNode(p.val);
				 currentNode=currentNode.next;
				 currentNode.next=new ListNode(q.val);
				 currentNode=currentNode.next;
			 } 
			 else {
				 currentNode.next=new ListNode(q.val);
				 currentNode=currentNode.next;
				 currentNode.next=new ListNode(p.val);
				 currentNode=currentNode.next;
			 }
			 
			 
		 if(p!=null)p=p.next;	 
		 if(q!=null)q=q.next;
		 }
		 
		 
		return dummyHead;
	        
	    }
	 
	 
	 static boolean printList(ListNode node) 
	    { 
	        while (node != null) { 
	            System.out.print(node.val + " "); 
	            node = node.next; 
	        }
			return true; 
	    } 
	 
	 public static void main(String[] args) {
		ListNode l1Head= new ListNode(1);
		ListNode l12= new ListNode(2);
		ListNode l13= new ListNode(4);
		l1Head.next=l12;
		l12.next=l13;
		l13.next=null;
		
		
		ListNode l2Head= new ListNode(1);
		ListNode l22= new ListNode(3);
		ListNode l23= new ListNode(4);
		l2Head.next=l22;
		l22.next=l23;
		l23.next=null;
		
		printList(mergeTwoLists(l1Head, l2Head));
		
					
		}

	 
}
