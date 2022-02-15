package linkedLIstDemo;

import linkedLIstDemo.DeletingANode.ListNode;

public class RemoveListElements {
	
	private static ListNode deleteNode(ListNode l1head, int val) {
		 ListNode pointerHead=l1head;
			ListNode curr =l1head;
			ListNode prev=null;
			boolean statusPrev=true;
			boolean status=true;
	        if(curr==null){
	            return l1head;
	        }
	        if(curr.next==null && curr.val==val){
	            return null;
	        }
	        
			while(curr.next!=null) {
				if(status==true) {
					while(curr.val == val) {
	                    if(curr.next==null&& curr.val==val){
	                        return null;
	                    }
						ListNode newHead= curr.next;
						curr.next=null;
						curr=newHead;
					}
				 status=false;
				 pointerHead=curr;
				}
				else {
				
					if(statusPrev!=false) {
						prev=curr;
					}
					curr=curr.next;
					if(curr.val==val) {
						prev.next=curr.next;
						 statusPrev=false;
					}else {
						statusPrev=true;
					}
					
				}}
			return pointerHead;
			
		
		}
		
	 
	public static ListNode printList(ListNode patternHead) {
		while(patternHead!=null) {
			System.out.println(patternHead.val);
			patternHead=patternHead.next;
		}
		return patternHead;
	}
	
	public static void main(String[] args) {
		ListNode l1head = new ListNode(1);
		ListNode l1node2 = new ListNode(2);
		ListNode l1node3 = new ListNode(2);
		ListNode l1node4 = new ListNode(4);
		ListNode l1node5 = new ListNode(2);
		ListNode l1node6 = new ListNode(3);
		l1head.next = l1node2;
		l1node2.next = l1node3;
		l1node3.next=l1node4;
		l1node4.next=l1node5;
		l1node5.next=l1node6;
		l1node6.next=null;
		deleteNode(l1head,2);

	}

	

}
