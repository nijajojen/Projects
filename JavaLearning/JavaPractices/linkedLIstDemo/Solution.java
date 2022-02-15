package linkedLIstDemo;

import linkedLIstDemo.reorderList.ListNode;

public class Solution {
   
    
    public static void reorderList(ListNode head) {
        int size=0;
		ListNode node = null;
		ListNode head1 = head;
		ListNode head2=null;
		ListNode prev=null;
		while(head1!=null) {
			size++;
			
				node = new ListNode(head1.val);
				if(prev==null) {
					head2=node;
				}
				else {
					prev.next=node;
				}
			prev=node;						 
			
			head1=head1.next;			
		}
		ListNode head22=reverseList(head2);
		 findPattern( head, head22,size);
		
    }
    
 
    
    public static ListNode reverseList(ListNode curr) {
	    if (curr == null || curr.next == null) {
	    	return curr;
	    }
	    ListNode p = reverseList(curr.next);
	    curr.next.next = curr;
	    curr.next = null;
	    return p;
	}
    
    public static ListNode findPattern(ListNode curr1,ListNode curr2,float size) {
		ListNode newPattern=null;
		ListNode newPatternHead=null;
		ListNode previous1=null;
		int length=0;
		float actualLength=(Math.round(size/2)-1);

		while(curr1!=null && curr2!=null && length<=actualLength) {
			
			if(actualLength==0) {
				newPattern=new ListNode(curr1.val);
				newPatternHead=newPattern;
				return newPatternHead;
			}
			
			if(length==actualLength && actualLength%2==0) {
				newPattern=new ListNode(curr1.val);
				if(previous1!=null) {
					previous1.next=newPattern;
					return newPatternHead;
					
				}
			}
			
			newPattern=new ListNode(curr1.val);	
			if(previous1==null) {
				newPatternHead=newPattern;
			}
			if(previous1!=null) {
				previous1.next=newPattern;
				
			}
			previous1=newPattern;
			newPattern=new ListNode(curr2.val);
			if(previous1!=null) {
				previous1.next=newPattern;
				
			}
			
			previous1=newPattern;
			
									
			curr1=curr1.next;
			curr2=curr2.next;
			length++;
		}
		printList(newPatternHead);
		return newPatternHead;				
	}
	
    public static ListNode printList(ListNode patternHead) {
		while(patternHead!=null) {
			System.out.println(patternHead.val);
			patternHead=patternHead.next;
		}
		return patternHead;
	}
    public static void main(String[] args) {
		//ListNode l1head=null;
		ListNode l1head = new ListNode(1);
		//l1head.next=null;
		ListNode l1node2 = new ListNode(2);
		ListNode l1node3 = new ListNode(3);
		ListNode l1node4 = new ListNode(4);
		//ListNode l1node5 = new ListNode(5);
		l1head.next = l1node2;
		l1node2.next = l1node3;
		l1node3.next=l1node4;
		//l1node4.next=l1node5;
		l1node4.next=null;
		reorderList(l1head);
	}
}
