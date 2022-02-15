package linkedLIstDemo;

public class LinkedListDemoCorrectWay {

	
	public static class ListNode{
		
		int data;
		ListNode next;
		ListNode(int d){
			data=d;
			next= null;
		}
		
	}
	
	public static ListNode addTwoNumbers (ListNode l1, ListNode l2) {
		
		ListNode dummyHead= new ListNode(0);
		ListNode p=l1, q=l2, curr=dummyHead;
		int carry=0;
		while(p!=null || q!= null) {
			int x= (p!=null)? p.data:0;
			int y= (q!=null)? q.data:0;
			int sum= carry+x+y;
			
			carry= sum/10;
			curr.next= new ListNode(sum % 10);
			curr=  curr.next;
			
			if(p!=null) p=p.next;
			if(q!=null) q=q.next;
		}
		if(carry>0) {
			curr.next= new ListNode(carry);
		}
		return dummyHead.next;
		
	}
	
	
	static boolean printList(ListNode node) 
    { 
        while (node != null) { 
            System.out.print(node.data + " "); 
            node = node.next; 
        }
		return true; 
    } 
	
	

	public static void main(String[] args) {
		
		ListNode head= new ListNode(5);
		ListNode node2= new ListNode(5);
		ListNode node3= new ListNode(5);
		head.next=node2;
		node2.next= node3;
		node3.next=null;
		
		ListNode head2= new ListNode(6);
		ListNode node22= new ListNode(7);
		ListNode node23= new ListNode(8);
		head2.next=node22;
		node22.next= node23;
		node23.next=null;
		printList(addTwoNumbers ( head, head2));

	}

}
